package com.nhnacademy.mvc.Controller;

import com.nhnacademy.mvc.Interface.Command;
import com.nhnacademy.mvc.Interface.StudentRepository;
import com.nhnacademy.mvc.data.Student;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentDeletePOSTController implements Command {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) {
        StudentRepository studentRepository = (StudentRepository) req.getServletContext().getAttribute("studentRepository");
        String id = req.getParameter("button");

        studentRepository.deleteById(id);

        return "redirect:/studentlist.do";
    }
}
