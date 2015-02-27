package co.edu.ude.iw.PQRS.dto;

import java.io.Serializable;

/**
 * Clase dto para los datos de los productos
 * @author Daniela
 *
 */
public class Product implements Serializable{

	/**
	 * Identificación del producto
	 */
	private Integer idProduct;
	
	/**
	 * Descripción del producto
	 */
	private String description;
	
	/**
	 * Tipo de producto
	 */
	private ProductType type;
	
	public Integer getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(Integer idProduct) {
		this.idProduct = idProduct;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public ProductType getType() {
		return type;
	}
	public void setType(ProductType type) {
		this.type = type;
	}
	
	
}
