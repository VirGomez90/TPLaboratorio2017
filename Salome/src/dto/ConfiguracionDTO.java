package dto;


public class ConfiguracionDTO {

	private String ip;
	private String puerto;
	private String usuario;
	private String password;
	private String nombrebasedatos;
	
	

	/**
	 * ctor
	 * @param*/
	public ConfiguracionDTO(String ip, String puerto, String usuario, String password, String bd) {
		setIp(ip);
		setPuerto(puerto);
		setUsuario(usuario);
		setPassword(password);
		setNombrebasedatos(bd);
	}


	/**
	 * ctor
	 * @param
	 * */
	public ConfiguracionDTO() {
		setIp("xxx");
		setPuerto("xxx");
		setUsuario("xxx");
		setPassword("xxx");
		setNombrebasedatos("xxx");
	}


	/**
	 * @return the ip
	 */
	public String getIp() {
		return ip;
	}


	/**
	 * @return the puerto
	 */
	public String getPuerto() {
		return puerto;
	}


	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}


	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}


	/**
	 * @return the nombrebasedatos
	 */
	public String getNombrebasedatos() {
		return nombrebasedatos;
	}


	/**
	 * @param ip the ip to set
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}


	/**
	 * @param puerto the puerto to set
	 */
	public void setPuerto(String puerto) {
		this.puerto = puerto;
	}


	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}


	/**
	 * @param nombrebasedatos the nombrebasedatos to set
	 */
	public void setNombrebasedatos(String nombrebasedatos) {
		this.nombrebasedatos = nombrebasedatos;
	}

}
