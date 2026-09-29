<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product Inventory Report</title>
<style>
body {
    font-family: Arial;
    background-color: #f2f2f2;
}
.container {
    width: 700px;
    margin: 40px auto;
    background-color: white;
    padding: 25px;
    border-radius: 10px;
}
h1 {
    text-align: center;
}
table {
    width: 100%;
    border-collapse: collapse;
    margin-top: 20px;
}
th, td {
    border: 1px solid black;
    padding: 12px;
    text-align: center;
}
th {
    background-color: #ddd;
}
.back {
    display: block;
    text-align: center;
    margin-top: 20px;
}
</style>
</head>
<body>
<div class="container">
<h1>Product Inventory Report</h1>
<%
String productId = request.getParameter("productId");
String productName = request.getParameter("productName");
double unitPrice =
    Double.parseDouble(request.getParameter("unitPrice"));
int quantity =
    Integer.parseInt(request.getParameter("quantity"));
String supplierName =
    request.getParameter("supplierName");
double totalValue = unitPrice * quantity;
String stockStatus;
if (quantity == 0) {
    stockStatus = "Out of Stock";
}
else if (quantity < 10) {
    stockStatus = "Low Stock";
}
else {
    stockStatus = "In Stock";
}
%>
<table>
<tr>
    <th>Product ID</th>
    <td><%= productId %></td>
</tr>
<tr>
    <th>Product Name</th>
    <td><%= productName %></td>
</tr>
<tr>
    <th>Unit Price</th>
    <td>₹ <%= String.format("%.2f", unitPrice) %></td>
</tr>
<tr>
    <th>Quantity</th>
    <td><%= quantity %></td>
</tr>
<tr>
    <th>Supplier Name</th>
    <td><%= supplierName %></td>
</tr>
<tr>
    <th>Total Inventory Value</th>
    <td>
        ₹ <%= String.format("%.2f", totalValue) %>
    </td>
</tr>
<tr>
    <th>Stock Status</th>
    <td><%= stockStatus %></td>
</tr>
</table>
<a class="back" href="product.jsp">
    Add Another Product
</a>
</div>
</body>
</html>