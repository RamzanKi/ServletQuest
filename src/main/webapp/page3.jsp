<%--
  Created by IntelliJ IDEA.
  User: Ramzan
  Date: 20.08.2022
  Time: 16:00
  To change this template use File | Settings | File Templates.
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>

<center>
    <br><br><br><br><br><br><br><br><br><br><br>
    <td>Username: "<%= session.getAttribute("username") %>"</td><br><br>
    <td>Количество игр: "<%= session.getAttribute("userCount") %>"</td><br><br>
    <td>ip address: "<%= session.getAttribute("ip") %>"</td><br><br>
    <h1>Ты поднялся на мостик<p>Представься</p></h1>
    <form id="loginFormId" name="loginForm" method="get" action="logicServlet">
        <div id="usernameDiv" class="paddingBtm">
            <span id="question1">Рассказать правду: </span><input type="radio" name="question" value="5" required/>
            <span id="question2">Солгать: </span><input type="radio" name="question" value="6" />
        </div>
        <div id="loginBtn">
            <input id="btn" type="submit" value="submit" />
            <%--            <p>Name: <c:out value="${sessionScope.username}"/></p>--%>
            <%--            <c:redirect url="/game.jsp"/>--%>
        </div>
    </form>
</center>
</body>
</html>
