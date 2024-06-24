package com.example.servlet;

import com.example.User;
import com.example.Warehouse;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Set;

@WebServlet("/users")
public class GetUsersServlet {
    protected void doGet(HttpServletResponse response, HttpServletRequest request){
        Set<User> users = Warehouse.getInstance().getUsers();
        request.setAttribute("User", users);
        request.getRequestDispatcher("webapp/jsp/users.jsp");
    }
}
