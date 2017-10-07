package modelo;

import java.io.FileNotFoundException;
import java.io.IOException;

import dto.ConfiguracionDTO;
import persistencia.dao.ConfiguracionDAO;

public class Configuracion {

	private ConfiguracionDAO configuracion;
	
	public Configuracion(){
		configuracion = new ConfiguracionDAO();
	}
	
	public void crearArchivo(String path, ConfiguracionDTO config) throws IOException{
		configuracion.crearArchivoDeConfiguracion(path, config);
	}
	
	public ConfiguracionDTO obtenerConfiguracion(String path) throws FileNotFoundException{
		return configuracion.obtenerConfiguracion(path);
	}
	
}
