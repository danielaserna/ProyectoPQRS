package co.edu.udea.iw.PQRS.services;

import co.edu.ude.iw.PQRS.exception.IWDaoException;
import co.edu.ude.iw.PQRS.exception.IWServiceException;

public interface ISolicitudeService {

	public void insertSolicitude(String description, String idSolicitude,
			String solicitudeType, String idSucursal, String idNumber, String idProduct) throws IWDaoException,
			IWServiceException;

}
