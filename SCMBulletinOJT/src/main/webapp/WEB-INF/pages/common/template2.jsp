<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<link rel="icon" href="/resources/img/bulletinlogo.png">
<title>Bulletin Board</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
  href='<c:url value="/resources/plugins/fontawesome-free/css/all.min.css"/>'>
<link rel="stylesheet"
  href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
<link rel="stylesheet"
  href="<c:url value="/resources/plugins/icheck-bootstrap/icheck-bootstrap.min.css"/>">
<link rel="stylesheet"
  href="<c:url value="/resources/css/adminlte.min.css"/>">
<link
  href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700"
  rel="stylesheet">
</head>
<body class="hold-transition login-page">
  <tiles:insertAttribute name="body" />
</body>
</html>