<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SignUP</title>
 <style type="text/css">
	<%@ include file="/WEB-INF/css/SignUp_css.css"%>
 </style>
</head>
<body>
<%@ include file="defaults/Header.jsp" %>
<div class="signuppopup" id="signupID">
			<form action="/signUp" cssClass="model-content1 animate1" method="post">
			<div class="container1">
				<label for="userName">E-Mail/Mobile Number:</label>
				<input type="text" name="username">
				<label for="Password">Password:</label>
				<input type="password" name="password"/>
				<label for="cfnpwd">Confirm Password</label>
				<input type="password" name="cfnpwd">
				<input type="submit" name="Submit">
			</div>
			</form>
		</div> 
</div>
</body>
</html>