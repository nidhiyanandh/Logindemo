<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	${msg}  
</h1>
<form action="/test/Login.html" method="get">

<input type="submit" value="Ciclk for Login Page"/>
</form>
</body>
</html>
