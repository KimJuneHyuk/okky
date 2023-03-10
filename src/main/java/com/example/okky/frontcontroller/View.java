package com.example.okky.frontcontroller;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Slf4j
public class View {
    private String viewName;
    private final String PREFIX="/WEB-INF";
    private final String SUFFIX=".jsp";
    public View(String viewName) {
        this.viewName = viewName;
    }

    public void render(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        log.info("render path = {}",this.viewName);
        String viewPath = viewResolver(viewName);
        if(viewName.contains("redirect:")) {
            log.info("redirect:/ {}",viewPath);
            resp.sendRedirect(viewPath);
        } else {
            log.info("viewPath = {}",viewPath);
            RequestDispatcher dispatcher = req.getRequestDispatcher(viewPath);
            dispatcher.forward(req, resp);
        }
    }
    private String viewResolver(String viewName){
        if(viewName.contains("redirect:")){
            return viewName.substring(viewName.indexOf("/"));
        }else{
            return PREFIX + viewName + SUFFIX;
        }

    }
}
