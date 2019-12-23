<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page import="com.gprs.entity.user.User" %>
 
 <%! String userName="";
	String error="";
	String message="";
	String roleGroup="";
%>
<%
User user=(User)session.getAttribute("User");
error=(String)session.getAttribute("error");
message=(String)session.getAttribute("message");
if(user!=null){
	roleGroup=user.getRoleGroup();
}
%>