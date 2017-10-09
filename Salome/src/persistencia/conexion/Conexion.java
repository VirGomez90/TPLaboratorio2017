package persistencia.conexion;

import java.sql.Connection;
import java.sql.DriverManager;

import dto.ConfiguracionDTO;
import persistencia.dao.ConfiguracionDAO;

public class Conexion {


	public static Conexion instancia;
	private Connection conexion;
	private boolean open;
	
	
	
	/**
	 * ctor
	 * @param
	 * */
	public Conexion() {
				
		try {
			
			ConfiguracionDAO configdelsystema = new ConfiguracionDAO();
			ConfiguracionDTO config = configdelsystema.obtenerConfiguracion("config.ini");
						
			conexion = DriverManager.getConnection("jdbc:mysql://" + config.getIp() + ":" + config.getPuerto() +"/"+config.getNombrebasedatos(), config.getUsuario(), config.getPassword());	
			System.out.println("Conexion exitosa");
			setOpen(true);
	
		} catch (Exception e) {
			System.out.println("Conexion fallida");
			setOpen(false);
			cerrarConexion();
		}
	}

	
	
	/**
	 * @param
	 * */
	public static Conexion getConexion() {
		if (instancia == null) {
			instancia = new Conexion();
		}
		return instancia;
	}

	
	
	/**
	 * @param
	 * */
	public Connection getSQLConexion() {
		return conexion;
	}

	
	
	/**
	 * @param
	 * */
	public void cerrarConexion() {
		instancia = null;
	}

	
	
	/**
	 * @return the open
	 */
	public boolean isOpen() {
		return open;
	}

	
	
	/**
	 * @param open the open to set
	 */
	public void setOpen(boolean open) {
		this.open = open;
	}
}
	
