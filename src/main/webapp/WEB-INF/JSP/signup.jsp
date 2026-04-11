<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign up</title>
</head>

<body bgcolor="pink">


<div class="container">
<form action="${pageContext.request.contextPath}/createUser" method="post">

<label>Name :</label>
<input type="text" name="username" required>

<br></br>

<label>Department :</label>
<input type="text" name="department" required>

<br></br>

<label>Address :</label>
<input type="text" name="address" required>

<br></br>

<button type="submit"> Submit</button>


	</form>
</div>
</body>
</html>