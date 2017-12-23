package org.java.web;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.java.entity.Page;
import org.java.service.DeptService;
import org.java.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmpController {

	@Autowired
	private EmpService service;
	
	@Autowired
	private DeptService service2;
	
	@RequestMapping("/getEmps")
	public String getEmps(HttpServletRequest req,HttpSession ses,int did,String dname){
		Page p=new Page();
		p.setCount(service.getCount(did));
		int start=(p.getIndex()-1)*p.getSize();
		int size=p.getSize();
		
		List<Map<String, Object>> list=service.getAllEmpById(did, start, size);
		ses.setAttribute("emps", list);
		ses.setAttribute("p", p);
		ses.setAttribute("dname", dname);
		ses.setAttribute("did", did);
		
		return "/allEmp";
	}
	
	@RequestMapping("/change")
	public String change(HttpServletRequest req,HttpSession ses,int did,String dname,int index){
		Page p=(Page) ses.getAttribute("p");
		if (index<=1) {
			p.setIndex(1);
		}
		if (index>=p.getMaxPage()) {
			p.setIndex(p.getMaxPage());
		}
		int start=(p.getIndex()-1)*p.getSize();
		int size=p.getSize();
		List<Map<String, Object>> list=service.getAllEmpById(did, start, size);
		ses.setAttribute("emps", list);
		ses.setAttribute("p", p);
		ses.setAttribute("dname", dname);
		ses.setAttribute("did", did);
		return "/allEmp";
	}
	
	@RequestMapping("/getOne")
	public String getOne(HttpServletRequest req,HttpSession ses,String dname,int eid){
		Map<String, Object> map=service.getOne(eid);
		ses.setAttribute("one", map);
		ses.setAttribute("dname", dname);
		return "/one";
	}
	
	@RequestMapping("/del")
	public String del(HttpServletRequest req,HttpSession ses,int eid,int did,String dname){
		service.del(eid);
		return getEmps(req, ses, did, dname);
	}
	
	@RequestMapping("/add")
	public String add(HttpServletRequest req,HttpSession ses){
		String name=req.getParameter("ename");
		Integer gender=Integer.parseInt(req.getParameter("egender"));
		Integer age=Integer.parseInt(req.getParameter("eage"));
		String post=req.getParameter("post");
		String tel=req.getParameter("tel");
		String address=req.getParameter("address");
		Integer deid=Integer.parseInt(req.getParameter("myDept"));
		service.add(name, gender, age, post, tel, address, deid);
		List<Map<String, Object>> list=service2.getAllDept();
		String dname="";
		for (Map<String, Object> map : list) {
			if (deid==map.get("deptId")) {
				dname=(String) map.get("deptName");
			}
		}
		return getEmps(req, ses, deid, dname);
	}
	
	@RequestMapping("/up")
	public String up(HttpServletRequest req,HttpSession ses,int eid,int did,String dname){
		Map<String, Object> map=service.getOne(eid);
		ses.setAttribute("eee", map);
		ses.setAttribute("did", did);
		ses.setAttribute("dname", dname);
		return "/up";
	}
	
	@RequestMapping("/up2")
	public String up2(HttpServletRequest req,HttpSession ses){
		Integer eid=Integer.parseInt(req.getParameter("eid"));
		String name=req.getParameter("ename");
		Integer gender=Integer.parseInt(req.getParameter("egender"));
		Integer age=Integer.parseInt(req.getParameter("eage"));
		String post=req.getParameter("post");
		String tel=req.getParameter("tel");
		String address=req.getParameter("address");
		Integer deid=Integer.parseInt(req.getParameter("myDept"));
		service.update(eid, name, gender, age, post, tel, address, deid);
		List<Map<String, Object>> list=service2.getAllDept();
		String dname="";
		for (Map<String, Object> map : list) {
			if (deid==map.get("deptId")) {
				dname=(String) map.get("deptName");
			}
		}
		return getEmps(req, ses, deid, dname);
	}
	
	
	
	
	
	
	
	
	
	
}
