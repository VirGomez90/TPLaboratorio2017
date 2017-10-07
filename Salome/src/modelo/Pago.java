package modelo;

import java.util.List;

import dto.PagoDTO;
import persistencia.dao.PagoDAO;

public class Pago {
	
	private PagoDAO pago;	

	public Pago(){
		pago = new PagoDAO();
	}
	
	public void agregarPago(PagoDTO nuevoPago){
		pago.insert(nuevoPago);
	}
	
	public void borrarPago(PagoDTO eliminarPago){
		pago.delete(eliminarPago);
	}
	
	public void actualizarPago(PagoDTO modificarPago, int idPago){
		pago.update(modificarPago, idPago);
	}
	
	public List<PagoDTO> obtenerPagos(){
		return pago.readAll();		
	}
	
	public boolean buscarPago(PagoDTO buscarPago){
		return pago.seleccionar(buscarPago);
	}

}
