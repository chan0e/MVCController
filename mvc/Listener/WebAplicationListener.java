package com.nhnacademy.mvc.Listener;

import com.nhnacademy.mvc.Interface.StudentRepository;
//import com.nhnacademy.mvc.data.Gender;
import com.nhnacademy.mvc.data.MapStudentRepository;
import com.nhnacademy.mvc.data.Student;
import org.apache.commons.math3.random.RandomDataGenerator;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class WebAplicationListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext context = sce.getServletContext();
        StudentRepository studentRepository = new MapStudentRepository();

        RandomDataGenerator generator = new RandomDataGenerator();

        for (int i = 0; i < 10; i++) {
            long random = generator.nextLong(20, 30);

            studentRepository.save(new Student("sutudent" + i,"nhnacademy" + i, "M", (int) random));

        }

        context.setAttribute("studentRepository",studentRepository);
    }


    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        ServletContextListener.super.contextDestroyed(sce);
    }
}
