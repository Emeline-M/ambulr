<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />


<!-- CSS Files -->
<link rel="stylesheet" href="<c:url value="/css/main.css" />">
<link rel="stylesheet" href="<c:url value="/css/inscription.css" />">
<link rel="stylesheet" href="<c:url value="/css/pageaccueil.css" />">
<link rel="stylesheet" href="<c:url value="/css/pagemalaise.css" />">
<link rel="stylesheet"
	href="<c:url value="/css/pageurgenceindex.css" />">
<link rel="stylesheet" href="<c:url value="/css/pageurgences.css" />">



<title><tiles:insertAttribute name="title" /></title>

</head>

<body>

	<tiles:insertAttribute name="menu" />
	<tiles:insertAttribute name="body" />

</body>

</html>