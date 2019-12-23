
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
    
     <link rel="icon" href="<c:url value="/images/icon.jpg"/>">
    <title>Welcome</title>
    <style type="text/css">
	<%@ include file="/WEB-INF/css/header_script.css"%>
    </style>
    <script type="text/javascript">
	<%@ include file="/WEB-INF/js/header/header_script.js"%>
 </script>
 <script
  src="https://code.jquery.com/jquery-3.4.1.js"
  integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
  crossorigin="anonymous"></script>
</head>
<%@include file="/WEB-INF/jsp/defaults/GprsComman.jsp" %>
<body>
	<div class="body_Container">
        <div class="navStaticbar" style="width:100%;height:10vh">
           <div class="navstaticbarleft" >
                <%--  <ul>
                    <li><a href="/">Home</a></li>
                    <li><a href="/productPage">Products</a></li>
                    <%if(roleGroup!=null && roleGroup.equals("admin")){ %>
                    	<li><a href="/admin/mantainInventory">Inventory</a></li>
                    	<li><a href="/admin/maintainUsers">Users</a></li>
                    <%} %>
                    <li><a href="/contact">Contact</a></li>
                    <li><a href="/admin">About US</a></li>
                </ul>
                --%>
	         <a href="/"><img alt="" src="/images/Go-Green.png" style="width:25%;height:10vh;margin-left: 9vw;"></a>
            </div> 
            <%if(user==null){ %>
            <div class="navstaticbarright">
                   <a href="/loadSignUp">SignUp</a>
                    |
                   <a href="/signIn">Sign-In</a>
            </div>
            <%}else{ %>
	           <div class="navstaticbarright">
	            	<% userName=user.getFirstName();%>
	           		<img alt="" src="/images/login_icon.png" style="width:25px;height:22px;"><a href="/profile"><%=userName %></a>
	                <img alt="" src="/images/LogOut_icon.png" style="width:25px;height:22px;"><a href="/logOut">logout</a>
                    
	           	</div><%} %>
        </div>
        <!-- <div class="border-bottom" style="border-bottom: 3px solid black;border-collapse: collapse; "></div> -->
</div>