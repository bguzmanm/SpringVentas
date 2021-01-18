<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix = "fmt" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registro de Ventas</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1"
	crossorigin="anonymous">

<link href="${pageContext.request.contextPath}/resources/css/estilo.css" rel="stylesheet">

</head>
<body>
	<div class="container">
		<h1>Registro de Ventas</h1>

		<table class="table">
			<thead class="table-info">
				<tr>
					<th scope="col">#</th>
					<th scope="col">Boleta</th>
					<th scope="col">Fecha</th>
					<th scope="col">Cliente</th>
					<th scope="col">Monto</th>
					<th scope="col">Acción</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="v" items="${ventas}">
					<tr>
						<th><c:out value="${v.getId()}"></c:out></th>
						<td><c:out value="${v.getNumeroBoleta()}"></c:out></td>
						<td><c:out value="${v.getFecha()}"></c:out></td>
						<td><c:out value="${v.getCliente().getNombre()}"></c:out> <c:out value="${v.getCliente().getApellido()}"></c:out></td>
						<td><fmt:formatNumber value="${v.getMonto()}" currencySymbol="$" pattern = "$ ###,###.#" type="currency"></fmt:formatNumber></td>
						<td>
							<div class="btn-group" role="group">
								<a href="${pageContext.request.contextPath}/edit/${v.getId()}" class="btn btn-warning">Editar</a>
  								<button type="button" class="btn btn-danger">Borrar</button>
  							</div>
						</td>
					</tr>
				</c:forEach>
			</tbody>
					
		</table>


	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW"
		crossorigin="anonymous"></script>
</body>
</html>