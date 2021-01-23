<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Editar Cliente</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1"
	crossorigin="anonymous">

<link href="${pageContext.request.contextPath}/resources/css/estilo.css" rel="stylesheet">

</head>
<body>
<div class="container">
	<h1>Editar Cliente</h1>
	
	<form action="${pageContext.request.contextPath}/editCliente/${cliente.getId()}" method="POST">
		<div class="mb-3 row">
			<label class="col-sm-2 col-form-label">Id:</label>
			<div class="col-sm-10">
				<input type="text" readonly class="form-control-plaintext" id="id" value="${cliente.getId()}">
			</div>
		</div>
		<div class="mb-3 row">
			<label class="col-sm-2 col-form-label" for="nombre">Nombre:</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" name="nombre" value="${cliente.getNombre()}">
			</div>
		</div>
		<div class="mb-3 row">
			<label class="col-sm-2 col-form-label" for="direccion">Dirección:</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" name="direccion" value="${cliente.getDireccion()}">
			</div>
		</div>
		<div class="mb-3 row">
			<label class="col-sm-2 col-form-label" for="website">WebSite:</label>
			<div class="col-sm-10">
				<input type="url" class="form-control" name="website" value="${cliente.getWebsite()}">
			</div>
		</div>
		<div class="mb-3 row">
			<label class="col-sm-2 col-form-label" for="credito">Crédito:</label>
			<div class="col-sm-10">
				<input type="number" class="form-control" name="credito" value="${cliente.getCredito()}">
			</div>
		</div>
		<div class="mb-3">
			<a href="${pageContext.request.contextPath}/clientes" class="btn btn-success">Volver</a>
    		<button type="submit" class="btn btn-primary">Guardar</button>
    		
  		</div>
	</form>
	
</div>
</body>
</html>