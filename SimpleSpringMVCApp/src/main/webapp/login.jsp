<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2> Login page</h2>
<form action="checkLoginDetails" method="post">
	<label>EmailId</label>
	<input type="email" name="emailid"/><br/>
	<label>Password</label>
	<input type="password" name="password"/><br/>
	<input type="submit" value="signIn!"/>
	<input type="reset" value="reset"/>
</form>
</body>
</html>