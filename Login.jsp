<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" xml:lang="en">
<head>
<meta charset="UTF-8">
<title>Login Page</title>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script>
$(document).ready(function() {
    $("#loginForm").submit(function(event) {
        event.preventDefault();
        var userId = $("#userId").val();
        var password = $("#password").val();
        if (userId == "" || password == "") {
            alert("User ID and password are required.");
        } else {
            $.post("LoginServlet", {userId: userId, password: password}, function(data) {
                if (data == "success") {
                    window.location.href = "welcome.jsp";
                } else {
                    alert("Invalid user ID or password.");
                }
            });
        }
    });
});
</script>
</head>
<body>
    <h1>Login Page</h1>
    <form id="loginForm">
        <label for="userId">User ID:</label>
        <input type="text" id="userId" name="userId"><br><br>
        <label for="password">Password:</label>
        <input type="password" id="password" name="password"><br><br>
        <input type="submit" value="Login">
    </form>
</body>
</html>
