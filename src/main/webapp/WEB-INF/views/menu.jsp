<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>  
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>menu</title>
<c:set var="url" value="${pageContext.request.contextPath}"/>
</head>
<body>
<nav>
	<ul class="sf-menu" id="nav" style="width: 500px;margin: 0; padding: 0; display: block; position: relative; color:white;">
		<li style="width: 100px;display: block; list-style: none; float: left; position: relative;color:white;">
		<a href="${url}/home" style="display: block; position: relative;color:white;width:40px;" onmouseover="colorA(this)" onmouseout="normalA(this)">Home</a></li>
		<li style="width: 100px;display: block; list-style: none; float: left; position: relative;color:white;">
		<a href="#" style="display: block; position: relative;color:white;width:50px;" onmouseover="colorA(this)" onmouseout="normalA(this)">Login</a>
			<ul style="margin: 0 0 0 0px; padding: 0; position: relative;left: 0; top: auto; left: auto;background: #461D7C; background: -moz-linear-gradient(#461D7C, #461D7C);background: -o-linear-gradient(#461D7C, #461D7C);background: -webkit-linear-gradient(#461D7C, #461D7C);-webkit-box-shadow: rgba(0, 0, 0, 0.2) 0px 2px 2px;-moz-box-shadow: rgba(0, 0, 0, 0.2) 0px 2px 2px;box-shadow: rgba(0, 0, 0, 0.2) 0px 2px 2px;border: 1px solid #461D7C;border-radius: 7px 7px 7px 7px;-moz-border-radius: 7px 7px 7px 7px;-webkit-border: 7px 7px 7px 7px;">
				<li style="width: 100px;height:45px;margin: 2px 1px 1px 1px;float: left;background: #461D7C; background: -moz-linear-gradient(#461D7C, #461D7C);background: -o-linear-gradient(#461D7C, #461D7C);background: -webkit-linear-gradient(#461D7C, #461D7C);-webkit-box-shadow: rgba(0, 0, 0, 0.2) 0px 2px 2px;-moz-box-shadow: rgba(0, 0, 0, 0.2) 0px 2px 2px;box-shadow: rgba(0, 0, 0, 0.2) 0px 2px 2px;border: 1px solid #461D7C;border-radius: 7px 7px 7px 7px;-moz-border-radius: 7px 7px 7px 7px;-webkit-border: 7px 7px 7px 7px;">
				<a href="${url}/admin/login" style="margin: 2px 10px 10px 8px;color:white;" onmouseover="colorA(this)" onmouseout="normalA(this)">Admin Login</a><br>
				<a href="${url}/student/stulogin" style="margin: 2px 10px 10px 8px;color:white;" onmouseover="colorA(this)" onmouseout="normalA(this)">User Login</a></li>
			</ul>
		</li>
		<li style="width: 120px;display: block; list-style: none; float: left; position: relative;color:white;">
		<a href="${url}/about" style="display: block; position: relative;color:white;width:60px;" onmouseover="colorA(this)" onmouseout="normalA(this)">About Us</a></li>
		<li style="width: 100px;display: block; list-style: none; float: left; position: relative;color:white;">
		<a href="#" style="display: block; position: relative;color:white;width:70px;" onmouseover="colorA(this)" onmouseout="normalA(this)">Contact Us</a></li>
	</ul>
</nav>

<script type="text/javascript">
function colorA(x) {
    x.style.color = "#FDD023";
}

function normalA(x) {
    x.style.color = "white";
}
</script>
</body>
</html>