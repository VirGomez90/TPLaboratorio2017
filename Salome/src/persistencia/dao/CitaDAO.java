package persistencia.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import dto.CitaDTO;
import persistencia.conexion.Conexion;

public class CitaDAO {
	
	private static final String selectAll = "SELECT * FROM Cita";
	private static final String insert = "INSERT INTO Cita(idCita, personaInteresada, personaReferente, usuario, horaInicio, horaFin, fecha, idInmueble, direccion, asunto, descripcion) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";
	private static final String delete = "DELETE FROM Cita WHERE idCita = ?";
	private static final String update = "UPDATE Cita SET idCita= ? personaInteresada= ? personaReferente= ? usuario= ? horaInicio= ? horaFin= ? fecha= ? idInmueble= ? direccion= ? asunto= ? descripcion= ? WHERE idCita= ?";
	private static final String selectById = "SELECT * FROM Cita WHERE idCita = ?";
	private static final Conexion conexion = Conexion.getConexion();
	
	public List<CitaDTO> readAll()
	{
		PreparedStatement statement;
		ResultSet resultSet; 
		ArrayList<CitaDTO> cita = new ArrayList<CitaDTO>();
		try 
		{
			statement = conexion.getSQLConexion().prepareStatement(selectAll);
			resultSet = statement.executeQuery();
			
			while(resultSet.next())
			{
				cita.add(new CitaDTO(
						resultSet.getInt("idCita"),
						resultSet.getInt("personaInteresada"),
						resultSet.getInt("personaReferente"),
						resultSet.getInt("usuario"),
						resultSet.getString("horaInicio"),
						resultSet.getString("horaFin"),
						resultSet.getDate("fecha"),
						resultSet.getInt("idInmueble"),
						resultSet.getString("direccion"),
						resultSet.getString("asunto"),
						resultSet.getString("descripcion")
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
		return cita;
	}	

	public boolean insert(CitaDTO cita) {
		PreparedStatement statement;
		try 
		{			
			statement = conexion.getSQLConexion().prepareStatement(insert);
			statement.setInt(1, cita.getIdCita());
			statement.setInt(2, cita.getPersonaInteresada());
			statement.setInt(3, cita.getPersonaReferente());
			statement.setInt(4, cita.getUsuario());
			statement.setString(5, cita.getHoraInicio());
			statement.setString(6, cita.getHoraFin());
			statement.setDate(7, cita.getFecha());
			statement.setInt(8, cita.getIdInmueble());
			statement.setString(9, cita.getDireccion());			
			statement.setString(10, cita.getAsunto());
			statement.setString(11, cita.getDescripcion());
			if(statement.executeUpdate() > 0) //Si se ejecuta devuelvo true
				return true;
		} 
		catch (SQLException e) 
		{
			JOptionPane.showMessageDialog(null, "no se puede agregar cita, verifique si ya existe");
		}
		finally //Se ejecuta siempre
		{
			conexion.cerrarConexion();
		}
		return false;		
	}

	public boolean update(CitaDTO cita, int citaUpdate) {
		
		PreparedStatement statement;
		try 
		{
			statement = conexion.getSQLConexion().prepareStatement(update);
			statement.setInt(1, cita.getIdCita());
			statement.setInt(2, cita.getPersonaInteresada());
			statement.setInt(3, cita.getPersonaReferente());
			statement.setInt(4, cita.getUsuario());
			statement.setString(5, cita.getHoraInicio());
			statement.setString(6, cita.getHoraFin());
			statement.setDate(7, cita.getFecha());
			statement.setInt(8, cita.getIdInmueble());
			statement.setString(9, cita.getDireccion());			
			statement.setString(10, cita.getAsunto());
			statement.setString(11, cita.getDescripcion());
			statement.setInt(12, citaUpdate);
			if(statement.executeUpdate() > 0) //Si se ejecuta devuelvo true
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

	public boolean delete(CitaDTO cita)

	{
		PreparedStatement statement;
		int chequeoUpdate=0;
		try 
		{
			statement = conexion.getSQLConexion().prepareStatement(delete);
			statement.setString(1, Integer.toString(cita.getIdCita()));
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

	public boolean seleccionar(CitaDTO cita)
	{
		PreparedStatement statement;
		ResultSet resultSet;
		try 
		{
			statement = conexion.getSQLConexion().prepareStatement(selectById);
			statement.setString(1, Integer.toString(cita.getIdCita()));
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
