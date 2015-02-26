package co.edu.udea.iw.PQRS.services.impl;

import co.edu.ude.iw.PQRS.dto.Client;
import co.edu.ude.iw.PQRS.dto.Product;
import co.edu.ude.iw.PQRS.dto.Solicitude;
import co.edu.ude.iw.PQRS.dto.SolicitudeType;
import co.edu.ude.iw.PQRS.dto.Sucursal;
import co.edu.ude.iw.PQRS.exception.IWDaoException;
import co.edu.ude.iw.PQRS.exception.IWServiceException;
import co.edu.udea.iw.PQRS.dao.hibernate.SolicitudeDAOHibernate;
import co.edu.udea.iw.PQRS.services.ISolicitudeService;

public class SolicitudeService implements ISolicitudeService {

	private SolicitudeDAOHibernate solicitudeDAOHibernate;

	public void insertSolicitude(String description, String idSolicitude,
			String solicitudeType, String idSucursal, String idNumber,
			String idProduct) throws IWDaoException, IWServiceException {

		Solicitude solicitude = null;

		if (description == null && "".equals(description)) {
			throw new IWServiceException(
					"La descripción de la solicitud no puede ser nula o vacia");
		}
		if (idSolicitude == null && "".equals(idSolicitude)) {
			throw new IWServiceException(
					"La identificación de la solicitud no puede se vacia o nula");
		}
		if (solicitudeType == null && "".equals(solicitudeType)) {
			throw new IWServiceException(
					"Debe elegir un tipo de solicitud, no puede ser nulo o vacio");
		}
		if (idSucursal == null && "".equals(idSucursal)) {
			throw new IWServiceException(
					"La identificacion de la sucursal no puede ser vacia o nula");
		}

		solicitude.setDescription(description);
		
		Client client = new Client();
		client.setIdNumber(Integer.parseInt(idNumber));
		
		Product product = new Product();
		product.setIdProduct(Integer.parseInt(idProduct));
		solicitude.setIdNumber(client);
		solicitude.setIdProduct(product);
		solicitude.setIdSolicitude(Integer.parseInt(idSolicitude));
		
		SolicitudeType typeSolicitude = new SolicitudeType();
		typeSolicitude.setIdSolicitudType(solicitudeType);
		
		Sucursal sucursal = new Sucursal();
		sucursal.setIdSucursal(Integer.parseInt(idSucursal));
		
		solicitude.setIdSucursal(sucursal);
		
		solicitudeDAOHibernate.insert(solicitude);

	}

}
