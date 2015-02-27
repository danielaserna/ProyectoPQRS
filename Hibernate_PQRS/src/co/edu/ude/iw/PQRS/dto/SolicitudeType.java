package co.edu.ude.iw.PQRS.dto;

import java.io.Serializable;

/**
 * Clase dto para los datos del Tipo de Solicitud
 * @author Daniela
 *
 */
public class SolicitudeType implements Serializable{
 
	/**
	 * Identificación del tipo de solictud
	 */
	private String idSolicitudType;
	
	/**
	 * Descripción del tipo de solicitud
	 */
	private String description;

	public String getIdSolicitudType() {
		return idSolicitudType;
	}

	public void setIdSolicitudType(String idSolicitudType) {
		this.idSolicitudType = idSolicitudType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
