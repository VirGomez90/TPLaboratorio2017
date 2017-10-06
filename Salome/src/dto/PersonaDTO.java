package dto;

public class PersonaDTO {
	private int dni;
	private String nombre;
	private String apellido;
	private String localidad;
	private String calle;
	private String altura;
	private String depto;
	private String mail;
	private String mailTrabajo;
	private String telefono;
	private String telefonoCasa;
	private String telefonoTrabajo;
	
	public PersonaDTO(
			int dni,
			String nombre,
			String apellido,
			String localidad,
			String calle,
			String altura,
			String depto,
			String mail,
			String mailTrabajo,
			String telefono,
			String telefonoCasa,
			String telefonoTrabajo)
	{
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.localidad = localidad;
		this.calle = calle;
		this.altura = altura;
		this.depto = depto;
		this.mail = mail;
		this.mailTrabajo = mailTrabajo;
		this.telefono = telefono;
		this.telefonoCasa = telefonoCasa;
		this.telefonoTrabajo = telefonoTrabajo;
		
	}	
	
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
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
	public String getMailTrabajo() {
		return mailTrabajo;
	}
	public void setMailTrabajo(String mailTrabajo) {
		this.mailTrabajo = mailTrabajo;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getTelefonoCasa() {
		return telefonoCasa;
	}
	public void setTelefonoCasa(String telefonoCasa) {
		this.telefonoCasa = telefonoCasa;
	}
	public String getTelefonoTrabajo() {
		return telefonoTrabajo;
	}
	public void setTelefonoTrabajo(String telefonoTrabajo) {
		this.telefonoTrabajo = telefonoTrabajo;
	}

	
}