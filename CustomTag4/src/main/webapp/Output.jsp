<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="Area" uri="WEB-INF/lib.tld" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Output Page</title>
</head>
<body>
<% float rd=Float.parseFloat(request.getParameter("r")); %>
<Area:circle r="<%=rd %>"/>

</body>
</html>