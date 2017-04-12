<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>


<html>
<head>

    <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="https://fonts.googleapis.com/css?family=Open+Sans|Raleway|Candal">
    <link rel="stylesheet" type="text/css" href="<c:url value="/css/style.css"/>"/>


<title><tiles:insertAttribute name="title" /></title>

</head>

<body>

	<tiles:insertAttribute name="menu" />
	<script src="<c:url value="/js/jquery.min.js"/>"></script>
    <script src="<c:url value="/js/jquery.easing.min.js"/>"></script>
    <script src="<c:url value="/js/bootstrap.min.js"/>"></script>
    <script src="<c:url value="/js/custom.js"/>"></script>
    <tiles:insertAttribute name="body" />

	




</body>




</html>