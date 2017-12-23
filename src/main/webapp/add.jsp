<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h1>${dname }>>>添加新员工</h1>
    <hr>
    <h3 align="center">详细信息</h3>
    <form action="add.do" method="post" align="center">
    	部门&nbsp;&nbsp;&nbsp;<select name="myDept">
    						 	<c:forEach items="${allDept }" var="de">
    						 		<option value="${de.deptId }">${de.deptName }</option>
    						 	</c:forEach>	
    						 </select>
    	员工名称&nbsp;&nbsp;<input type="text" name="ename"><br>
    	性别&nbsp;&nbsp;&nbsp;<input type="radio" name="egender" value="1" checked="checked">男
    						 <input type="radio" name="egender" value="0">女<br>
    	年龄&nbsp;&nbsp;&nbsp;<input type="number" max="100" min="0" name="eage">岁<br>
    	职位&nbsp;&nbsp;&nbsp;<input type="text" name="post"><br>
    	电话&nbsp;&nbsp;&nbsp;<input type="number" maxlength="11" name="tel"><br>
    	住址&nbsp;&nbsp;&nbsp;<input type="text" name="address"><br>
    	
    	<input type="reset" value="重置">&nbsp;&nbsp;&nbsp;
    	<input type="submit" value="添加">
    </form>
  </body>
</html>