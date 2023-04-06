package com.nhnacademy.mvc.servlet;

import com.nhnacademy.mvc.Controller.*;
import com.nhnacademy.mvc.Interface.Command;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static javax.servlet.RequestDispatcher.*;

@Slf4j
@WebServlet(name = "frontServlet", urlPatterns = "*.do")
public class FrontServlet extends HttpServlet {
    private static final String REDIRECT_PREFIX = "redirect";

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //todo 공통 처리 - 응답 content-type, character encoding 지정.
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");

        try {
            //실제 요청 처리할 servlet을 결정
            Command command = resolveCommand(req.getServletPath(), req.getMethod());
            String view = command.execute(req, resp);

            RequestDispatcher rd = req.getRequestDispatcher(view);


            //실제 요청을 처리한 servlet이 'view'라는 request 속성값으로 view를 전달해 줌.
            if (view.startsWith(REDIRECT_PREFIX)) {
                log.error("redirect-url : {}", view.substring(REDIRECT_PREFIX.length() + 1));
                // todo  `redirect:`로 시작하면 redirect 처리.
                resp.sendRedirect(view.substring(REDIRECT_PREFIX.length() + 1));
            } else {
                //todo redirect 아니면 JSP에게 view 처리를 위임하여 그 결과를 include시킴.
                rd.include(req, resp);
            }
        } catch (Exception ex) {
            //todo 공통 error 처리 - ErrorServlet 참고해서 처리
            req.setAttribute("status_code", req.getAttribute(ERROR_STATUS_CODE));
            req.setAttribute("exception_type", req.getAttribute(ERROR_EXCEPTION_TYPE));
            req.setAttribute("message", req.getAttribute(ERROR_MESSAGE));
            req.setAttribute("exception", req.getAttribute(ERROR_EXCEPTION));
            req.setAttribute("request_uri", req.getAttribute(ERROR_REQUEST_URI));

            //todo  forward - /error.jsp
            RequestDispatcher error = req.getRequestDispatcher("/error.jsp");
            error.forward(req,resp);

        }
    }
    private Command resolveCommand(String servletPath, String method) {
        Command command = null;
        if ("/studentlist.do".equals(servletPath) && "GET".equalsIgnoreCase(method)) {
            command = new StudentListController();
        }else if("/studentregister.do".equals(servletPath) && "GET".equalsIgnoreCase(method)){
            command = new StudentRegisterGETController();
        }else if("/studentregister.do".equals(servletPath) && "POST".equalsIgnoreCase(method)){
            command = new StudentRegisterPOSTController();
        }else if("/studentview.do".equals(servletPath) && "GET".equalsIgnoreCase(method)){
            command = new StudentViewGETController();
        }else if("/studentupdate.do".equals(servletPath) && "GET".equalsIgnoreCase(method)){
            command = new StudentUpdateGETController();
        }else if("/studentupdate.do".equals(servletPath) && "POST".equalsIgnoreCase(method)){
            command = new StudentUpdatePOSTController();
        }else if("/studentdelete.do".equals(servletPath) && "POST".equalsIgnoreCase(method)){
            command = new StudentDeletePOSTController();
        }
        return command;
    }
}