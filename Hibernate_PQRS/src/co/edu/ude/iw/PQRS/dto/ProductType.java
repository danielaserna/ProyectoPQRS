package co.edu.ude.iw.PQRS.dto;

import java.io.Serializable;

/**
 * Clase dto para los datos del tipo de producto
 * @author Daniela
 *
 */
public class ProductType implements Serializable{
	
	/**
	 * Tipo de producto
	 */
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	

}
