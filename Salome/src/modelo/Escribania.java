package modelo;

import java.util.List;

import dto.EscribaniaDTO;
import persistencia.dao.EscribaniaDAO;

public class Escribania {
	
	private EscribaniaDAO escribania;	

	public Escribania(){
		escribania = new EscribaniaDAO();
	}
	
	public void agregarEscribania(EscribaniaDTO nuevaEscribania){
		escribania.insert(nuevaEscribania);
	}
	
	public void borrarEscribania(EscribaniaDTO eliminarEscribania){
		escribania.delete(eliminarEscribania);
	}
	
	public void actualizarEscribania(EscribaniaDTO modificarEscribania, int idEscribania){
		escribania.update(modificarEscribania, idEscribania);
	}
	
	public List<EscribaniaDTO> obtenerEscribanias(){
		return escribania.readAll();		
	}
	
	public boolean buscarEscribania(EscribaniaDTO buscarEscribania){
		return escribania.seleccionar(buscarEscribania);
	}

}
