<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="Mark" uri="WEB-INF/lib.tld" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Output Page</title>
</head>
<body>
<% int mark1=Integer.parseInt(request.getParameter("m1"));  %>
<% int mark2=Integer.parseInt(request.getParameter("m2")); %>
<% int mark3=Integer.parseInt(request.getParameter("m3")); %>
<% int mark4=Integer.parseInt(request.getParameter("m4")); %>
<% int mark5=Integer.parseInt(request.getParameter("m5")); %>

<Mark:mark m1="<%=mark1 %>" m2="<%=mark2 %>" m3="<%=mark3 %>" m4="<%=mark4 %>" m5="<%=mark5 %>"/>




</body>
</html>