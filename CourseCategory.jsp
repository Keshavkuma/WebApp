<%@page language="java" contentType="text/html"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="InsertCourseCategory" method="post">
<table align="center">
	<tr bgcolor="pink">
		<td align="center" colspan="2"><h3>Course Category Detail</h3></td>
	</tr>
	<tr bgcolor="cyan">
		<td>Advance Java</td>
		<td><input type="text" name="advanceJava"/></td>
	</tr>
	<tr bgcolor="cyan">
		<td>Core java</td>
		<td><textarea rows="5" cols="30" name="coreJava"></textarea></td>
	</tr>
	
</table>
</form>

<table align="center">
	<tr bgcolor="pink">
		<td>Advance Java</td>
		<td>Corejava</td>
		
	</tr>
	<c:forEach items="${CourseCategory}" var="coursecategory">
	<tr bgcolor="cyan">
		<td>${coursecategory.advanceJava}</td>
		<td>${coursecategory.coreJava}</td>
		
		
	</tr>
	</c:forEach>
</table>

</body>
</html>