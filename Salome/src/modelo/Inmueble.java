package modelo;

import java.util.List;

import dto.InmuebleDTO;
import persistencia.dao.InmuebleDAO;

public class Inmueble {
	
	private InmuebleDAO inmueble;	

	public Inmueble(){
		inmueble = new InmuebleDAO();
	}
	
	public void agregarInmueble(InmuebleDTO nuevoInmueble){
		inmueble.insert(nuevoInmueble);
	}
	
	public void borrarInmueble(InmuebleDTO eliminarInmueble){
		inmueble.delete(eliminarInmueble);
	}
	
	public void actualizarInmueble(InmuebleDTO modificarInmueble, int idInmueble){
		inmueble.update(modificarInmueble, idInmueble);
	}
	
	public List<InmuebleDTO> obtenerInmuebles(){
		return inmueble.readAll();		
	}
	
	public boolean buscarInmueble(InmuebleDTO buscarInmueble){
		return inmueble.seleccionar(buscarInmueble);
	}

}
