<%@include file="defaults/Header.jsp" %>
<%@ include file="defaults/OptionsSections.jsp" %>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
 <%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<div class="table-container" style="margin:0 auto; width:90%">
	<h3>Profile Details</h3>
	<table class="table" style="width:100%">
		<thead>
			<tr>
				<td>SN.</td>
				<td>User ID</td>
				<td>Name</td>
				<td>Role Group</td>
				<td>Email ID</td>
				<td>Mobile Number</td>
				<td></td>
			</tr>
		</thead>
		<tbody>
		
		<%int serialNumber=0; %>
		<c:forEach items=${Users} var="user">
			<tr>
				<td><%=serialNumber+1 %></td>
				<td><c:out value="${user.userID}"/> </td>
				<td><c:out value="${user.firstName,user.lastName}"/></td>
				<td><c:out value="${user.roleGroup}"/></td>
				<td><c:out value="${user.emailID}"/></td>
				<td><c:out value="${user.mobileNumber}"/></td>
				<td><i href="/editUser/${user.userID}"><img src="../../../images/Edit_icon.png"width="25px" height="25px"/></a>&nbsp;&nbsp;
                  <a href="/deleteUser/${user.userID}"><img src="../../../images/Delete-icon.jpg" width="25px" height="25px"></a></i></td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</div>











<%@ include file="defaults/Footer.jsp" %>