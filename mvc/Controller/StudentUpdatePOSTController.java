package com.nhnacademy.mvc.Controller;

import com.nhnacademy.mvc.Interface.Command;
import com.nhnacademy.mvc.Interface.StudentRepository;
import com.nhnacademy.mvc.data.Student;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Objects;

public class StudentUpdatePOSTController implements Command {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) {
        StudentRepository studentRepository = (StudentRepository) req.getServletContext().getAttribute("studentRepository");
        if (Objects.isNull(req.getParameter("userid")) || Objects.isNull(req.getParameter("username"))
                || Objects.isNull(req.getParameter("chk")) || Objects.isNull(req.getParameter("userage")))
        {

            return "redirect:/StudentUpdate.jsp";
        }

        String Id = req.getParameter("userid");
        String Name = req.getParameter("username");
        String sex = req.getParameter("chk");
        String age = req.getParameter("userage");

        studentRepository.update (new Student(Id,Name,sex,Integer.parseInt(age)));


        return "redirect:/studentlist.do";
    }
}
