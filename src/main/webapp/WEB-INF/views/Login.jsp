<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<form action="/test/Submitaction.html" method="post">
<h4>${msg}</h4>
<p>
User Name:<input type="text" name="uname" />
</p>
<p>
Password :<input type="password" name="pass"/>
</p>
<input type="submit" value="Ciclk"/>
</form>
</body>
</html>