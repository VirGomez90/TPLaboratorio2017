package modelo;

import java.util.List;

import dto.LocalidadDTO;
import persistencia.dao.LocalidadDAO;

public class Localidad {
	
	private LocalidadDAO localidad;	

	public Localidad(){
		localidad = new LocalidadDAO();
	}
	
	public void agregarLocalidad(LocalidadDTO nuevaLocalidad){
		localidad.insert(nuevaLocalidad);
	}
	
	public void borrarLocalidad(LocalidadDTO eliminarLocalidad){
		localidad.delete(eliminarLocalidad);
	}
	
	public void actualizarLocalidad(LocalidadDTO modificarLocalidad, String descripcionLocalidad){
		localidad.update(modificarLocalidad, descripcionLocalidad);
	}
	
	public List<LocalidadDTO> obtenerLocalidades(){
		return localidad.readAll();		
	}
	
}
