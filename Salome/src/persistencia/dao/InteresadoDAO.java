package persistencia.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import dto.InteresadoDTO;
import persistencia.conexion.Conexion;

public class InteresadoDAO {
	
	private static final String selectAll = "SELECT * FROM Interesado";
	private static final String insert = "INSERT INTO Interesado(idInteresado, personaInteresada, ambientes, mtsCubiertos, mtsTotal, quincho, parrilla, salon, banios, habitaciones, garage, pileta, balcon, tipo) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";         
	private static final String delete = "DELETE FROM Interesado WHERE idInteresado = ?";
	private static final String update = "UPDATE Inmueble SET idInteresado= ? personaInteresada= ? ambientes= ? mtsCubiertos= ? mtsTotal= ? quincho= ? parrilla= ? salon= ? banios= ? habitaciones= ? garage= ? pileta= ? balcon= ? tipo= ? WHERE idInteresado= ?";
	private static final String selectById = "SELECT * FROM Interesado WHERE idInteresado = ?";
	private static final Conexion conexion = Conexion.getConexion();

	public List<InteresadoDTO> readAll()
	{
		PreparedStatement statement;
		ResultSet resultSet; 
		ArrayList<InteresadoDTO> interesado = new ArrayList<InteresadoDTO>();
		try 
		{
			statement = conexion.getSQLConexion().prepareStatement(selectAll);
			resultSet = statement.executeQuery();
			
			while(resultSet.next())
			{
				interesado.add(new InteresadoDTO(
						resultSet.getInt("idInteresado"),
						resultSet.getInt("personaInteresada"),
						resultSet.getInt("ambientes"),
						resultSet.getInt("mtsCubiertos"),
						resultSet.getInt("mtsTotal"),
						resultSet.getString("quincho"),
						resultSet.getString("parrilla"),
						resultSet.getString("salon"),
						resultSet.getInt("banios"),
						resultSet.getInt("habitaciones"),
						resultSet.getInt("garage"),
						resultSet.getInt("pileta"),
						resultSet.getInt("balcon"),
						resultSet.getInt("tipo")
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
		return interesado;
	}	

	public boolean insert(InteresadoDTO interesado) {
		PreparedStatement statement;
		try 
		{			
			statement = conexion.getSQLConexion().prepareStatement(insert);
			statement.setInt(1, interesado.getIdInteresado());
			statement.setInt(2, interesado.getPersonaInteresada());
			statement.setInt(3, interesado.getAmbientes());
			statement.setInt(4, interesado.getMtsCubiertos());
			statement.setInt(5, interesado.getMtsTotal());
			statement.setString(6, interesado.getQuincho());
			statement.setString(7, interesado.getParrilla());
			statement.setString(8, interesado.getSalon());
			statement.setInt(9, interesado.getBanios());			
			statement.setInt(10, interesado.getHabitaciones());
			statement.setInt(11, interesado.getGarage());
			statement.setInt(12, interesado.getPileta());
			statement.setInt(13, interesado.getBalcon());
			statement.setInt(14, interesado.getTipo());
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
	
	public boolean update(InteresadoDTO interesado, int interesadoUpdate) {
		
		PreparedStatement statement;
		try 
		{
			statement = conexion.getSQLConexion().prepareStatement(update);
			statement.setInt(1, interesado.getIdInteresado());
			statement.setInt(2, interesado.getPersonaInteresada());
			statement.setInt(3, interesado.getAmbientes());
			statement.setInt(4, interesado.getMtsCubiertos());
			statement.setInt(5, interesado.getMtsTotal());
			statement.setString(6, interesado.getQuincho());
			statement.setString(7, interesado.getParrilla());
			statement.setString(8, interesado.getSalon());
			statement.setInt(9, interesado.getBanios());			
			statement.setInt(10, interesado.getHabitaciones());
			statement.setInt(11, interesado.getGarage());
			statement.setInt(12, interesado.getPileta());
			statement.setInt(13, interesado.getBalcon());
			statement.setInt(14, interesado.getTipo());
			statement.setInt(15, interesadoUpdate);
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

	public boolean delete(InteresadoDTO interesado)
	{
		PreparedStatement statement;
		int chequeoUpdate=0;
		try 
		{
			statement = conexion.getSQLConexion().prepareStatement(delete);
			statement.setString(1, Integer.toString(interesado.getIdInteresado()));
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
	
	public boolean seleccionar(InteresadoDTO interesado)
	{
		PreparedStatement statement;
		ResultSet resultSet;
		try 
		{
			statement = conexion.getSQLConexion().prepareStatement(selectById);
			statement.setString(1, Integer.toString(interesado.getIdInteresado()));
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
