package dto;

import java.sql.Date;

public class EgresosDTO {

	private int idEgresos;
	private Date fecha;
	private String descripcion;
	private int monto;
	private String tipo;
	
	public EgresosDTO (
		int idEgresos,
		Date fecha,
		String descripcion,
		int monto,
		String tipo)
	{
		this.idEgresos = idEgresos;
		this.fecha = fecha;
		this.descripcion = descripcion;
		this.monto = monto;
		this.tipo = tipo;
	}
	
	public int getIdEgresos() {
		return idEgresos;
	}
	public void setIdEgresos(int idEgresos) {
		this.idEgresos = idEgresos;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getMonto() {
		return monto;
	}
	public void setMonto(int monto) {
		this.monto = monto;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
