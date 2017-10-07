package modelo;

import java.util.List;

import dto.ContratoAlquilerDTO;
import persistencia.dao.ContratoAlquilerDAO;

public class ContratoAlquiler {
	
	private ContratoAlquilerDAO contratoAlquiler;	

	public ContratoAlquiler(){
		contratoAlquiler = new ContratoAlquilerDAO();
	}
	
	public void agregarContratoAlquiler(ContratoAlquilerDTO nuevoContratoAlquiler){
		contratoAlquiler.insert(nuevoContratoAlquiler);
	}
	
	public void borrarContratoAlquiler(ContratoAlquilerDTO eliminarContratoAlquiler){
		contratoAlquiler.delete(eliminarContratoAlquiler);
	}
	
	public void actualizarContratoAlquiler(ContratoAlquilerDTO modificarContratoAlquiler, int idContratoAlquiler){
		contratoAlquiler.update(modificarContratoAlquiler, idContratoAlquiler);
	}
	
	public List<ContratoAlquilerDTO> obtenerContratoAlquiler(){
		return contratoAlquiler.readAll();		
	}
	
	public boolean buscarContratoAlquiler(ContratoAlquilerDTO buscarContratoAlquiler){
		return contratoAlquiler.seleccionar(buscarContratoAlquiler);
	}

}
