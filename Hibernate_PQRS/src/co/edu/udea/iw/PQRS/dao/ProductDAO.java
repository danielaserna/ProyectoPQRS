package co.edu.udea.iw.PQRS.dao;

import java.util.List;

import co.edu.ude.iw.PQRS.dto.Product;
import co.edu.ude.iw.PQRS.exception.IWDaoException;

public interface ProductDAO {

	//Entrega la lista de productos existentes en la base de datos
	public List<Product> get() throws IWDaoException;
	
	//Entrega los datos de una sucursal dado su codigo
	public Product get(Integer idProduct) throws IWDaoException;
}
