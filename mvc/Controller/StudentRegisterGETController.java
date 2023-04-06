package com.nhnacademy.mvc.Controller;

import com.nhnacademy.mvc.Interface.Command;
import com.nhnacademy.mvc.Interface.StudentRepository;
import com.nhnacademy.mvc.data.Student;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Objects;


@Slf4j
public class StudentRegisterGETController implements Command {

    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) {

        return "/StudentRegister.jsp";

    }
}
