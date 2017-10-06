package dto;

import java.sql.Date;

public class CitaDTO {
	private int idCita;
	private int personaInteresada;
	private int personaReferente;
	private int usuario;
	private String horaInicio;
	private String horaFin;
	private Date fecha;
	private int idInmueble;
	private String direccion;
	private String asunto;
	private String descripcion;
	
	public CitaDTO(
		int idCita,
		int personaInteresada,
		int personaReferente,
		int usuario,
		String horaInicio,
		String horaFin,
		Date fecha,
		int idInmueble,
		String direccion,
		String asunto,
		String descripcion)
	{
		this.idCita = idCita;
		this.personaInteresada = personaInteresada;
		this.personaReferente = personaReferente;
		this.usuario = usuario;
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
		this.fecha = fecha;
		this.idInmueble = idInmueble;
		this.direccion = direccion;
		this.asunto= asunto;
		this.descripcion = descripcion;
	}
	
	public int getIdCita() {
		return idCita;
	}
	public void setIdCita(int idCita) {
		this.idCita = idCita;
	}
	public int getPersonaInteresada() {
		return personaInteresada;
	}
	public void setPersonaInteresada(int personaInteresada) {
		this.personaInteresada = personaInteresada;
	}
	public int getPersonaReferente() {
		return personaReferente;
	}
	public void setPersonaReferente(int personaReferente) {
		this.personaReferente = personaReferente;
	}
	public int getUsuario() {
		return usuario;
	}
	public void setUsuario(int usuario) {
		this.usuario = usuario;
	}
	public String getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}
	public String getHoraFin() {
		return horaFin;
	}
	public void setHoraFin(String horaFin) {
		this.horaFin = horaFin;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public int getIdInmueble() {
		return idInmueble;
	}
	public void setIdInmueble(int idInmueble) {
		this.idInmueble = idInmueble;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getAsunto() {
		return asunto;
	}
	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
