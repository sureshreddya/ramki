<%@page import="java.util.List"%>
<%@page import="com.gprs.entity.PriceUnit" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Products</title>
</head>
<body>
<%@ include file="Header.jsp"%>
<div class="body_Container">
<button class="btnCreate"><a href="/priceUnitLoad">Create</a></button>	
<%int serialNumber=0;%>
<%
List<PriceUnit> priceUnits=(List<PriceUnit>)request.getAttribute("priceUnits"); 
if(priceUnits!=null && priceUnits.size() > 0){ %>
	<div class="table-container" style="margin:0 auto; width:90%">
		<table class="table" style="width:100%">
			<thead class="tablehead">
				<tr class="row">
					<th style="width:2%">SNo.</th>
					<th style="width:8%">Price Unit</th>
					<th style="width:10%">Convert Unit</th>
					<th style="width:10%">Con's Rate</th>
					<th style="width:10%">Start Date</th>
					<th style="width:10%">End Date</th>
					<th style="width:20%">last Updated</th>
					<th style="width:10%">last Updated By</th>
				</tr>
			</thead>
			<tbody class="tablebody">
			<%
			for(PriceUnit priceUnit: priceUnits){
				serialNumber++;
			%>
				<tr class="row">
					<td  style="width:2%"><%=serialNumber %></td>
					<td  style="width:8%"><%=priceUnit.getPriceUnit() %></td>
					<td  style="width:10%"><%=priceUnit.getConvertUnit() %></td>
					<td  style="width:10%"><%=priceUnit.getConversionRate() %></td>
					<td  style="width:10%"><%=priceUnit.getStartDate() %></td>
					<td  style="width:10%"><%=priceUnit.getEndDate() %></td>
					<td  style="width:20%"><%=priceUnit.getLastUpdated() %></td>
					<td  style="width:10%"><%=priceUnit.getLastUpdatedBy() %></td>
  	<td  style="width:10%"><a href="/edit/<%=priceUnit.getPriceUnitID() %>"><img src="../../../images/Edit_icon.png"width="25px" height="25px"/></a>&nbsp;&nbsp;
                  <a href="/delete/<%=priceUnit.getPriceUnitID()%>"><img src="../../../images/Delete-icon.jpg" width="25px" height="25px"></a></td>
				</tr>
			<%}%>
			</tbody>
		</table>
	</div>
<% }%>
</div>
<%@ include file="Footer.jsp" %>
