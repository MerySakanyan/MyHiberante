package com.myhibernate.DAO;


import com.myhibernate.model.User;
import com.myhibernate.util.HibernateUtil;

import org.hibernate.Session;
import org.hibernate.query.Query;


public class UserDaoImplementation implements UserDao {
    private Session session=HibernateUtil.getSessionFactory().openSession();//bacum e ssesia  bazayi ev cragri mijev
    public void addUser(User user) {
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
    }

//    public User getUser(String email, String password) {
//        Query query = session.createNativeQuery("SELECT * from `user` where email =:email and password=:password" ).addEntity(User.class);
//        query.setParameter("email",email);
//        query.setParameter("password",password);
//        User user = (User)query.uniqueResult();
//        return user;
//
//    }


    public void deleteUserByEmail(User user){
        session.beginTransaction();
        session.delete(user);
        session.getTransaction().commit();
    }
}
