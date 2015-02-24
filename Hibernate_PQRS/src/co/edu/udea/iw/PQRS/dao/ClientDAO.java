package co.edu.udea.iw.PQRS.dao;

import java.util.List;

import co.edu.ude.iw.PQRS.dto.Client;
import co.edu.ude.iw.PQRS.exception.IWDaoException;

public interface ClientDAO {
		
		public Client insert(Client client) throws IWDaoException;
		
		public Client update(Client client) throws IWDaoException;
		
		public Client delete(Client client)  throws IWDaoException;
		
		public List<Client> get() throws IWDaoException;
		
		public Client get(Integer idNumber) throws IWDaoException;
	}

