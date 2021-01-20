<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login de Ventas</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1"
	crossorigin="anonymous">

<link href="${pageContext.request.contextPath}/resources/css/estilo.css"
	rel="stylesheet">
</head>
<body>
	<section class="container-fluid">
		<section class="row justify-content-center">
			<section class="col-12 col-sm-6 col-md-4">
				<form action="${pageContext.request.contextPath}/login" id="basic-form" class="form-container" method="post" name="Validalogin">
					<div class="form-group">
						<h4 class="text-center font-weight-bold">Login</h4>
						<label for="InputEmail1">Usuario</label> <input type="text"
							class="form-control" id="user" name="user" required>
					</div>
					<div class="form-group">
						<label for="InputPassword1">Clave</label> <input type="password"
							class="form-control" id="pass" name="pass" required>
					</div>
					<button type="submit" 
						class="btn btn-primary btn-block">Entrar</button>
					<div class="form-footer"></div>
				</form>

			</section>
		</section>
	</section>


</body>
</html>