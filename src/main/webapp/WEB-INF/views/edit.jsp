<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix = "fmt" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Editar Venta</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1"
	crossorigin="anonymous">

<link href="${pageContext.request.contextPath}/resources/css/estilo.css" rel="stylesheet">
</head>
<body>
	<div class="container">
		<h1>Editando Venta</h1>
		<h2>Número <c:out value="${venta.getId()}"></c:out></h2>
		<h3>Número Boleta <c:out value="${venta.getNumeroBoleta()}"></c:out></h3>
		<p>Fecha Venta: <c:out value="${venta.getFecha()}"></c:out></p>
		<p>Cliente: <c:out value="${venta.getCliente().getNombre()}"></c:out> <c:out value="${venta.getCliente().getApellido()}"></c:out></p>
		<h2>Monto de Venta <fmt:formatNumber value="${venta.getMonto()}" currencySymbol="$" pattern = "$ ###,###.#" type="currency"></fmt:formatNumber></h2>
	</div>

</body>
</html>