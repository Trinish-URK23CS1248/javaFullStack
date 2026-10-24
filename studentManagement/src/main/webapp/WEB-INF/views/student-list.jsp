<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.util.List" %>
<%@ page import="com.example.demo.Student" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Student Management</title>

    <style>
        body {
            margin: 0;
            font-family: Arial, sans-serif;
            background: #f4f6f8;
            padding: 40px;
        }

        .container {
            max-width: 900px;
            margin: auto;
            background: white;
            padding: 30px;
            border-radius: 12px;
            box-shadow: 0 5px 20px rgba(0,0,0,0.15);
        }

        h2 {
            text-align: center;
            color: #333;
            margin-bottom: 25px;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin-bottom: 25px;
        }

        th {
            background: #007bff;
            color: white;
            padding: 12px;
        }

        td {
            padding: 12px;
            text-align: center;
            border-bottom: 1px solid #ddd;
        }

        tr:hover {
            background: #f5f5f5;
        }

        .edit {
            background: #28a745;
            color: white;
            padding: 7px 12px;
            text-decoration: none;
            border-radius: 5px;
        }

        .delete {
            background: #dc3545;
            color: white;
            padding: 7px 12px;
            text-decoration: none;
            border-radius: 5px;
        }

        .buttons {
            text-align: center;
        }

        .button {
            display: inline-block;
            padding: 10px 18px;
            margin: 5px;
            background: #007bff;
            color: white;
            text-decoration: none;
            border-radius: 6px;
        }

        .edit:hover {
            background: #218838;
        }

        .delete:hover {
            background: #c82333;
        }

        .button:hover {
            background: #0056b3;
        }
    </style>
</head>

<body>

<div class="container">

    <h2>Student List</h2>

    <table>

        <tr>
            <th>Register Number</th>
            <th>Name</th>
            <th>CGPA</th>
            <th>Actions</th>
        </tr>

<%
    List<Student> students =
        (List<Student>) request.getAttribute("students");

    for (Student student : students) {
%>

        <tr>

            <td><%= student.getRegno() %></td>

            <td><%= student.getName() %></td>

            <td><%= student.getCgpa() %></td>

            <td>
                <a class="edit"
                   href="/edit?regno=<%= student.getRegno() %>">
                   Edit
                </a>

                <a class="delete"
                   href="/delete?regno=<%= student.getRegno() %>"
                   onclick="return confirm('Are you sure you want to delete this student?');">
                   Delete
                </a>
            </td>

        </tr>

<%
    }
%>

    </table>

    <div class="buttons">

        <a class="button" href="/">
            Add New Student
        </a>

        <a class="button" href="/search">
            Search Student
        </a>

    </div>

</div>

</body>
</html>