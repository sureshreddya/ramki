
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
        <%@ page import="java.util.ArrayList"  %>
<!DOCTYPE div PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
     <link rel="icon" href="<c:url value="/WEB-INF/images/icon.jpg"/>">
    <title>Welcome</title>
    <style type="text/css">
	<%@ include file="/WEB-INF/css/header_script.css"%>
    </style>
    <script type="text/javascript">
	<%@ include file="/WEB-INF/js/header/header_script.js"%>
 </script>
</head>
<body>
	<div class="body_Container">
        <div class="navStaticbar">
            <div class="navstaticbarleft">
                <ul>
                    <li><a href="/">Home</a></li>
                    <li><a href="#">Product</a></li>
                    <li><a href="#">Contact</a></li>
                    <li><a href="#">About US</a></li>
                </ul>
            </div>
            <div class="navstaticbarright">
                <ul>
                    <li><a href="#"  onclick="openPopUP('signup')">SignUp</a></li>
                    <li>|</li>
                    <li><a href="#" onclick="openPopUP('login')">Sign-In</a></li>
                </ul>
            </div>
        </div>
     </div>
</body>
</html>