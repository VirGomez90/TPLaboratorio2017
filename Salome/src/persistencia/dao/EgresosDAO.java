package persistencia.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import dto.EgresosDTO;
import persistencia.conexion.Conexion;

public class EgresosDAO {
	private static final String selectAll = "SELECT * FROM Egresos";
	private static final String insert = "INSERT INTO Egresos(idEgresos, fecha, descripcion, monto, tipo) VALUES(?, ?, ?, ?, ?)";
	private static final String delete = "DELETE FROM Egresos WHERE idEgresos = ?";
	private static final String update = "UPDATE Egresos SET idEgresos= ? fecha= ? descripcion= ? monto= ? tipo= ? WHERE idEgresos= ?";
	private static final String selectById = "SELECT * FROM Egresos WHERE Egresos = ?";
	private static final Conexion conexion = Conexion.getConexion();
	
	public List<EgresosDTO> readAll()
	{
		PreparedStatement statement;
		ResultSet resultSet; 
		ArrayList<EgresosDTO> egresos = new ArrayList<EgresosDTO>();
		try 
		{
			statement = conexion.getSQLConexion().prepareStatement(selectAll);
			resultSet = statement.executeQuery();
			
			while(resultSet.next())
			{
				egresos.add(new EgresosDTO(
						resultSet.getInt("idEgresos"),
						resultSet.getDate("fecha"),
						resultSet.getString("descripcion"),
						resultSet.getInt("monto"),
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
		return egresos;
	}	
	
	public boolean insert(EgresosDTO egreso) {
		PreparedStatement statement;
		try 
		{			
			statement = conexion.getSQLConexion().prepareStatement(insert);
			statement.setInt(1, egreso.getIdEgresos());
			statement.setDate(2, egreso.getFecha());
			statement.setString(3, egreso.getDescripcion());
			statement.setInt(4, egreso.getMonto());
			statement.setString(5, egreso.getTipo());
			if(statement.executeUpdate() > 0) //Si se ejecuta devuelvo true
				return true;
		} 
		catch (SQLException e) 
		{
			JOptionPane.showMessageDialog(null, "no se puede agregar egreso, verifique si ya existe");
		}
		finally //Se ejecuta siempre
		{
			conexion.cerrarConexion();
		}
		return false;		
	}

	public boolean update(EgresosDTO egreso, int egresoUpdate) {
		
		PreparedStatement statement;
		try 
		{
			statement = conexion.getSQLConexion().prepareStatement(update);
			statement.setInt(1, egreso.getIdEgresos());
			statement.setDate(2, egreso.getFecha());
			statement.setString(3, egreso.getDescripcion());
			statement.setInt(4, egreso.getMonto());
			statement.setString(5, egreso.getTipo());
			statement.setInt(6, egresoUpdate);
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

	public boolean delete(EgresosDTO egreso)
	{
		PreparedStatement statement;
		int chequeoUpdate=0;
		try 
		{
			statement = conexion.getSQLConexion().prepareStatement(delete);
			statement.setString(1, Integer.toString(egreso.getIdEgresos()));
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

	public boolean seleccionar(EgresosDTO egreso)
	{
		PreparedStatement statement;
		ResultSet resultSet;
		try 
		{
			statement = conexion.getSQLConexion().prepareStatement(selectById);
			statement.setString(1, Integer.toString(egreso.getIdEgresos()));
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
