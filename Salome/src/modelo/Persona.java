package modelo;

import java.util.List;

import dto.PersonaDTO;
import persistencia.dao.PersonaDAO;

public class Persona {
	
	private PersonaDAO persona;	

	public Persona(){
		persona = new PersonaDAO();
	}
	
	public void agregarPersona(PersonaDTO nuevaPersona){
		persona.insert(nuevaPersona);
	}
	
	public void borrarPersona(PersonaDTO eliminarPersona){
		persona.delete(eliminarPersona);
	}
	
	public void actualizarPersona(PersonaDTO modificarPersona, int idPersona){
		persona.update(modificarPersona, idPersona);
	}
	
	public List<PersonaDTO> obtenerPersonas(){
		return persona.readAll();		
	}
	
	public boolean buscarPersona(PersonaDTO buscarPersona){
		return persona.seleccionar(buscarPersona);
	}

}
