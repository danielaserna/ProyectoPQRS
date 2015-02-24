package co.edu.udea.iw.PQRS.dao;

import java.util.List;

import co.edu.ude.iw.PQRS.dto.City;
import co.edu.ude.iw.PQRS.exception.IWDaoException;

public interface CityDAO {

	//Entrega la lista de ciudades existentes en la base de datos
			public  List<City>   get() throws IWDaoException;
			
		//Entrega los datos de una ciudad dado su codigo
			public City obtener(Integer code) throws IWDaoException;
}
