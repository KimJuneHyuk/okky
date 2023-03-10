package com.example.okky.command.member;

import com.example.okky.command.Command;
import com.example.okky.dtos.members.MemberDto;
import com.example.okky.frontcontroller.View;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MemberMyViewCommand implements Command {

    @Override
    public View execute(HttpServletRequest req, HttpServletResponse resp) {
        MemberDto member = (MemberDto)req.getSession().getAttribute("member");
        req.setAttribute("member",member);
        return new View("/member/my_page");
    }
}
