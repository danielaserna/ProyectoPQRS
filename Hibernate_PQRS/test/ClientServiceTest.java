package test;

import static org.junit.Assert.*;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import co.edu.ude.iw.PQRS.exception.IWDaoException;
import co.edu.ude.iw.PQRS.exception.IWServiceException;
import co.edu.udea.iw.PQRS.dao.hibernate.ClientDAOHibernate;
import co.edu.udea.iw.PQRS.services.impl.ClientService;

@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@ContextConfiguration(locations = "classpath:/co/edu/ude/iw/PQRS/spring/config/SpringConfig.xml")
public class ClientServiceTest {

	@Autowired
	private ClientService clientService;

	private static Logger logger = Logger.getLogger(ClientDAOHibernate.class);

	@Test
	public void testSaveClient() throws IWDaoException, IWServiceException {
		Integer idnumber = new Integer(12345);
		clientService.saveClient("Yefry", "Calderon", "3143423",
				"alexis@gmail.com", idnumber, "2341221", "cliente");
	}

}
