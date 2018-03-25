<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="style5.css">
</head>
<body>

<div class="k1">
<img src="images/${iname}.jpg">
<div id="k2">
<table>

<tr>
<td>
Productid
</td>
<td>
</td>
<td>
${product.productid}
</td>
</tr>


<tr>
<td>
Productname
</td>
<td>
</td>
<td>
${product.productname}
</td>
</tr>


<tr>
<td>
Brand
</td>
<td>
</td>
<td>
${product.brand}
</td>
</tr>


<tr>
<td>
Description
</td>
<td>
</td>
<td>
${product.description}
</td>
</tr>


<tr>
<td>
price
</td>
<td>
</td>
<td>
${product.price}
</td>
</tr>
</table>
<a href="formal1.jsp" id="h1">Back</a>
</div>
</div>



</body>

</html>