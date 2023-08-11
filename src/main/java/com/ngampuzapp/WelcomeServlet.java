package com.ngampuzapp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        final String DEPARTMENT_1 = "Dep 1"; 
        final String DEPARTMENT_3 = "Dep 3"; 
        
        List<Student> students = new ArrayList<>();
        students.add(new Student("S1", "Student 1", DEPARTMENT_1, 35, students));
        students.add(new Student("S2", "Student 2", DEPARTMENT_1, 70, students));
        students.add(new Student("S3", "Student 3", DEPARTMENT_1, 60, students));
        students.add(new Student("S4", "Student 4", DEPARTMENT_1, 90, students));
        students.add(new Student("S5", "Student 5", "Dep 2", 30, students));
        students.add(new Student("S6", "Student 6", DEPARTMENT_3, 32, students));
        students.add(new Student("S7", "Student 7", DEPARTMENT_3, 70, students));
        students.add(new Student("S8", "Student 8", DEPARTMENT_3, 20, students));

        try {
            request.setAttribute("students", students);
            request.getRequestDispatcher("welcome.jsp").forward(request, response);
        } catch (ServletException | IOException e) {
            
            e.printStackTrace(); 
        }
    }
}
