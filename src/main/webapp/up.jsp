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
    <h1>${dname }>>>修改员工</h1>
    <hr>
    <h3 align="center">详细信息</h3>
    <form action="up2.do" method="post" align="center">
    	<input type="hidden" name="eid" value="${eee.eid }"/>
    	部门&nbsp;&nbsp;&nbsp;<select name="myDept">
    						 	<c:forEach items="${allDept }" var="de">
    						 		<c:if test="${de.deptId==eee.deptId }">
    						 			<option value="${de.deptId }" selected="selected">${de.deptName }</option>
    						 		</c:if>
    						 		<c:if test="${de.deptId!=eee.deptId }">
    						 			<option value="${de.deptId }">${de.deptName }</option>
    						 		</c:if>
    						 	</c:forEach>	
    						 </select><br>
    	员工名称&nbsp;&nbsp;<input type="text" name="ename" value="${eee.ename }"><br>
    	性别&nbsp;&nbsp;&nbsp;<c:if test="${eee.egender==1 }">
    						 	<input type="radio" name="egender" value="1" checked="checked">男
    						 	<input type="radio" name="egender" value="0">女<br>
    						 </c:if>
    						 <c:if test="${eee.egender==0 }">
    						 	<input type="radio" name="egender" value="1">男
    						 	<input type="radio" name="egender" value="0" checked="checked">女<br>
    						 </c:if>
    	年龄&nbsp;&nbsp;&nbsp;<input type="number" max="100" min="0" name="eage" value="${eee.eage }">岁<br>
    	职位&nbsp;&nbsp;&nbsp;<input type="text" name="post" value="${eee.post }"><br>
    	电话&nbsp;&nbsp;&nbsp;<input type="number" maxlength="11" name="tel" value="${eee.tel }"><br>
    	住址&nbsp;&nbsp;&nbsp;<input type="text" name="address" value="${eee.address }"><br>
    	
    	<input type="reset" value="重置">&nbsp;&nbsp;&nbsp;
    	<input type="submit" value="修改">
    </form>
  </body>
</html>