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

        HttpSession currentSession = req.getSession();
        resp.setContentType("text/html");

        if (req.getParameter("question").equals("1")) {
           req.getServletContext().getRequestDispatcher("/acceptCall.jsp").forward(req, resp);
        }
        if (req.getParameter("question").equals("2")) {
            currentSession.setAttribute("answer", GameOver.answer1);
            req.getServletContext().getRequestDispatcher("/gameOver.jsp").forward(req, resp);
        }
        if (req.getParameter("question").equals("3")) {
            req.getServletContext().getRequestDispatcher("/acceptInvitation.jsp").forward(req, resp);
        }
        if (req.getParameter("question").equals("4")) {
            currentSession.setAttribute("answer", GameOver.answer2);
            req.getServletContext().getRequestDispatcher("/gameOver.jsp").forward(req, resp);
        }
        if (req.getParameter("question").equals("5")) {
            req.getServletContext().getRequestDispatcher("/youWin.jsp").forward(req, resp);
        }
        if (req.getParameter("question").equals("6")) {
            currentSession.setAttribute("answer", GameOver.answer3);
            req.getServletContext().getRequestDispatcher("/gameOver.jsp").forward(req, resp);
        }
    }
}
