package com.nhnacademy.mvc.Controller;

import com.nhnacademy.mvc.Interface.Command;
import com.nhnacademy.mvc.Interface.StudentRepository;
import com.nhnacademy.mvc.data.Student;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentViewGETController implements Command {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) {
        StudentRepository studentRepository = (StudentRepository) req.getServletContext().getAttribute("studentRepository");
        Student student;
        String id = req.getParameter("studentid");

        if(studentRepository.existById(id)){
            student = studentRepository.getStudentById(id);
            req.setAttribute("student",student);
        }


        return "/StudentView.jsp";
    }
}
