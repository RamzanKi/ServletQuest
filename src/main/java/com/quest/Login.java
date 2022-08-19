package com.quest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/loginServlet")
public class Login extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        handleRequest(req, resp);
    }
    public void handleRequest(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        HttpSession currentSession = req.getSession(true);

        resp.setContentType("text/html");

        // Post Parameters From The Request
        String param1 = req.getParameter("username");
        PrintWriter out = resp.getWriter();

        if(param1 == null) {
            out.write("name field can`t be empty");
            req.getRequestDispatcher("/index.jsp").forward(req,resp);
        } else if ("".equals(param1)) {
            out.write("name field can`t be empty");
            req.getRequestDispatcher("/index.jsp").forward(req,resp);
        } else {
            User user = new User(param1);
            String username = user.getName();

            currentSession.setAttribute("username", username);

            System.out.println("Username?= " + param1);
            // Print The Response

//            out.write("<html><body><div id='serlvetResponse' style='text-align: center;'>");
//            out.write("</div></body></html>");
            out.close();

//            RequestDispatcher requestDispatcher = req.getRequestDispatcher("game.jsp");
//            requestDispatcher.forward(req, resp);

            req.getRequestDispatcher("/game.jsp").forward(req,resp);
            doPost(req, resp);
        }
    }

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/game.jsp").forward(req,resp);
    }
}
