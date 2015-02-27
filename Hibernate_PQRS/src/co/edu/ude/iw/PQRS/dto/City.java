package co.edu.ude.iw.PQRS.dto;

import java.io.Serializable;

/**
 * Clase dto para los datos de las ciudades
 * @author Daniela
 *
 */
public class City implements Serializable{

	/**
	 * Codigo de la ciudad
	 */
	private Integer code;
	
	/**
	 * Nombre de la ciudad
	 */
	private String name;
	
	/**
	 * Codigo de area de la ciudad
	 */
	private String areaCode;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	
	
}
