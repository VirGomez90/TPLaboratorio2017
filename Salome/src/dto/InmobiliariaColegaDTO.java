package dto;

public class InmobiliariaColegaDTO {
	private int cuit;
	private String razonSocial;
	private String localidad;
	private String calle;
	private String altura;
	private String depto;
	private String mail;
	private String telefono;
	private String telefonoOpcional;
	
	public InmobiliariaColegaDTO(
		int cuit,
		String razonSocial,
		String localidad,
		String calle,
		String altura,
		String depto,
		String mail,
		String telefono,
		String telefonoOpcional)
	{
		this.cuit = cuit;
		this.razonSocial = razonSocial;
		this.localidad = localidad;
		this.calle = calle;
		this.altura = altura;
		this.depto = depto;
		this.mail = mail;
		this.telefono = telefono;
		this.telefonoOpcional = telefonoOpcional;
	}	
	
	public int getCuit() {
		return cuit;
	}
	public void setCuit(int cuit) {
		this.cuit = cuit;
	}
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getAltura() {
		return altura;
	}
	public void setAltura(String altura) {
		this.altura = altura;
	}
	public String getDepto() {
		return depto;
	}
	public void setDepto(String depto) {
		this.depto = depto;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getTelefonoOpcional() {
		return telefonoOpcional;
	}
	public void setTelefonoOpcional(String telefonoOpcional) {
		this.telefonoOpcional = telefonoOpcional;
	}
	
	
}
