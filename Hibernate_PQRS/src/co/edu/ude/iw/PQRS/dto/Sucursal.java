package co.edu.ude.iw.PQRS.dto;

/**
 * Clase dto para los datos de las sucursales
 * @author Daniela
 *
 */
public class Sucursal {

	/**
	 * Identificador de la sucursal
	 */
	private Integer idSucursal;
	
	/**
	 * Nombre de la sucursal
	 */
	private String nombre;
	
	/**
	 * Codigo de la ciudad donde esta ubicada la sucursal
	 */
	private City code;

	public Integer getIdSucursal() {
		return idSucursal;
	}

	public void setIdSucursal(Integer idSucursal) {
		this.idSucursal = idSucursal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public City getCode() {
		return code;
	}

	public void setCode(City code) {
		this.code = code;
	}
	
	
}