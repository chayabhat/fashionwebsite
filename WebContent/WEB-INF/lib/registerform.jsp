<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="registerform" method="post">
<h3>SHIPPING INFO </h3>

<table>

<tr>
<td> First name </td>
<td><input type="text" name="firstname"  placeholder="firstname" ></td>
</tr>

<tr>
<td> Last name </td>
<td><input type="text" name="lastname" placeholder="lastname" ></td>
</tr>

<tr>
<td> Email </td>
<td><input type="text" name="email"  placeholder="email" ></td>
</tr>

<tr>
<td> Address </td>
<td><input type="text" name="address"  placeholder="address" ></td>
</tr>

<tr>
<td> Country </td>
<td><input type="text" name="country"  placeholder="country" ></td>
</tr>

<tr>
<td> State </td>
<td><input type="text" name="state" value="" placeholder="state" ></td>
</tr>

<tr>
<td>City </td>
<td><input type="text" name="city" value="" placeholder="city" ></td>
</tr>

<tr>
<td> Pincode</td>
<td><input type="text" name="pincode" value="" placeholder="pincode" ></td>
</tr>

<tr>
<td> Contact </td>
<td><input type="text" name="contact" value="" placeholder="contact" ></td>
</tr>


</table>

<h3>SHIPPING METHOD</h3>


<table>
<tr>
<td> Shipping </td>
<td><input type="text" name="shipping" value="" placeholder="freeshipping/standardshipping" ></td>
</tr>

</table>


<h3>PAYMENT METHOD</h3>
<table>

<tr>
<td> Payment </td>
<td><input type="text" name="payment" value="" placeholder="creditcard/payment" ></td>
</tr>
</table>

<input type="submit" value="add">
<input type="delete" value="del">

</form>
</body>
</html>