package modelo;

import java.util.List;

import dto.InteresadoDTO;
import persistencia.dao.InteresadoDAO;

public class Interesado {
	
	private InteresadoDAO interesado;	

	public Interesado(){
		interesado = new InteresadoDAO();
	}
	
	public void agregarInteresado(InteresadoDTO nuevoInteresado){
		interesado.insert(nuevoInteresado);
	}
	
	public void borrarInteresado(InteresadoDTO eliminarInteresado){
		interesado.delete(eliminarInteresado);
	}
	
	public void actualizarInteresado(InteresadoDTO modificarInteresado, int idInteresado){
		interesado.update(modificarInteresado, idInteresado);
	}
	
	public List<InteresadoDTO> obtenerInteresados(){
		return interesado.readAll();		
	}
	
	public boolean buscarInteresado(InteresadoDTO buscarInteresado){
		return interesado.seleccionar(buscarInteresado);
	}

}
