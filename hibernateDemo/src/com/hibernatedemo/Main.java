package com.hibernatedemo;

//import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		SessionFactory factoty = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(City.class)
				.buildSessionFactory();
		
		//Unit of Work
		Session session = factoty.getCurrentSession();
		
		try{
			session.beginTransaction();
			//HQL--->Hibarnate Query Language
			//Select * from city
			//"from City c where c.countryCode = 'TUR' AND  c.district = 'Ankara' "
			//"from City c where c.name LIKE '%kar%'  
			//"from City c ORDER BY c.name   "
			//ASC-->AScending ->>>>YUKSELEN
			//DESC--->DEscending ->>>ALCALAN
			
			/*
			 * List<String> cities = session.
			 * createQuery(" select c . countryCode from City c GRUP BY c.contryCode ").
			 * getResultList();
			 * 
			 * for(String countryCode :countryCode) { System.out.println(countryCode); }
			 */
			
//			//Insert
//			City city = new City();
//			city.setName("Ankara");
//			city.setCountryCode("TUR");
//			city.setDistrict("Akdeniz");
//			city.setPopulation(100000);
//			
//			session.save(city);
			
			
			//IPDATE
		//City city	=session.get(City.class, 4086);
		//city.setPopulation(11000000);
		
			//session.save(city);
			
			//CRUD Create Read Update Delete
			
			//DELETE
			City city = session .get(City.  class ,4086);
			session.delete(city);
			
		session.getTenantIdentifier();
			session.getTenantIdentifier();	
			System.out.println("Þehir güncellendi !");
		}finally {
			factoty.close();
		}

	}

}
