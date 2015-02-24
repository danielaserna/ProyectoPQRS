package co.edu.ude.iw.PQRS.dto;

/**
 * Clase dto para los datos de las solicitudes
 * @author Daniela
 *
 */
public class Solicitude {

	/**
	 * Identificador de la solicitud
	 */
	private Integer idSolicitude;
	
	/**
	 * Descripcion de la solicitud
	 */
	private String description;
	
	/**
	 * Tipo de solicitud
	 */
	private SolicitudeType solicitudeType;
	
	/**
	 * Identificador del producto de la solicitud
	 */
	private Product idProduct;
	
	/**
	 * Identificador de la sucursal a la que se le realiza la solicitud
	 */
	private Sucursal idSucursal;
	
	/**
	 * Identificaci�n del cliente que realiza la solicitud
	 */
	private Client idNumber;
	
	
	public Integer getIdSolicitude() {
		return idSolicitude;
	}
	public void setIdSolicitude(Integer idSolicitude) {
		this.idSolicitude = idSolicitude;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public SolicitudeType getSolicitudeType() {
		return solicitudeType;
	}
	public void setSolicitudeType(SolicitudeType solicitudeType) {
		this.solicitudeType = solicitudeType;
	}
	public Product getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(Product idProduct) {
		this.idProduct = idProduct;
	}
	public Sucursal getIdSucursal() {
		return idSucursal;
	}
	public void setIdSucursal(Sucursal idSucursal) {
		this.idSucursal = idSucursal;
	}
	public Client getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(Client idNumber) {
		this.idNumber = idNumber;
	}
	
	
	
}