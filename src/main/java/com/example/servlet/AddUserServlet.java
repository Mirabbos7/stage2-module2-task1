package com.example.servlet;

import com.example.User;
import com.example.Warehouse;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/add")
public class AddUserServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp, String firstName, String lastName) throws ServletException, IOException {
        if(firstName != null && lastName != null){
            User user = new User(firstName, lastName);
            Warehouse.getInstance().addUser(user);
        }
        req.getRequestDispatcher("webapp/jsp/add.jsp").forward(req, resp);
    }

}
