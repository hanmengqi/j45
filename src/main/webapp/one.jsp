<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h1>员工信息查询>>><span style="color:red">${one.ename }</span></h1>
    <hr>
    	<h3 align="center">详细信息</h3>
    	<p align="center">员工名称&nbsp;&nbsp;${one.ename }</p>
    	<p align="center">性别&nbsp;&nbsp;&nbsp;${one.egender==1?"男":"女" }</p>
    	<p align="center">年龄&nbsp;&nbsp;&nbsp;${one.eage }</p>
    	<p align="center">所属部门&nbsp;&nbsp;${dname }</p>
    	<p align="center">职位&nbsp;&nbsp;&nbsp;${one.post }</p>
    	<p align="center">电话&nbsp;&nbsp;&nbsp;${one.tel }</p>
    	<p align="center">住址&nbsp;&nbsp;&nbsp;${one.address }</p>
    <hr>
    <a onclick="history.back()">返回${dname }</a>
  </body>
</html>