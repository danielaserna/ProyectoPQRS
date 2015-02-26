package co.edu.udea.iw.PQRS.services.impl;

import co.edu.ude.iw.PQRS.dto.Client;
import co.edu.ude.iw.PQRS.dto.Profile;
import co.edu.ude.iw.PQRS.exception.IWDaoException;
import co.edu.ude.iw.PQRS.exception.IWServiceException;
import co.edu.udea.iw.PQRS.dao.hibernate.ClientDAOHibernate;
import co.edu.udea.iw.PQRS.services.IClientService;

public class ClientService implements IClientService {

	private ClientDAOHibernate clientDAO;

	public ClientDAOHibernate getClientDAO() {
		return clientDAO;
	}

	public void setClientDAO(ClientDAOHibernate clientDAO) {
		this.clientDAO = clientDAO;
	}

	public void saveClient(String fullname, String lastName,
			String cellphoneNumber, String email, Integer idNumber,
			String phoneNumber, String profile) throws IWDaoException,
			IWServiceException {

		Client client = null;
		if (idNumber == null && "".equals(idNumber.toString())) {
			throw new IWServiceException(
					"La identificación del cliente no puede ser nula o vacia");
		}
		if (fullname == null && "".equals(fullname)) {
			throw new IWServiceException(
					"El nombre del cliente no puede ser nulo o vacio");
		}
		if (lastName == null && "".equals(lastName)) {
			throw new IWServiceException(
					"El apellido del cliente no puede ser nulo o vacio");
		}
		if (email == null && "".equals(email)) {
			throw new IWServiceException(
					"El correo electronico del cliente no puede ser nulo o vacio");
		}
		if (cellphoneNumber == null && "".equals(cellphoneNumber)) {
			throw new IWServiceException(
					"El telefono celular del cliente no puede ser nulo o vacio");
		}

		client.setFullName(fullname);
		client.setLastName(lastName);
		client.setIdNumber(idNumber);
		client.setEmail(email);
		client.setCellphoneNumber(cellphoneNumber);
		Profile profileAux = new Profile();
		profileAux.setProfile(profile);
		client.setProfile(profileAux);
		client.setPhoneNumber(phoneNumber);

		clientDAO.insert(client);

	}

}
