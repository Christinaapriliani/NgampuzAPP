<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Welcome Page</title>
</head>
<body>
    <h2>Welcome <%= session.getAttribute("userID") %></h2>
    <table border="1">
        <tr>
            <th>Department</th>
            <th>Student ID</th>
            <th>Marks</th>
            <th>Pass %</th>
        </tr>
        <%
            List<Student> students = (List<Student>) request.getAttribute("students");
            for (Student student : students) {
        %>
            <tr>
                <td><%= student.getDepartment() %></td>
                <td><%= student.getStudentID() %></td>
                <td><%= student.getMarks() %></td>
                <td><%= student.getPassPercentage() %></td>
            </tr>
        <%
            }
        %>
    </table>
</body>
</html>
