package com.jsp.basic.chap02;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@WebServlet("/chap02/dancer/process")
public class DancerProcessServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("댄서 등록 수행중....");
        String name = req.getParameter("name");
        String crewName = req.getParameter("crewName");
        String danceLevel = req.getParameter("danceLevel");
        String[] genres = req.getParameterValues("genres");// 다중 선택 가능

        System.out.println("name = " + name);
        System.out.println("crewName = " + crewName);
        System.out.println("danceLevel = " + danceLevel);
        System.out.println("genres = " + Arrays.toString(genres));
    }
}

