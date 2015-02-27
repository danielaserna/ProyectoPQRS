package test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import co.edu.ude.iw.PQRS.dto.Product;
import co.edu.ude.iw.PQRS.dto.ProductType;
import co.edu.ude.iw.PQRS.exception.IWDaoException;
import co.edu.udea.iw.PQRS.dao.hibernate.ProductDAOHibernate;
import co.edu.udea.iw.PQRS.dao.hibernate.ProductTypeDAOHibernate;

@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@ContextConfiguration(locations = "classpath:/co/edu/ude/iw/PQRS/spring/config/SpringConfig.xml")
public class ProductTypeDAOHibernateTest {

	@Autowired
	private ProductTypeDAOHibernate productTypeHibernate;
	
	@Test
	public void testGet() {
		List<ProductType> productTypeList = null;
		
		try {
			productTypeList = productTypeHibernate.get();
			
			for(ProductType product : productTypeList){
				System.out.println(product.getType());
			}
			
			assertTrue(true);
			
		} catch (IWDaoException e) {
			// TODO: handle exception
			fail(e.getMessage());
		}
	}

	@Test
	public void testObtener() {
		fail("Not yet implemented");
	}

}
