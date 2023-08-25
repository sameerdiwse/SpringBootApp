<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<style type="text/css">

.tblAlign{
margin-top:100px;
margin-left: auto;
margin-right: auto;
background-color: olive;
}

table, th,td{
border: 2px solid black; 
}
</style>
</head>
<body>
${message}
<table class="tblAlign">

<tr>
<caption><big>User Data</big></caption>
	<th>id</th>
	<th>name</th>
	<th>email</th>
	<th>gender</th>

	
	<!-- <th>Remove</th>
	<th>Edit</th>-->
    <th colspan="2">Edit</th>
 </tr>
<c:forEach var = "user" items = "${UserList}">
<tr>
<td><c:out value="${user.id}"></c:out></td>
<td><c:out value="${user.userName}"></c:out></td>
<td><c:out value="${user.userEmail}"></c:out></td>
<td><c:out value="${user.gender}"></c:out></td>


</tr>
</c:forEach>
</table>
<td><a href = "loginto" >back to login</a></td>
</body>
</html>