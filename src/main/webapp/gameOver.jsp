<%--
  Created by IntelliJ IDEA.
  User: Ramzan
  Date: 20.08.2022
  Time: 15:33
  To change this template use File | Settings | File Templates.
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Servlet Application Login</title>
    <style type="text/css">
        body {
            background-color: darkred;
        }
        .paddingBtm {
            padding-bottom: 12px;

        }
    </style>
</head>
<body>

<center>
    <br><br><br><br><br><br><br><br><br><br><br>
    <td>Username: "<%= session.getAttribute("username") %>"</td><br><br>
    <td>Количество игр: "<%= session.getAttribute("userCount") %>"</td><br><br>
    <td>ip address: "<%= session.getAttribute("ip") %>"</td><br><br>
    <h1><%= session.getAttribute("answer") %><p>ПОРАЖЕНИЕ</p></h1>
    <form id="loginFormId" name="loginForm" method="get" action="index.jsp">
        <div id="usernameDiv" class="paddingBtm">
        </div><br>
        <div id="restartBtn">
            <input id="btn" type="submit" value="start again" />
        </div>
    </form>
</center>
</body>
</html>