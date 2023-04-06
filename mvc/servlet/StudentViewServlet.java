//package com.nhnacademy.mvc.servlet;
//
//import com.nhnacademy.mvc.Interface.StudentRepository;
//import com.nhnacademy.mvc.data.Student;
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletConfig;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.List;
//
//
//@WebServlet( name = "studentViewServlet",
//            urlPatterns = "/studentview"
//
//)
//public class StudentViewServlet extends HttpServlet {
//
//    private StudentRepository studentRepository = null;
//    @Override
//    public void init(ServletConfig config) throws ServletException {
//        studentRepository = (StudentRepository) config.getServletContext().getAttribute("studentRepository");
//    }
//
//
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        Student student;
//
//        String id = req.getParameter("studentid");
////        System.out.println(id);
//
//        if(studentRepository.existById(id)){
//            student = studentRepository.getStudentById(id);
//            req.setAttribute("student",student);
//        }
//
////        RequestDispatcher rd = req.getRequestDispatcher("StudentView.jsp");
////        rd.forward(req,resp);
//        req.setAttribute("view","StudentView.jsp");
//
//
//    }
//
//}
