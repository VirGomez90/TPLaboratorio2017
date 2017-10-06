package persistencia.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import dto.InmuebleDTO;
import persistencia.conexion.Conexion;

public class InmuebleDAO {
	
	private static final String selectAll = "SELECT * FROM Inmueble";
	private static final String insert = "INSERT INTO Inmueble(idInmueble, calle, altura, depto, localidad, duenio, inmoColega, cartel, precio, alqCom, alqPart, vtaCom, vtaPart, ambientes, mtsCub, mtsTotal, quincho, parrilla, salon, banios, habitaciones, garage, pileta, balcon, tipo) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";         
	private static final String delete = "DELETE FROM Inmueble WHERE idInmueble = ?";
	private static final String update = "UPDATE Inmueble SET idInmueble= ? calle= ? altura= ? depto= ? localidad= ? duenio= ? inmoColega= ? cartel= ? precio= ? alqCom= ? alqPart= ? vtaCom= ? vtaPart= ? ambientes= ? mtsCub= ? mtsTotal= ? quincho= ? parrilla= ? salon= ? banios= ? habitaciones= ? garage= ? pileta= ? balcon= ? tipo= ? WHERE idInmueble= ?";
	private static final String selectById = "SELECT * FROM Inmueble WHERE idInmueble = ?";
	private static final Conexion conexion = Conexion.getConexion();

	public List<InmuebleDTO> readAll()
	{
		PreparedStatement statement;
		ResultSet resultSet; 
		ArrayList<InmuebleDTO> inmueble = new ArrayList<InmuebleDTO>();
		try 
		{
			statement = conexion.getSQLConexion().prepareStatement(selectAll);
			resultSet = statement.executeQuery();
			
			while(resultSet.next())
			{
				inmueble.add(new InmuebleDTO(
						resultSet.getInt("idInmueble"),
						resultSet.getString("calle"),
						resultSet.getString("altura"),
						resultSet.getString("depto"),
						resultSet.getString("localidad"),
						resultSet.getInt("duenio"),
						resultSet.getInt("inmoColega"),
						resultSet.getString("cartel"),
						resultSet.getInt("precio"),
						resultSet.getString("alqCom"),
						resultSet.getString("alqPart"),
						resultSet.getString("vtaCom"),
						resultSet.getString("vtaPart"),
						resultSet.getString("ambientes"),
						resultSet.getString("mtsCub"),
						resultSet.getString("mtsTotal"),
						resultSet.getString("quincho"),
						resultSet.getString("parrilla"),
						resultSet.getString("salon"),
						resultSet.getString("banios"),
						resultSet.getString("habitaciones"),
						resultSet.getString("garage"),
						resultSet.getString("pileta"),
						resultSet.getString("balcon"),
						resultSet.getString("tipo")
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
		return inmueble;
	}

	public boolean insert(InmuebleDTO inmueble) {
		PreparedStatement statement;
		try 
		{			
			statement = conexion.getSQLConexion().prepareStatement(insert);
			statement.setInt(1, inmueble.getIdInmueble());
			statement.setString(2, inmueble.getCalle());
			statement.setString(3, inmueble.getAltura());
			statement.setString(4, inmueble.getDepto());
			statement.setString(5, inmueble.getLocalidad());
			statement.setInt(6, inmueble.getDuenio());
			statement.setInt(7, inmueble.getInmoColega());
			statement.setString(8, inmueble.getCartel());
			statement.setInt(9, inmueble.getPrecio());	
			statement.setString(10, inmueble.getAlqCom());
			statement.setString(11, inmueble.getAlqPart());
			statement.setString(12, inmueble.getVtaCom());
			statement.setString(13, inmueble.getVtaPart());
			statement.setString(14, inmueble.getAmbientes());
			statement.setString(15, inmueble.getMtsCub());
			statement.setString(16, inmueble.getMtsTotal());
			statement.setString(17, inmueble.getQuincho());
			statement.setString(18, inmueble.getParrilla());
			statement.setString(19, inmueble.getSalon());
			statement.setString(20, inmueble.getBanios());
			statement.setString(21, inmueble.getHabitaciones());
			statement.setString(22, inmueble.getGarage());
			statement.setString(23, inmueble.getPileta());
			statement.setString(24, inmueble.getBalcon());
			statement.setString(25, inmueble.getTipo());

			if(statement.executeUpdate() > 0) //Si se ejecuta devuelvo true
				return true;
		} 
		catch (SQLException e) 
		{
			JOptionPane.showMessageDialog(null, "no se puede agregar inmueble, verifique si ya existe");
		}
		finally //Se ejecuta siempre
		{
			conexion.cerrarConexion();
		}
		return false;		
	}

	public boolean update(InmuebleDTO inmueble, int inmuebleUpdate) {
		
		PreparedStatement statement;
		try 
		{
			statement = conexion.getSQLConexion().prepareStatement(update);
			statement.setInt(1, inmueble.getIdInmueble());
			statement.setString(2, inmueble.getCalle());
			statement.setString(3, inmueble.getAltura());
			statement.setString(4, inmueble.getDepto());
			statement.setString(5, inmueble.getLocalidad());
			statement.setInt(6, inmueble.getDuenio());
			statement.setInt(7, inmueble.getInmoColega());
			statement.setString(8, inmueble.getCartel());
			statement.setInt(9, inmueble.getPrecio());	
			statement.setString(10, inmueble.getAlqCom());
			statement.setString(11, inmueble.getAlqPart());
			statement.setString(12, inmueble.getVtaCom());
			statement.setString(13, inmueble.getVtaPart());
			statement.setString(14, inmueble.getAmbientes());
			statement.setString(15, inmueble.getMtsCub());
			statement.setString(16, inmueble.getMtsTotal());
			statement.setString(17, inmueble.getQuincho());
			statement.setString(18, inmueble.getParrilla());
			statement.setString(19, inmueble.getSalon());
			statement.setString(20, inmueble.getBanios());
			statement.setString(21, inmueble.getHabitaciones());
			statement.setString(22, inmueble.getGarage());
			statement.setString(23, inmueble.getPileta());
			statement.setString(24, inmueble.getBalcon());
			statement.setString(25, inmueble.getTipo());	
			statement.setInt(26, inmuebleUpdate);
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

	public boolean delete(InmuebleDTO inmueble)
	{
		PreparedStatement statement;
		int chequeoUpdate=0;
		try 
		{
			statement = conexion.getSQLConexion().prepareStatement(delete);
			statement.setString(1, Integer.toString(inmueble.getIdInmueble()));
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

	public boolean seleccionar(InmuebleDTO inmueble)
	{
		PreparedStatement statement;
		ResultSet resultSet;
		try 
		{
			statement = conexion.getSQLConexion().prepareStatement(selectById);
			statement.setString(1, Integer.toString(inmueble.getIdInmueble()));
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
