package org.java.web;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.java.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 部门信息
 * @author monkey
 *
 */
@Controller
public class DeptController {

	@Autowired
	private DeptService service;
	
	@RequestMapping("/getAllDept")
	public String getAllDept(HttpServletRequest req,HttpSession ses){
		List<Map<String, Object>> list=service.getAllDept();
		ses.setAttribute("allDept", list);
		return "/allDept";
	}
}
