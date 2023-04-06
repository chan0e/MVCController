//package com.nhnacademy.mvc.servlet;
//
//import com.nhnacademy.mvc.Interface.StudentRepository;
////import com.nhnacademy.mvc.data.Gender;
//import com.nhnacademy.mvc.data.Student;
//import lombok.extern.slf4j.Slf4j;
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletConfig;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.List;
//import java.util.Objects;
//
//
//@Slf4j
//@WebServlet(name = "studentRegisterServlet",
//        urlPatterns = "/studentregister"
//
//)
//
//public class StudentRegisterServlet extends HttpServlet {
//
//    private StudentRepository studentRepository = null;
//
//    @Override
//    public void init(ServletConfig config) throws ServletException {
//        studentRepository = (StudentRepository) config.getServletContext().getAttribute("studentRepository");
//    }
//
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//
//
////        RequestDispatcher rd = req.getRequestDispatcher("StudentRegister.jsp");
////        rd.forward(req,resp);
//        req.setAttribute("view","StudentRegister.jsp");
//
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//
//
//        if (Objects.isNull(req.getParameter("userid")) || Objects.isNull(req.getParameter("username"))
//         || Objects.isNull(req.getParameter("chk")) || Objects.isNull(req.getParameter("userage")))
//        {
//            log.error("error");
//
//            resp.sendRedirect("StudentRegister.jsp");
//        }
//
//        String Id = req.getParameter("userid");
//        String Name = req.getParameter("username");
//        String sex = req.getParameter("chk");
//        String age = req.getParameter("userage");
//
//
//        studentRepository.save(new Student(Id,Name,sex,Integer.parseInt(age)));
////        resp.sendRedirect("/studentlist");
//        req.setAttribute("view","redirect:/studentlist.do");
//
//
//    }
//}
