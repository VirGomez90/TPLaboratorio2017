package modelo;

import java.util.List;

import dto.InmobiliariaColegaDTO;
import persistencia.dao.InmobiliariaColegaDAO;

public class InmobiliariaColega {
	
	private InmobiliariaColegaDAO inmobiliariaColega;	

	public InmobiliariaColega(){
		inmobiliariaColega = new InmobiliariaColegaDAO();
	}
	
	public void agregarInmobiliariaColega(InmobiliariaColegaDTO nuevaInmobiliariaColega){
		inmobiliariaColega.insert(nuevaInmobiliariaColega);
	}
	
	public void borrarInmobiliariaColega(InmobiliariaColegaDTO eliminarInmobiliariaColega){
		inmobiliariaColega.delete(eliminarInmobiliariaColega);
	}
	
	public void actualizarInmobiliariaColega(InmobiliariaColegaDTO modificarInmobiliariaColega, int idInmobiliariaColega){
		inmobiliariaColega.update(modificarInmobiliariaColega, idInmobiliariaColega);
	}
	
	public List<InmobiliariaColegaDTO> obtenerInmobiliariasColegas(){
		return inmobiliariaColega.readAll();		
	}
	
	public boolean buscarCita(InmobiliariaColegaDTO buscarInmobiliariaColega){
		return inmobiliariaColega.seleccionar(buscarInmobiliariaColega);
	}

}
