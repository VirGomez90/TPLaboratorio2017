package persistencia.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import dto.LocalidadDTO;
import persistencia.conexion.Conexion;

public class LocalidadDAO {


	
	private static final String selectAll = "SELECT * FROM Localidad";
	private static final String insert = "INSERT INTO Localidad(localidad) VALUES(?)";
	private static final String delete = "DELETE FROM Localidad WHERE localidad = ?";
	private static final String update = "UPDATE Localidad SET localidad= ? WHERE localidad= ?";
	
	private static final Conexion conexion = Conexion.getConexion();
	
	
	
	public List<LocalidadDTO> readAll()
	{
		PreparedStatement statement;
		ResultSet resultSet; 
		ArrayList<LocalidadDTO> localidad = new ArrayList<LocalidadDTO>();
		try 
		{
			statement = conexion.getSQLConexion().prepareStatement(selectAll);
			resultSet = statement.executeQuery();
			
			while(resultSet.next())
			{
				localidad.add(new LocalidadDTO(resultSet.getString("localidad")));
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			conexion.cerrarConexion();
		}
		return localidad;
	}

	public boolean insert(LocalidadDTO agregarLocalidad) {
		PreparedStatement statement;
		try 
		{
			
			statement = conexion.getSQLConexion().prepareStatement(insert);
			statement.setString(1, agregarLocalidad.getLocalidad());
			if(statement.executeUpdate() > 0) //Si se ejecuta devuelvo true
				return true;
		} 
		catch (SQLException e) 
		{
			JOptionPane.showMessageDialog(null, "no se puede agregar localidad, verifique si ya existe");
		}
		finally //Se ejecuta siempre
		{
			conexion.cerrarConexion();
		}
		return false;		
	}
	
	public boolean update(LocalidadDTO editarLocalidad, String desccUpdate) {
		PreparedStatement statement;
		try 
		{
		    		    
			statement = conexion.getSQLConexion().prepareStatement(update);			
			statement.setString(1, editarLocalidad.getLocalidad());
			statement.setString(3, desccUpdate);
			if(statement.executeUpdate() > 0) 
				return true;
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		finally //Se ejecuta siempre
		{
			conexion.cerrarConexion();
		}
		return false;
		
	}
	
	public boolean delete(LocalidadDTO localidad)
	{
		PreparedStatement statement;
		int chequeoUpdate=0;
		try 
		{
			statement = conexion.getSQLConexion().prepareStatement(delete);
			statement.setString(1, localidad.getLocalidad());
			chequeoUpdate = statement.executeUpdate();
			if(chequeoUpdate > 0) //Si se ejecuta devuelvo true
				return true;
		} 
		catch (SQLException e) 
		{
			JOptionPane.showMessageDialog(null, "no se puede borrar una localidad en uso por una persona");
		}
		finally //Se ejecuta siempre
		{
			conexion.cerrarConexion();
		}
		return false;
	}

}
