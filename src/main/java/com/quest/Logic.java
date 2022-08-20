package com.quest;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/logicServlet")
public class Logic extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
//        req.getServletContext().getRequestDispatcher("/game.jsp").forward(req, resp);

        HttpSession currentSession = req.getSession();
        resp.setContentType("text/html");
//        PrintWriter out = resp.getWriter();

        String username = (String) currentSession.getAttribute("username");
//        out.println("Name: " + username);

        if (req.getParameter("question").equals("1")) {
           req.getServletContext().getRequestDispatcher("/page1.jsp").forward(req, resp);
        }
        if (req.getParameter("question").equals("2")) {
            req.getServletContext().getRequestDispatcher("/page2.jsp").forward(req, resp);
        }
//        out.close();
    }
}
