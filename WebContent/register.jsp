<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="style1.css">

<title>Insert title here</title>
</head>
<body>

<h1 id="k">FASHIONMODE.com</h1>

<b>REGISTER FORM </b>
<div class="kavya">
<form action="register" method="post">



<h1>Username:
<input type="text" name="username"  placeholder="username" value="${username}">
<p>${error['usernameerror']}</p> </h1>


<h1>Password
<input type="password" name="password"  placeholder="password">
<p>${error['passworderror']}</p></h1>


<h1>Age:
<input type="text" name="age"  placeholder="age" value="${age}">
<p>${error['ageerror']}</p></h1>

<h1>Gender:
<input type="text" name="gender" placeholder="male/female" ></h1>


<h1>Phoneno:
<input type="text" name="phoneno" placeholder="phoneno"></h1>


<h1>Email:
<input type="text" name="email"  placeholder="email"></h1>

 
<input type="submit" value="SUBMIT">
 
 

</form>
</div>

</body>
</html>