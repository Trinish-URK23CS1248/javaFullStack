<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product Inventory Management</title>
<style>
    body {
        font-family: Arial;
        background-color: #f2f2f2;
    }
    .container {
        width: 500px;
        margin: 40px auto;
        background-color: white;
        padding: 25px;
        border-radius: 10px;
    }
    h1 {
        text-align: center;
    }
    label {
        display: block;
        margin-top: 12px;
        font-weight: bold;
    }
    input {
        width: 100%;
        padding: 8px;
        margin-top: 5px;
        box-sizing: border-box;
    }
    input[type="submit"] {
        margin-top: 20px;
        background-color: #007bff;
        color: white;
        border: none;
        padding: 10px;
        cursor: pointer;
    }
</style>
</head>
<body>
<div class="container">
    <h1>Product Inventory</h1>
    <form action="inventory.jsp" method="post">
        <label>Product ID</label>
        <input type="text" name="productId" required>
        <label>Product Name</label>
        <input type="text" name="productName" required>
        <label>Unit Price</label>
        <input type="number" name="unitPrice"
               min="0" step="0.01" required>
        <label>Quantity</label>
        <input type="number" name="quantity"
               min="0" required>
        <label>Supplier Name</label>
        <input type="text" name="supplierName" required>
        <input type="submit" value="Generate Inventory Report">
    </form>
</div>
</body>
</html>
