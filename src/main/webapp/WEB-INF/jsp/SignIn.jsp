<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<%@ include file="defaults/Header.jsp"%>
<div class="form_control">
	<h3 style="text-align: center;">Login</h3>
	<br>
	<div class="signInpopup" id="signInid">
	<span class="error">${error}</span>
		<form:form action="/login" cssClass="modal-content animate" modelAttribute="SignIn">
			<!-- <div class="imgcontainer">
	              <span onclick="document.getElementById('signInid').style.display='none'" class="close" title="Close">&times;</span>
	            </div> -->

				<label for="username">Email/Mobile Number: </label> 
				<form:input path="userName"/>
				 <label for="password">Password:</label>
				 <form:password path="password"/>
				 <a href="/forgotPassword" style="font-size:15px;">Forgot Password ?</a>
			<div style="text-align: center;">
				<input type="submit" name="Login" value="Login" class="button submit"> 
				&nbsp;&nbsp;&nbsp; 
				<input type="reset" class="clear button" value="Clear">
			</div>
		</form:form>
	</div>
</div>
</body>
</html>