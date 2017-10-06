package dto;

import java.sql.Date;

public class ContratoCompraVentaDTO {
	
	private int idBoleto;
	private int vendedor;
	private int comprador;
	private Date fecha;
	private int valor;
	private int comision;
	private int idInmueble;
	
	public ContratoCompraVentaDTO(
		int idBoleto,
		int vendedor,
		int comprador,
		Date fecha,
		int valor,
		int comision,
		int idInmueble)
	{
		this.idBoleto = idBoleto;
		this.vendedor = vendedor;
		this.comprador = comprador;
		this.fecha = fecha;
		this.valor = valor;
		this.comision = comision;
		this.idInmueble = idInmueble;
	}
	
	public int getIdBoleto() {
		return idBoleto;
	}
	public void setIdBoleto(int idBoleto) {
		this.idBoleto = idBoleto;
	}
	public int getVendedor() {
		return vendedor;
	}
	public void setVendedor(int vendedor) {
		this.vendedor = vendedor;
	}
	public int getComprador() {
		return comprador;
	}
	public void setComprador(int comprador) {
		this.comprador = comprador;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public int getComision() {
		return comision;
	}
	public void setComision(int comision) {
		this.comision = comision;
	}
	public int getIdInmueble() {
		return idInmueble;
	}
	public void setIdInmueble(int idInmueble) {
		this.idInmueble = idInmueble;
	}
	
}
