<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="com.example.demo.Student" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit Student</title>

    <style>
        * {
            box-sizing: border-box;
        }

        body {
            margin: 0;
            font-family: Arial, sans-serif;
            background: #f4f6f8;
            min-height: 100vh;

            display: flex;
            justify-content: center;
            align-items: center;
        }

        .container {
            width: 420px;
            background: white;
            padding: 35px;
            border-radius: 12px;
            box-shadow: 0 5px 20px rgba(0,0,0,0.15);
        }

        h2 {
            text-align: center;
            color: #333;
            margin-bottom: 30px;
        }

        label {
            display: block;
            margin-bottom: 8px;
            font-weight: bold;
            color: #444;
        }

        input {
            width: 100%;
            padding: 12px;
            margin-bottom: 20px;
            border: 1px solid #ccc;
            border-radius: 6px;
            font-size: 15px;
        }

        input[type="submit"] {
            background: #007bff;
            color: white;
            border: none;
            cursor: pointer;
            font-size: 16px;
        }

        input[type="submit"]:hover {
            background: #0056b3;
        }

        .back {
            display: block;
            text-align: center;
            margin-top: 15px;
            text-decoration: none;
            color: #007bff;
        }
    </style>
</head>

<body>

<div class="container">

    <h2>Edit Student</h2>

    <%
        Student student = (Student) request.getAttribute("student");
    %>

    <form action="/updateStudent" method="post">

        <label>Register Number</label>

        <input type="number"
               name="regno"
               value="<%= student.getRegno() %>"
               readonly>


        <label>Name</label>

        <input type="text"
               name="name"
               value="<%= student.getName() %>"
               required>


        <label>CGPA</label>

        <input type="number"
               name="cgpa"
               step="0.01"
               value="<%= student.getCgpa() %>"
               required>


        <input type="submit" value="Update Student">

    </form>

    <a class="back" href="/students">
        ← Back to Student List
    </a>

</div>

</body>
</html>