package modelo;

import java.util.List;

import dto.InmuebleImagenDTO;
import persistencia.dao.InmuebleImagenDAO;

public class InmuebleImagen {
	
	private InmuebleImagenDAO inmuebleImagen;	

	public InmuebleImagen(){
		inmuebleImagen = new InmuebleImagenDAO();
	}
	
	public void agregarInmuebleImagen(InmuebleImagenDTO nuevaInmuebleImagen){
		inmuebleImagen.insert(nuevaInmuebleImagen);
	}
	
	public void borrarInmuebleImagen(InmuebleImagenDTO eliminarInmuebleImagen){
		inmuebleImagen.delete(eliminarInmuebleImagen);
	}
	
	public void actualizarInmuebleImagen(InmuebleImagenDTO modificarInmuebleImagen, int idInmuebleImagen){
		inmuebleImagen.update(modificarInmuebleImagen, idInmuebleImagen);
	}
	
	public List<InmuebleImagenDTO> obtenerInmueblesImagenes(){
		return inmuebleImagen.readAll();		
	}
	
	public boolean buscarInmuebleImagen(InmuebleImagenDTO buscarInmuebleImagen){
		return inmuebleImagen.seleccionar(buscarInmuebleImagen);
	}

}
