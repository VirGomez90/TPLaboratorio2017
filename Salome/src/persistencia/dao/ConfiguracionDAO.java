package persistencia.dao;
/**
 * Observaciones:
 * 
 * 1- FileWriter: es un objeto que tiene como función escribir datos en un archivo.
 * 2- BufferedWriter: objeto que reserva un espacio en memoria donde se guarda la 
 *    información antes de ser escrita en un archivo.
 * 3- PrintWriter: Es el objeto que utilizamos para escribir directamente sobre el archivo de texto.
 * */


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

import dto.ConfiguracionDTO;


public class ConfiguracionDAO {

	/**
	 * Permite crear el archivo de configuracion
	 * @author camilo
	 * @throws IOException 
	 * */
	public void crearArchivoDeConfiguracion(String path, ConfiguracionDTO config) throws IOException {
		File archivo = new File(path);
		FileWriter filewriter = new FileWriter(archivo);
		BufferedWriter bufferedwriter = new BufferedWriter(filewriter);
		PrintWriter printwriter = new PrintWriter(bufferedwriter);
			
		printwriter.write(config.getIp()+";");
		printwriter.append(config.getPuerto()+";");
		printwriter.append(config.getUsuario()+";");
		printwriter.append(config.getPassword()+";");
		printwriter.append(config.getNombrebasedatos());
			
		printwriter.close();
		bufferedwriter.close();
		filewriter.close();
	}
	
	
	
	/**
	 * Permite subir desde un archivo de texto 
	 * @
	 * */
	public ConfiguracionDTO obtenerConfiguracion(String path) throws FileNotFoundException
	{
		ConfiguracionDTO ret = null;
		File archivo = new File(path);
		
		if( archivo.exists() ) {
			ret = new ConfiguracionDTO();
			
			FileInputStream fis = new FileInputStream(path);
			Scanner scan = new Scanner(fis);
			String line = scan.nextLine();
			StringTokenizer tokens = new StringTokenizer(line,";");						
			
			ret.setIp(tokens.nextToken());
			ret.setPuerto(tokens.nextToken());
			ret.setUsuario(tokens.nextToken());
			ret.setPassword(tokens.nextToken());
			ret.setNombrebasedatos(tokens.nextToken());
			scan.close();
		}
		return ret;
	}
}
