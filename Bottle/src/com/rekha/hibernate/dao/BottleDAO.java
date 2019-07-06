package com.rekha.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.rekha.hibernate.dto.BottleDTO;

public class BottleDAO 
{
	public void save(BottleDTO bdto)
	{
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(BottleDTO.class);
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(bdto);
		tx.commit();
		session.close();
		factory.close();
	}

}
