package co.edu.udea.iw.PQRS.dao.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Restrictions;

import co.edu.ude.iw.PQRS.dto.City;
import co.edu.ude.iw.PQRS.exception.IWDaoException;
import co.edu.udea.iw.PQRS.dao.*;

public class CityDAOHibernate implements CityDAO {

	public List<City> get() throws IWDaoException {
		
		List<City> cities = new ArrayList<City>();
		
		try{
			Session session = HibernateSessionFactory.getInstancia().getSession();
			
			Criteria criteria = session.createCriteria(City.class);
			
			cities = criteria.list();
			
		}catch(HibernateException e){
			throw new IWDaoException(e);
		}
		
			return cities;
	}

	public City obtener(Integer code) throws IWDaoException {
		
		City city = null;
		
		try{
			Session session = HibernateSessionFactory.getInstancia().getSession();
			
			Criteria criteria = session.createCriteria(City.class)
					.add(Restrictions.eq("codigo",code))  ;
			
			city = (City) criteria.uniqueResult();
			
			
		}catch(HibernateException e){
			throw new IWDaoException(e);
		}
		
		return city;
	
	}

}
