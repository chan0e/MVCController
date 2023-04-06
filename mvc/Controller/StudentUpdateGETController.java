package com.nhnacademy.mvc.Controller;

import com.nhnacademy.mvc.Interface.Command;
import com.nhnacademy.mvc.Interface.StudentRepository;
import com.nhnacademy.mvc.data.Student;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentUpdateGETController implements Command {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) {

        return "/StudentUpdate.jsp";
    }
}
