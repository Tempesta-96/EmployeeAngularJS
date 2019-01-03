package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import pojo.EmpPojo;

public class EmpHibernateDAO {

	public static void addEmp(EmpPojo ep) {
		// TODO Auto-generated method stub
		SessionFactory sf =null;
		Session session = null;
		Transaction tr = null;
		
		try {
			sf=dao.HibernateUtil.getSessionFactory();
			session = sf.openSession();
			tr = session.beginTransaction();
			EmpHibernateEntity emp= new EmpHibernateEntity(ep);
			session.save(emp);
			tr.commit();
			ep.setId(emp.getId());
		}catch(Exception e) {
			System.out.println("Error with insert block");
			tr.rollback();
			session.close();			
		}
	}

	public static EmpPojo empDetails(EmpPojo ep) {
		// TODO Auto-generated method stub
		SessionFactory sf = null;
		Session session = null;
		Transaction tr = null;
		EmpPojo emp = null;
		
		try {
			sf=dao.HibernateUtil.getSessionFactory();
			session = sf.openSession();
			String hql = "from EmpHibernateEntity where emp_id = " +ep.getId();
			EmpHibernateEntity tmp = (EmpHibernateEntity) session.createQuery(hql).getSingleResult();
			emp = new EmpPojo(tmp);
//			for (EmpHibernateEntity e: tmp) {
//				list.add(new EmpPojo(e));
//			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return emp;
	}

	public static void deleteEmpDetail(EmpPojo ep) {
		// TODO Auto-generated method stub
		SessionFactory sf =null;
		Session session = null;
		Transaction tr = null;
		
		try {
			sf=dao.HibernateUtil.getSessionFactory();
			session = sf.openSession();
			tr = session.beginTransaction();
			EmpHibernateEntity emp= new EmpHibernateEntity(ep);
			session.delete(emp);
			tr.commit();
		}catch(Exception e) {
			System.out.println("Error with delete block");
			tr.rollback();
			session.close();			
		}
	}

	public static void updateEmpDetail(EmpPojo ep) {
		// TODO Auto-generated method stub
		SessionFactory sf= null;
		Session session = null;
		Transaction tr = null;
		
		try {
			sf=dao.HibernateUtil.getSessionFactory();
			session = sf.openSession();
			tr = session.beginTransaction();
			EmpHibernateEntity emp= new EmpHibernateEntity(ep);
			session.update(emp);
			tr.commit();
		}catch(Exception e) {
			System.out.println("Error with update block");
			tr.rollback();
			session.close();			
		}
	}

	public static List<EmpPojo> listEmpDetails() {
		
		SessionFactory sf = null;
		Session session = null;
		Transaction tr = null;
		List<EmpPojo> list = new ArrayList<>();
		
		try {
			sf=dao.HibernateUtil.getSessionFactory();
			session = sf.openSession();
			String hql = "from EmpHibernateEntity";
			List<EmpHibernateEntity> tmp = new ArrayList<>();
			tmp = session.createQuery(hql).list();
			for (EmpHibernateEntity e: tmp) {
				list.add(new EmpPojo(e));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return list;
		
	}
}
