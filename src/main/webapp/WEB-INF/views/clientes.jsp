<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Clientes</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1"
	crossorigin="anonymous">

<link href="${pageContext.request.contextPath}/resources/css/estilo.css" rel="stylesheet">
</head>
<body>
<div class="container">
		<h1>Listado de Clientes</h1>

		<table class="table">
			<thead class="table-info">
				<tr>
					<th scope="col">#</th>
					<th scope="col">Nombre</th>
					<th scope="col">Dirección</th>
					<th scope="col">WebSite</th>
					<th scope="col">Límite de Credito</th>
					<th scope="col">Acción</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="c" items="${clientes}">
					<tr>
						<th><c:out value="${c.getId()}"></c:out></th>
						<td><c:out value="${c.getNombre()}"></c:out></td>
						<td><c:out value="${c.getDireccion()}"></c:out></td>
						<td><c:out value="${c.getWebsite()}"></c:out></td>
						<td><c:out value="${c.getCredito()}"></c:out></td>
						<td>
							<div class="btn-group" role="group">
								<a href="${pageContext.request.contextPath}/editCliente/${c.getId()}" class="btn btn-warning">Editar</a>
  								<button type="button" class="btn btn-danger">Borrar</button>
  							</div>
						</td>
					</tr>
				</c:forEach>
			</tbody>
			<tbody>

</body>
</html>