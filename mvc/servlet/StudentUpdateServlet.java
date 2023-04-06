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
//import java.util.Objects;
//
//
//@WebServlet( name = "studentUpdateServlet",
//            urlPatterns = "/studentupdate"
//
//)
//public class StudentUpdateServlet extends HttpServlet {
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
////        List<Student> studentList = studentRepository.getStudents();
////
////        req.setAttribute("studentList",studentList);
////
////        RequestDispatcher rd = req.getRequestDispatcher("StudentUpdate.jsp");
////        rd.forward(req,resp);
//        req.setAttribute("view","StudentUpdate.jsp");
//
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//
//
//        if (Objects.isNull(req.getParameter("userid")) || Objects.isNull(req.getParameter("username"))
//                || Objects.isNull(req.getParameter("chk")) || Objects.isNull(req.getParameter("userage")))
//        {
//
//            resp.sendRedirect("StudentUpdate.jsp");
//        }
//
//        String Id = req.getParameter("userid");
//        String Name = req.getParameter("username");
//        String sex = req.getParameter("chk");
//        String age = req.getParameter("userage");
//
//        studentRepository.update (new Student(Id,Name,sex,Integer.parseInt(age)));
////        resp.sendRedirect("/studentlist.do");
//
//        req.setAttribute("view","redirect:/studentlist.do");
//
//    }
//}
