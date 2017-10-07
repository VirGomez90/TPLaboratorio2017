package modelo;

import java.util.List;

import persistencia.dao.CitaDAO;
import dto.CitaDTO;

public class Cita
{
	private CitaDAO cita;	

	public Cita(){
		cita = new CitaDAO();
	}
	
	public void agregarCita(CitaDTO nuevaCita){
		cita.insert(nuevaCita);
	}
	
	public void borrarCita(CitaDTO eliminarCita){
		cita.delete(eliminarCita);
	}
	
	public void actualizarCita(CitaDTO modificarCita, int idCita){
		cita.update(modificarCita, idCita);
	}
	
	public List<CitaDTO> obtenerCitas(){
		return cita.readAll();		
	}
	
	public boolean buscarCita(CitaDTO buscarCita){
		return cita.seleccionar(buscarCita);
	}
	
}
