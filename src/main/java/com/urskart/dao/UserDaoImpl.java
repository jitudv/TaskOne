package com.urskart.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.urskart.model.User;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.Transaction;

@Repository
public class UserDaoImpl implements UserDao {
   
	   @Autowired
	   private SessionFactory sessionFactory;

	
	@Override
	public long saveUser(User user) {
		//  save user  to database 
		Session session  = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(user);
		System.out.println(" long  your user save \t "+user.getId());
		tx.commit();
		return  user.getId();
	}

	@Override
	public User get(long id) {
		//   get user from data base
		Session session = sessionFactory.openSession();
		return  session.get(User.class, id);
	}

	@Override
	public List<User> userList() {
		//  list of All user  from data base 
		Session session = sessionFactory.openSession();
		
		return  session.createQuery("From User").list();
	}

	@Override
	public void update(long id, User user)
	{
		// update User to database 
		Session session = sessionFactory.openSession();
		Transaction tx  =  session.beginTransaction();
		User user2 = session.byId(User.class).load(id);
		user2.setDateOfBirth(user.getDateOfBirth());
		user2.setName(user.getName());
		user2.setLastName(user.getLastName());
		user2.setMobileNo(user.getMobileNo());
		user2.setPassword(user.getPassword());
		session.flush();
		

	}

	@Override
	public void update(long id) {
		// update user according to user id 

	}

	@Override
	public void delete(long id) {
		Session  session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.delete(id);
		tx.commit();
		

	}

}
