package com.nhnacademy.mvc.Controller;

import com.nhnacademy.mvc.Init.RequestMapping;
import com.nhnacademy.mvc.Interface.Command;
import com.nhnacademy.mvc.Interface.StudentRepository;
import com.nhnacademy.mvc.data.Student;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;


public class StudentListController implements Command {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        StudentRepository studentRepository = (StudentRepository) request.getServletContext().getAttribute("studentRepository");

        List<Student> studentList = studentRepository.getStudents();
        request.setAttribute("studentList",studentList);

        return "/StudentList.jsp";
    }
}
