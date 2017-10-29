<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
<head>
	<meta http-equiv="content-Type" content="text/html; chartset=ISO-8859-1">
	<title>Departments List</title>
	<link href="<c:url value="/static/css/bootstrap.css" />"
		rel="stylesheet">
	<link href="<c:url value="/static/css/app.css"/>" rel="stylesheet">
	<link>
</head>

<div class="generic-container">
	<table class="table table-hover">
		<!--  Pendiente de agregar table-hover -->

		<thead>
			<tr>
				<th>Departamento</th>
				<th width="100"></th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${department}" var="department">
				<tr>
					<td>${department.description}</td>
					<td></td>
				</tr>
				
			</c:forEach>
		
		</tbody>
	</table>

</div>


</html>