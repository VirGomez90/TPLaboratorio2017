package persistencia.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import dto.PersonaDTO;
import persistencia.conexion.Conexion;

public class PersonaDAO {
	
	private static final String selectAll = "SELECT * FROM Persona";
	private static final String insert = "INSERT INTO Persona(dni, nombre, apellido, localidad, calle, altura, depto, mail, mailTrabajo, telefono, telefonoCasa, telefonoTrabajo) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";
	private static final String delete = "DELETE FROM Persona WHERE dni = ?";
	private static final String update = "UPDATE Persona SET dni= ? nombre= ? apellido= ? localidad= ? calle= ? altura= ? depto= ? mail= ? mailTrabajo= ? telefono= ? telefonoCasa= ? telefonoTrabajo= ? WHERE dni= ?";
	private static final String selectById = "SELECT * FROM Persona WHERE dni = ?";
	private static final Conexion conexion = Conexion.getConexion();
	
	public List<PersonaDTO> readAll()
	{
		PreparedStatement statement;
		ResultSet resultSet; 
		ArrayList<PersonaDTO> persona = new ArrayList<PersonaDTO>();
		try 
		{
			statement = conexion.getSQLConexion().prepareStatement(selectAll);
			resultSet = statement.executeQuery();
			
			while(resultSet.next())
			{
				persona.add(new PersonaDTO(
						resultSet.getInt("dni"),
						resultSet.getString("nombre"),
						resultSet.getString("apellido"),
						resultSet.getString("localidad"),
						resultSet.getString("calle"),
						resultSet.getString("altura"),
						resultSet.getString("depto"),
						resultSet.getString("mail"),
						resultSet.getString("mailTrabajo"),
						resultSet.getString("telefono"),
						resultSet.getString("telefonoCasa"),
						resultSet.getString("telefonoTrabajo")
						));
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
		return persona;
	}	

	public boolean insert(PersonaDTO persona) {
		PreparedStatement statement;
		try 
		{			
			statement = conexion.getSQLConexion().prepareStatement(insert);
			statement.setInt(1, persona.getDni());
			statement.setString(2, persona.getNombre());
			statement.setString(3, persona.getApellido());
			statement.setString(4, persona.getLocalidad());
			statement.setString(5, persona.getCalle());
			statement.setString(6, persona.getAltura());
			statement.setString(7, persona.getDepto());
			statement.setString(8, persona.getMail());
			statement.setString(9, persona.getMailTrabajo());			
			statement.setString(10, persona.getTelefono());
			statement.setString(11, persona.getTelefonoCasa());
			statement.setString(12, persona.getTelefonoTrabajo());
			if(statement.executeUpdate() > 0) //Si se ejecuta devuelvo true
				return true;
		} 
		catch (SQLException e) 
		{
			JOptionPane.showMessageDialog(null, "no se puede agregar persona, verifique si ya existe");
		}
		finally //Se ejecuta siempre
		{
			conexion.cerrarConexion();
		}
		return false;		
	}

	public boolean update(PersonaDTO persona, int personaUpdate) {
		
		PreparedStatement statement;
		try 
		{
			statement = conexion.getSQLConexion().prepareStatement(update);
			statement.setInt(1, persona.getDni());
			statement.setString(2, persona.getNombre());
			statement.setString(3, persona.getApellido());
			statement.setString(4, persona.getLocalidad());
			statement.setString(5, persona.getCalle());
			statement.setString(6, persona.getAltura());
			statement.setString(7, persona.getDepto());
			statement.setString(8, persona.getMail());
			statement.setString(9, persona.getMailTrabajo());			
			statement.setString(10, persona.getTelefono());
			statement.setString(11, persona.getTelefonoCasa());
			statement.setString(12, persona.getTelefonoTrabajo());
			statement.setInt(13, personaUpdate);
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
	
	public boolean delete(PersonaDTO persona)
	{
		PreparedStatement statement;
		int chequeoUpdate=0;
		try 
		{
			statement = conexion.getSQLConexion().prepareStatement(delete);
			statement.setString(1, Integer.toString(persona.getDni()));
			chequeoUpdate = statement.executeUpdate();
			if(chequeoUpdate > 0) //Si se ejecuta devuelvo true
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
	
	public boolean seleccionar(PersonaDTO persona)
	{
		PreparedStatement statement;
		ResultSet resultSet;
		try 
		{
			statement = conexion.getSQLConexion().prepareStatement(selectById);
			statement.setString(1, Integer.toString(persona.getDni()));
			resultSet = statement.executeQuery();
			if(resultSet.next()) //Si se ejecuta devuelvo true
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
}
