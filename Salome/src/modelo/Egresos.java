package modelo;

import java.util.List;

import dto.EgresosDTO;
import persistencia.dao.EgresosDAO;

public class Egresos {
	
	private EgresosDAO egresos;	

	public Egresos(){
		egresos = new EgresosDAO();
	}
	
	public void agregarEgreso(EgresosDTO nuevoEgreso){
		egresos.insert(nuevoEgreso);
	}
	
	public void borrarEgreso(EgresosDTO eliminarEgreso){
		egresos.delete(eliminarEgreso);
	}
	
	public void actualizarEgreso(EgresosDTO modificarEgreso, int idEgreso){
		egresos.update(modificarEgreso, idEgreso);
	}
	
	public List<EgresosDTO> obtenerEgresos(){
		return egresos.readAll();		
	}
	
	public boolean buscarEgreso(EgresosDTO buscarEgreso){
		return egresos.seleccionar(buscarEgreso);
	}

}
