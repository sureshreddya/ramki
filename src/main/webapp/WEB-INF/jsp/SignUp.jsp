<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SignUP</title>
<style type="text/css">
	.SignUp{
		text-align:center;
		position:center;
	}
</style>
</head>
<body>
<%@ include file="defaults/Header.jsp" %>
<div class="form_control">
	<h3 style="text-align: center;">Enter Details</h3>
	<div class="signuppopup">
		<form:form action="/signUp"  id="signupID" modelAttribute="SignUp">
		<div class="imgcontainer">
	             <a href="/profilePic"><img src="/${userDetails.firstName}/profile.jpg "></a>
	     </div> 
		<div >
			<label for="lastName">First Name:</label>
			<form:input path="firstName"/>
			
			<label for="lastName">Last Name:</label>
			<form:input path="lastName"/>
			
			
			<label for="emailID">E-Mail:</label>
			<form:input path="emailID"/>
			
			<label for="mobileNumber">Mobile Number:</label>				
			<form:input path="mobileNumber"/>
			
			<label for="Password">Password:</label>
			<form:password path="password"/>
			
			<label for="cfnpwd">Confirm Password</label>
			<form:password path="confirmPassword"/>
		</div>
		 <div style="text-align: center;">
			 	<input type="submit" name="SignUp" value="SignUp" class="button submit"  >
			 	&nbsp;&nbsp;&nbsp;
		        <input type="reset" class="clear button"  >
	     </div>
		</form:form>
	</div>
</div>
</body>
</html>