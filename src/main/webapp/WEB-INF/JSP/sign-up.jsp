<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign up form</title>
</head>
<body>

<h1>Sign-Up Form</h1>

<form action="${pageContext.request.contextPath }/signupUser "method="post">

<label>name</label>
<input type="text" name="username" required>

<br></br>

<label>Department</label>
<input type="text" name="department" required>

<br></br>

<label>Address</label>
<input type="text" name="address" required>

<br></br>

<button type="submit"> Submit </button>

</form>




</body>
</html>