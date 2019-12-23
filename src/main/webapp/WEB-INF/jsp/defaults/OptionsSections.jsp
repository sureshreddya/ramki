<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
 <%@page import="com.gprs.entity.user.User" %>
<%User users=(User)session.getAttribute("User");
String roleGroup="";
if(users!=null){
	roleGroup=users.getRoleGroup();
}
%>
<%boolean adminFlag=false;
if(roleGroup!=null && roleGroup.equals("Admin")){
	adminFlag=true;
}
%>
<div class="optionsSections">
	<span style="font-size:30px;cursor:pointer" onclick="openNav()">&#9776;</span>
	<div class="rows" id="navbar" style="display:none;">
	<ul>
		<li><a href="/">Home</a></li>
		<li><a href="/productPage">Products</a></li>
		<!-- Admin options -->
		<%if(adminFlag){ %>
		<li><a href="#">sales</a></li>
		<li><a href="#" onclick="maintain(this,'uldiv')">maintain</a>
			<ul style="display:none;" id="uldiv">
				<li style="font-size: 15px;"><a href="/productPage">Products</a></li>
				<li style="font-size: 15px;"><a href="/maintainPriceUnit">Currency Conversion</a></li>
				<li style="font-size: 15px;"><a href="#">Create Offers</a></li>
				<li style="font-size: 15px;"><a href="/users">Maintain User</a></li>
			</ul>
		</li>
		<%}else{ %>
			<li><a href="/profile">Profile</a></li>
			<li><a href="#">Orders</a></li>
			<li><a href="#">feedback</a></li>
		<%} %>
	</ul>		
	</div>
</div>

<script type="text/javascript">

function maintain(thsu,ulName){
	var name =ulName;
	if(document.getElementById(name).style.display=="block"){
		document.getElementById(name).style.display="none";
	}else{
		document.getElementById(name).style.display="block"
	}
}
function openNav(){
	if(document.getElementById("navbar").style.display=="block"){
		document.getElementById("navbar").style.display="none";	
	}else{
		document.getElementById("navbar").style.display="block";
	}
}
</script>