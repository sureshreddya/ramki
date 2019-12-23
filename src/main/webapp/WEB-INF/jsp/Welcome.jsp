<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<style type="text/css">
.imgslide{
	display:none;
	width: 80%;
    height: 82%;
    margin: auto;
}

</style>
</head>
<body>
<%@ include file="defaults/Header.jsp"%>

<%@ include file="defaults/OptionsSections.jsp" %>
<div class="welcomepagecontainer">
	<div class="welcomepage">
		<img alt="" class="imgslide" src="/images/carlous-img2.jpg">
		<img alt="" class="imgslide" src="/images/carlous-img1.jpg">
		<img alt="" class="imgslide" src="/images/carlous-img3.jpg">
		<img alt="" class="imgslide" src="/images/carlous-img4.jpg">
		<img alt="" class="imgslide" src="/images/carlous-img5.jpg">
	</div>
</div>
<%@ include file="defaults/Footer.jsp" %>


<script type="text/javascript">
	var myIndex=0;
	carousel();
	function carousel(){
		var i;
		var imgs=document.getElementsByClassName("imgslide");
		for(i=0;i<imgs.length;i++){
			imgs[i].style.display="none";
			}
		myIndex++;
		if (myIndex > imgs.length) {myIndex = 1}    
		imgs[myIndex-1].style.display = "block";  
		  setTimeout(carousel, 3000); // Change image every 3 seconds
		}
</script>
</body>

</html>