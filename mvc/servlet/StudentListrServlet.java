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
//@WebServlet( name = "studentListServlet",
//            urlPatterns = "/studentlist"
//
//)
//public class StudentListrServlet extends HttpServlet {
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
//        List<Student> studentList = studentRepository.getStudents();
//
//        req.setAttribute("studentList",studentList);
//
////        RequestDispatcher rd = req.getRequestDispatcher("StudentList.jsp");
////
////        rd.forward(req,resp);
//
//        req.setAttribute("view","StudentList.jsp");
//
//    }
//
//}
