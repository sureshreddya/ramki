<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>



<%@ include file="Header.jsp"%>
<%@ include file="OptionsSections.jsp" %>
<div class="form-container" style="width:100%;margin:0px auto;">
	<div class="form-data-container" style="width:100%;margin:0px auto;">
		<div class="form-control" style="width: 70%;">
		<h2>Add Product</h2>
		<form:form action="/priceUnitInsert" method="post" modelAttribute="priceUnitVO">
		<table>
			<tr>
				<td style="width:4%"><label for="priceUnit">1.Price Unit:</label></td>
				<td style="width:20%"><form:input type="text"  path="priceUnit" cssStyle="width: 30%;padding: 12px 5px; border-radius: 5px;"/></td>
			</tr>
			
			<tr>
				<td style="width:4%"><label for="convertUnit">2.Convert Unit </label></td>
				<td style="width:20%"><form:input type="text" path="convertUnit" cssStyle="width: 30%;padding: 12px 5px;border-radius: 5px;"/></td>
			</tr>
			<tr>
				<td style="width:4%"><label for="conversionRate">3.Conversion Rate</label></td>
				<td style="width:20%"><form:input type="text" path="conversionRate" cssStyle="width: 30%;padding: 12px 5px;border-radius: 5px;"/></td>
			</tr>
			<tr>
				<td style="width:4%"><label for="startDate">5.Start Date</label></td>
				<td style="width:20%"><form:input type="text" path="startDate" cssStyle="width: 30%;padding: 12px 5px;border-radius: 5px;"/></td>
			</tr>
			<tr>
				<td style="width:4%"><label for="endDate">4.End Date </label></td>
				<td style="width:20%"><form:input type="text" path="endDate" cssStyle="width: 30%;padding: 12px 5px;border-radius: 5px;"/></td>
			</tr>
			<tr>
				<td style="width:4%"><label for="country">6.Country</label></td>
				<td style="width:20%"><form:input type="text" path="country" cssStyle="width: 30%;padding: 12px 5px;border-radius: 5px;"/></td>
			</tr>
			<tr>
				<td><input type="submit" class="button Create" value="Submit"/> &nbsp;&nbsp; &nbsp; &nbsp; <input type="reset" value="Clear" class="button clear"/></td>
			</tr>
			</table>
		</form:form>	
		</div>
	</div>
</div>
<%@ include file="Footer.jsp"%>
