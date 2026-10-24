<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="com.example.demo.Student" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Search Student</title>

    <style>
        body {
            margin: 0;
            font-family: Arial, sans-serif;
            background-color: #f4f6f8;

            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 100vh;
        }

        .container {
            background: white;
            width: 450px;
            padding: 35px;
            border-radius: 12px;
            box-shadow: 0 4px 15px rgba(0,0,0,0.15);
        }

        h2 {
            text-align: center;
            color: #333;
            margin-bottom: 25px;
        }

        label {
            display: block;
            font-weight: bold;
            margin-bottom: 8px;
        }

        input[type="number"] {
            width: 100%;
            padding: 11px;
            box-sizing: border-box;
            border: 1px solid #ccc;
            border-radius: 6px;
            margin-bottom: 15px;
        }

        input[type="submit"] {
            width: 100%;
            padding: 12px;
            background-color: #007bff;
            color: white;
            border: none;
            border-radius: 6px;
            font-size: 16px;
            cursor: pointer;
        }

        .result {
            margin-top: 25px;
            padding: 15px;
            background-color: #f1f1f1;
            border-radius: 6px;
        }

        .not-found {
            margin-top: 25px;
            color: red;
            text-align: center;
        }

        a {
            display: block;
            text-align: center;
            margin-top: 20px;
        }
    </style>
</head>

<body>

<div class="container">

    <h2>Search Student</h2>

    <form action="/search" method="get">

        <label>Enter Register Number</label>

        <input type="number" name="regno" required>

        <input type="submit" value="Search Student">

    </form>

<%
    Student student = (Student) request.getAttribute("student");

    if (student != null) {
%>

    <div class="result">

        <p><strong>Register Number:</strong>
            <%= student.getRegno() %>
        </p>

        <p><strong>Name:</strong>
            <%= student.getName() %>
        </p>

        <p><strong>CGPA:</strong>
            <%= student.getCgpa() %>
        </p>

    </div>

<%
    } else if (request.getParameter("regno") != null) {
%>

    <div class="not-found">
        Student not found.
    </div>

<%
    }
%>

    <a href="/">Add New Student</a>

    <a href="/students">View All Students</a>

</div>

</body>
</html>