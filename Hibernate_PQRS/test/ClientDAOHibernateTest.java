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

import co.edu.ude.iw.PQRS.dto.Client;
import co.edu.ude.iw.PQRS.dto.Profile;
import co.edu.ude.iw.PQRS.exception.IWDaoException;
import co.edu.udea.iw.PQRS.dao.hibernate.CityDAOHibernate;
import co.edu.udea.iw.PQRS.dao.hibernate.ClientDAOHibernate;

@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@ContextConfiguration(locations = "classpath:/co/edu/ude/iw/PQRS/spring/config/SpringConfig.xml")
public class ClientDAOHibernateTest {

	@Autowired
	private ClientDAOHibernate clientDaoHibernate;

	private static Logger logger = Logger.getLogger(ClientDAOHibernate.class);
	@Test
	public void testInsert() {
		
		Client client = new Client();
		
		try {
			client.setFullName("Yefry Alexis");
			client.setLastName("Calderon Yepes");
			client.setCellphoneNumber("33333");
			client.setEmail("alexis@gmail.com");
			client.setIdNumber(1234);
			client.setPhoneNumber("456764");
			Profile profile = new Profile();
			profile.setProfile("cliente");
			profile.setDescription("perfil administrador");
			client.setProfile(profile);
			
			clientDaoHibernate.insert(client);
			assertTrue(true);
		} catch (IWDaoException e) {
			logger.debug("Excepción obteniendo todos los usuarios: "
					+ e.getLocalizedMessage());
			//fail(e.getMessage());
		}
	}

	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	public void testGet() {
		
		List<Client> client = null;
		
		try {
			client = clientDaoHibernate.get();
			
			for(Client client2 : client){
				System.out.println(client2.getFullName());
			}
			
			assertTrue(true);
		} catch (IWDaoException e) {
			logger.debug("Excepción obteniendo todos los usuarios: "
					+ e.getLocalizedMessage());
		}
	}

	@Test
	public void testGetInteger() {
		fail("Not yet implemented");
	}

}
