package com.example.okky.command.article;

import com.example.okky.command.Command;
import com.example.okky.daos.ArticleDao;
import com.example.okky.frontcontroller.View;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class ArticleUpdateCommand implements Command {
    ArticleDao adao = ArticleDao.getInstance();


    @Override
    public View execute(HttpServletRequest req, HttpServletResponse resp) throws SQLException, ClassNotFoundException {
        int boardId = Integer.parseInt(req.getParameter("boardId"));
        int articleIndex =Integer.parseInt(req.getParameter("articleIndex"));
        String memberEmail = req.getParameter("memberEmail");
        String title = req.getParameter("title");
        String[] tags = req.getParameterValues("tags");
        String content = req.getParameter("content");

        adao.updateArticle(articleIndex,memberEmail, title, content, tags);

        return new View("redirect:/article?boardId="+boardId+"&articleIndex="+articleIndex);
    }
}
