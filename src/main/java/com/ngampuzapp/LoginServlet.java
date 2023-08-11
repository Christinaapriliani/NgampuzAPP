package com.ngampuzapp;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private static final String CORRECT_USER_ID = "yourUserID"; // Ganti dengan userID yang sesuai
    private static final String CORRECT_PASSWORD = "yourPassword"; // Ganti dengan password yang sesuai

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String userID = request.getParameter("userID");
        String password = request.getParameter("password");

        if (userID == null || password == null || userID.isEmpty() || password.isEmpty()) {
            response.sendRedirect("index.jsp?loginError=true");
            return;
        }

        if (userID.equals(CORRECT_USER_ID) && password.equals(CORRECT_PASSWORD)) {
            HttpSession session = request.getSession();
            session.setAttribute("userID", userID);
            response.sendRedirect("welcome");
        } else {
            response.sendRedirect("index.jsp?loginError=true");
        }
    }
}
