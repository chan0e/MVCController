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
//import java.util.Objects;
//
//
//@WebServlet( name = "studentDeleteServlet",
//            urlPatterns = "/studentdelete"
//
//)
//public class StudentDeleteServlet extends HttpServlet {
//
//    private StudentRepository studentRepository = null;
//    @Override
//    public void init(ServletConfig config) throws ServletException {
//        studentRepository = (StudentRepository) config.getServletContext().getAttribute("studentRepository");
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//
//        String id = req.getParameter("button");
//        studentRepository.deleteById(id);
////        resp.sendRedirect("/studentlist");
//        req.setAttribute("view","redirect:/studentlist.do");
//
//    }
//}
