<%@ page language="java" contentType="text/html; charset=UFT-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f" %>
<jsp:useBean id="Usuario" scope="request" type="model.Usuario"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<title>Usuário encontrado</title>
</head>
<body>
	<h1>Usuário encontrado com sucesso!</h1>
	<hr/>
	ID: <c:out value="${Usuario.id}"></c:out> <br>
	Nome: <c:out value="${Usuario.nome}"></c:out> <br>
	Email: <c:out value="${Usuario.email}"></c:out> <br>
</body>
</html>