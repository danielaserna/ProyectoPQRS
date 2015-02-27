package test;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import co.edu.ude.iw.PQRS.dto.City;
import co.edu.ude.iw.PQRS.exception.IWDaoException;
import co.edu.udea.iw.PQRS.dao.hibernate.CityDAOHibernate;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/co/edu/ude/iw/PQRS/spring/config/SpringConfig.xml")
public class CityDAOHibernateTest {
	
	@Autowired
	CityDAOHibernate cityDAOHibernate;
	private static Logger logger = Logger.getLogger(CityDAOHibernate.class);

	@Test
	public void testObtener() {
		
		try {
			City city = cityDAOHibernate.obtener(new Integer(1));
			System.out.println(city.getName());
			assertTrue(true);
		} catch (IWDaoException e) {
			logger.debug("Excepción obteniendo todos los usuarios: "
					+ e.getLocalizedMessage());
		}
		
	}
	
	@Test
	public void testGet(){
		List<City> cityList = null;
		
		try {
			cityList = cityDAOHibernate.get();
			for (City city : cityList){
				System.out.println(city.getName());
			}
			
			assertTrue(true);
		} catch (IWDaoException e) {
			fail(e.getMessage());
		}
	}

}
