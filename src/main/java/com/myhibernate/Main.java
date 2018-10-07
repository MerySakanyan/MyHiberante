package com.myhibernate;

import com.myhibernate.DAO.UserDaoImplementation;
import com.myhibernate.model.User;

public class Main {
    public static void main(String[] args) {
//        UserDaoImplementation userDaoImplementation=new UserDaoImplementation();
        User user=new User();
        user.setId(1);
        user.setName("newuser");
        user.setEmail("sss");
        user.setSurname("newsurname");
        user.setPassword("1111");
//        userDaoImplementation.addUser(user);


        UserDaoImplementation userDaoImplementation=new UserDaoImplementation();
        userDaoImplementation.deleteUserByEmail(user);
       // User user=userDaoImplementation.getUser("a","a");
//        if (user==null){
//            System.out.println("errooooooooooooor");
//        }else
//        System.out.println(user.getName());
    }
}
