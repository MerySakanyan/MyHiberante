package com.myhibernate.controler;


import com.myhibernate.DAO.UserDaoImplementation;
import com.myhibernate.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "RegisterServlet")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String confirmpassword = req.getParameter("confirmpassword");
        String name = req.getParameter("name");
        String surname = req.getParameter("surname");
        if (password.equals(confirmpassword)) {

            UserDaoImplementation userDaoImplementation = new UserDaoImplementation();
            User user = new User();
user.setId(3);
            user.setName(name);
            user.setEmail(email);
            user.setSurname(surname);
            user.setPassword(password);
            userDaoImplementation.addUser(user);
        }
// else {
//
//            req.setAttribute("errMess", "Repeat password");
//            response.sendRedirect("/Pages/register.jsp");
//        }


    }


}
