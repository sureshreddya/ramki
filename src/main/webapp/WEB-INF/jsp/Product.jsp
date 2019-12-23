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
</head>
<body>
<%@ include file="defaults/Header.jsp"%>
<%Collection<Product> products=(ArrayList<Product>)request.getAttribute("Products");
boolean canModify=false;
if(roleGroup!=null && roleGroup.equals("Admin")){
	canModify=true;
}
%>

	<div class="product-container">
		<%if(canModify) {%>
			<button class="btnCreate"><a href="product/create">Create</a></button>
		<%} %>
		<div class="filter-container">
		</div>
		<h3>Product Details</h3>
		<div class="table-container">
			<table class="product-table">
				<thead>
					<tr>
						<th style="padding:10px 10px;">SNo.</th>
						<th style="padding:10px 100px;text-align:left">Product Name</th>
						<th style="padding:10px 10px;">Manufacturer</th>
						<th style="padding:10px 10px;">Available stock</th>
						<th style="padding:10px 10px;">sold</th>
						<th style="padding:10px 10px;">Rs.(INR)</th>
						<%if(canModify) {%>
							<th style="padding:10px 10px;">Action</th>
						<%} %>
					</tr>
				</thead>
				<tbody>
					<%if(products!=null){
						int serialNumber=0;
						for(Product product:products){%>
							serialNumber++;
						<tr>
							<td><%=serialNumber %>
							<td><%=product.getProductName()+""+product.getModelNumber()%></td>
							<td><%=product.getManufacturer()%></td>
							<td><%=product.getAvailablePieces() %></td>
							<td><%=product.getPrice() %></td>
							<%if(canModify) {%>
								<td><a href="product/edit/{<%=product.getSerialNumber()%>}"><i class="edit-icon"></i></a>,
								<a href="product/delete/{<%=product.getSerialNumber()%>}"><i class="delete-icon"></i></a></td>
							<%} %>
						</tr>
						<%}
					}%>
				</tbody>
			</table>	
		</div>
	</div>

<%@ include file="defaults/Footer.jsp" %>
</body>
</html>