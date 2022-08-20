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
        String username = user.getName();

//        ServletContext context = getServletContext();
//        context.setAttribute("username", username);

        req.setAttribute("username", username);

        currentSession.setAttribute("username", username);

        System.out.println("Username?= " + param1);

        req.getServletContext().getRequestDispatcher("/game.jsp").forward(req, resp);
//        req.getServletContext().getRequestDispatcher("/logicServlet").forward(req, resp);
    }

//    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        req.getRequestDispatcher("/game.jsp").forward(req,resp);
//    }


}
