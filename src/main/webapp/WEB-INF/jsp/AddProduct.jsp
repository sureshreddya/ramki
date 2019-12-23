<%@page import="java.util.Collection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.gprs.entity.product.Product" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Products</title>
<style type="text/css">
	<%@ include file="/WEB-INF/css/product.css"%>
    </style>
    <script type="text/javascript">
	<%@ include file="/WEB-INF/js/product/Product_script.js"%>
 </script>
</head>
<body>
<%@ include file="defaults/Header.jsp"%>
<div class="form-container">
	<h2>Add Product</h2>
	<div class="form-data-container">
		<div class="form-control">
		<form:form action="/addproduct" method="post" modelAttribute="product">
			<label for="name">1.Product Name:</label>
			<form:input type="text"  path="productName"/>
			
			<label for="productOwner">2.Product Owner </label>
			<form:input type="text" path="manufacturer"/>
			
			<label for="productType">3.Product Type</label>
			<form:input type="text" path="productType"/>
			
			<label for="modelNumber">4.Model Number</label>
			<form:input type="text" path="modelNumber"/>
			
			<label for="price">5.Price </label>
			<form:input type="text" path="price"/>
			
			<label for="priceUnit">5.Price Unit</label>
			<form:input type="text" path="priceUnit"/>
			
			<label for="availablePieces">6.Available Pieces </label>
			<form:input type="text" path="availablePieces"/>
			
			<a href="/addAgent" onclick="addAgent(this)">Select Seller(s)</a>
			<div class="table-container" id="selectSeller" style="display:none;">
				<table>
					<thead>
						<tr>
							<th>Account Number</th>
							<th>Agent Name</th>
							<th>Address</th>
							<th>Country</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td></td>
							<td></td>
							<td></td>
							<td></td>
						</tr>
					</tbody>
				</table>
			</div>
		</form:form>	
		</div>
	</div>
</div>



<%@ include file="defaults/Footer.jsp" %>
</body>
</html>