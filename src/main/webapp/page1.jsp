<%--
  Created by IntelliJ IDEA.
  User: Ramzan
  Date: 20.08.2022
  Time: 15:32
  To change this template use File | Settings | File Templates.
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>

<center>
    <form id="loginFormId" name="loginForm" method="get" action="logicServlet">
        <div id="usernameDiv" class="paddingBtm">
            <span id="question1">question3: </span><input type="radio" name="question" value="3" required/>
            <span id="question2">question4: </span><input type="radio" name="question" value="4"/>
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
