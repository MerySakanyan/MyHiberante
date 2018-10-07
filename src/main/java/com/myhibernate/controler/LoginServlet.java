package com.myhibernate.controler;


import com.myhibernate.DAO.UserDao;
import com.myhibernate.DAO.UserDaoImplementation;
import com.myhibernate.model.User;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws javax.servlet.ServletException, IOException {


////User_Repository repository=new User_Repository();
////repository.testUser();

        String email = request.getParameter("email");
        String password = request.getParameter("password");

        UserDaoImplementation userDaoImplementation = new UserDaoImplementation();
        User user = new User();
        user.setId(27);
        user.setName("newuser");
        user.setEmail("sss");
        user.setSurname("newsurname");
        user.setPassword("1111");
        userDaoImplementation.deleteUserByEmail(user);
        //  User user=userDaoImplementation.getUser("a","a");
//
//        if (user==null){
//         //  request.setAttribute("errMessage", "Wrong email or password");
//       //    request.getRequestDispatcher("/index.jsp").forward(request,response);
//            response.sendRedirect("/Pages/register.jsp");
//        }else {
//         //  request.getSession().setAttribute("user",user);
//           response.sendRedirect("/Pages/home.jsp");
//
//
//        }
    }


}
