package dto;

public class PagoDTO {
	private int idPago;
	private int idContrato;
	private int mes;
	private int pagoDuenio;
	private int cobroInqui;
	private int valor;
	private int interes;
	private int monto;
	
	public PagoDTO(
		int idPago,
		int idContrato,
		int mes,
		int pagoDuenio,
		int cobroInqui,
		int valor,
		int interes,
		int monto)
	{
		this.idPago = idPago;
		this.idContrato = idContrato;
		this.mes = mes;
		this.pagoDuenio = pagoDuenio;
		this.cobroInqui = cobroInqui;
		this.valor = valor;
		this.interes= interes;
		this.monto= monto;
	}
	
	public int getIdPago() {
		return idPago;
	}
	public void setIdPago(int idPago) {
		this.idPago = idPago;
	}
	public int getIdContrato() {
		return idContrato;
	}
	public void setIdContrato(int idContrato) {
		this.idContrato = idContrato;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getPagoDuenio() {
		return pagoDuenio;
	}
	public void setPagoDuenio(int pagoDuenio) {
		this.pagoDuenio = pagoDuenio;
	}
	public int getCobroInqui() {
		return cobroInqui;
	}
	public void setCobroInqui(int cobroInqui) {
		this.cobroInqui = cobroInqui;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public int getInteres() {
		return interes;
	}
	public void setInteres(int interes) {
		this.interes = interes;
	}

	public int getMonto() {
		return monto;
	}

	public void setMonto(int monto) {
		this.monto = monto;
	}
	

}
