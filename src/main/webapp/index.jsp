<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<?xml version="1.0" encoding="UTF-8" ?>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Servlet Application Login</title>
    <style type="text/css">
        .paddingBtm {
            padding-bottom: 12px;
        }
    </style>
</head>
<body>
<center>
    <br><br><br><br><br><br><br><br><br><br><br>
    <h1>Prologue:<p>you are on Spaceship</p></h1>
    <h2>Enter your name</h2>
    <form id="loginFormId" name="loginForm" method="get" action="loginServlet">
        <div id="usernameDiv" class="paddingBtm">
            <span id="user">Username: </span><input type="text" name="username" required/>
        </div><br>
        <div id="loginBtn">
            <input id="btn" type="submit" value="Login" />
        </div>
    </form>
</center>
</body>
</html>