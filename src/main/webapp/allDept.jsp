<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">部门信息</h1>
	
	<table align="center" width="60%" border="1">
		<tr>
			<th>部门编号</th>
			<th>部门名称</th>
			<th>操作</th>
		</tr>
		<c:forEach items="${allDept }" var="d">
			<tr align="center">
				<td>${d.deptId }</td>
				<td>${d.deptName }</td>
				<td>
					<a href="getEmps.do?did=${d.deptId }&dname=${d.deptName }">查看</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>