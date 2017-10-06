package dto;

import java.sql.Date;

public class ContratoAlquilerDTO {
	
	private int idContrato;
	private int duenio;
	private int inquilino;
	private Date fechaInicio;
	private Date fechaFin;
	private int idInmueble;
	private int incremento;
	private int porcentajeIncremento;
	private int porcentajeComision;
	private String tipoContrato;
	private int escribania;
	
	public ContratoAlquilerDTO(
		int idContrato,
		int duenio,
		int inquilino,
		Date fechaInicio,
		Date fechaFin,
		int idInmueble,
		int incremento,
		int porcentajeIncremento,
		int porcentajeComision,
		String tipoContrato,
		int escribania)
	{
		this.idContrato = idContrato;
		this.duenio = duenio;
		this.inquilino = inquilino;
		this.fechaInicio = fechaInicio;
		this.fechaFin =  fechaFin;
		this.idInmueble =  idInmueble;
		this.incremento = incremento;
		this.porcentajeIncremento = porcentajeIncremento;
		this.porcentajeComision =  porcentajeComision;
		this.tipoContrato = tipoContrato;
		this.escribania = escribania;
		
	}
	
	public int getIdContrato() {
		return idContrato;
	}
	public void setIdContrato(int idContrato) {
		this.idContrato = idContrato;
	}
	public int getDuenio() {
		return duenio;
	}
	public void setDuenio(int duenio) {
		this.duenio = duenio;
	}
	public int getInquilino() {
		return inquilino;
	}
	public void setInquilino(int inquilino) {
		this.inquilino = inquilino;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Date getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	public int getIdInmueble() {
		return idInmueble;
	}
	public void setIdInmueble(int idInmueble) {
		this.idInmueble = idInmueble;
	}
	public int getIncremento() {
		return incremento;
	}
	public void setIncremento(int incremento) {
		this.incremento = incremento;
	}
	public int getPorcentajeIncremento() {
		return porcentajeIncremento;
	}
	public void setPorcentajeIncremento(int porcentajeIncremento) {
		this.porcentajeIncremento = porcentajeIncremento;
	}
	public int getPorcentajeComision() {
		return porcentajeComision;
	}
	public void setPorcentajeComision(int porcentajeComision) {
		this.porcentajeComision = porcentajeComision;
	}
	public String getTipoContrato() {
		return tipoContrato;
	}
	public void setTipoContrato(String tipoContrato) {
		this.tipoContrato = tipoContrato;
	}
	public int getEscribania() {
		return escribania;
	}
	public void setEscribania(int escribania) {
		this.escribania = escribania;
	}

}
