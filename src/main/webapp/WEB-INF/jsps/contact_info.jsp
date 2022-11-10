<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp"%>>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact info</title>
</head>
<body>
<h2>Contact Info</h2>
First Name  : ${contact.firstName}<br/>
Last Name   : ${contact.lastName}<br/>
Email       : ${contact.email}<br/>
Mobile      : ${contact.mobile}<br/>
Source      : ${contact.source}<br/>



<form action="convertContact" method="post">
<input type="hidden" name="id" value="${contact.id}"/>
<input type="submit" value="Convert to lead">
</form>

</body>
</html>