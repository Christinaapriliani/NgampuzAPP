<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Login Page</title>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script>
        $(document).ready(function() {
            $("form").submit(function(event) {
                if ($("#userID").val() === "" || $("#password").val() === "") {
                    event.preventDefault();
                    $("#loginError").text("User ID and Password are mandatory fields.").css("color", "red");
                }
            });
        });
    </script>
</head>
<body>
    <h2>Login Page</h2>
    <form action="login" method="post">
        User ID: <input type="text" id="userID" name="userID"><br>
        Password: <input type="password" id="password" name="password"><br>
        <input type="submit" value="Login">
    </form>
    <p id="loginError">
        <% if (request.getParameter("loginError") != null) { %>
            Invalid credentials. Please try again.
        <% } %>
    </p>
</body>
</html>
