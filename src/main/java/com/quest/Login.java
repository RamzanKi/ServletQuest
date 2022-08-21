package com.quest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/loginServlet")
public class Login extends HttpServlet {
    private static final long serialVersionUID = 1L;
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        HttpSession currentSession = req.getSession(true);

        resp.setContentType("text/html");

        // Post Parameters From The Request
        String param1 = req.getParameter("username");

        User user = new User(param1);
        user.addUser();

        currentSession.setAttribute("userCount", user.getUsersCount());
        String username = user.getName();

        String ip = req.getRemoteAddr();

        currentSession.setAttribute("ip", ip);

        currentSession.setAttribute("username", username);

        System.out.println("Username?= " + param1);

        req.getServletContext().getRequestDispatcher("/game.jsp").forward(req, resp);
    }



}
