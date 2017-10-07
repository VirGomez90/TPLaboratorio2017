package modelo;

import java.util.List;

import dto.ContratoCompraVentaDTO;
import persistencia.dao.ContratoCompraVentaDAO;

public class ContratoCompraVenta {
	
	private ContratoCompraVentaDAO contratoCompraVenta;	

	public ContratoCompraVenta(){
		contratoCompraVenta = new ContratoCompraVentaDAO();
	}
	
	public void agregarContratoCompraVenta(ContratoCompraVentaDTO nuevoContratoCompraVenta){
		contratoCompraVenta.insert(nuevoContratoCompraVenta);
	}
	
	public void borrarContratoCompraVenta(ContratoCompraVentaDTO eliminarContratoCompraVenta){
		contratoCompraVenta.delete(eliminarContratoCompraVenta);
	}
	
	public void actualizarContratoCompraVenta(ContratoCompraVentaDTO modificarContratoCompraVenta, int idContratoCompraVenta){
		contratoCompraVenta.update(modificarContratoCompraVenta, idContratoCompraVenta);
	}
	
	public List<ContratoCompraVentaDTO> obtenerContratoCompraVenta(){
		return contratoCompraVenta.readAll();		
	}
	
	public boolean buscarContratoCompraVenta(ContratoCompraVentaDTO buscarContratoCompraVenta){
		return contratoCompraVenta.seleccionar(buscarContratoCompraVenta);
	}


}
