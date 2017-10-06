package persistencia.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import dto.EscribaniaDTO;
import persistencia.conexion.Conexion;

public class EscribaniaDAO {

	private static final String selectAll = "SELECT * FROM Escribania";
	private static final String insert = "INSERT INTO Escribania(cuit, razonSocial, localidad, calle, altura, depto, mail, telefono, telefonoOpcional) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
	private static final String delete = "DELETE FROM Escribania WHERE cuit = ?";
	private static final String update = "UPDATE Escribania SET cuit= ? razonSocial= ? localidad= ? calle= ? altura= ? depto= ? mail= ? telefono= ? telefonoOpcional= ?  WHERE cuit= ?";
	private static final String selectById = "SELECT * FROM Escribania WHERE cuit = ?";
	private static final Conexion conexion = Conexion.getConexion();
	
	
	public List<EscribaniaDTO> readAll()
	{
		PreparedStatement statement;
		ResultSet resultSet; 
		ArrayList<EscribaniaDTO> escribania = new ArrayList<EscribaniaDTO>();
		try 
		{
			statement = conexion.getSQLConexion().prepareStatement(selectAll);
			resultSet = statement.executeQuery();
			
			while(resultSet.next())
			{
				escribania.add(new EscribaniaDTO(
						resultSet.getInt("cuit"),
						resultSet.getString("razonSocial"),
						resultSet.getString("localidad"),
						resultSet.getString("calle"),
						resultSet.getString("altura"),
						resultSet.getString("depto"),
						resultSet.getString("mail"),
						resultSet.getString("telefono"),
						resultSet.getString("telefonoOpcional")
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
		return escribania;
	}	
			
	public boolean insert(EscribaniaDTO escribania) {
		PreparedStatement statement;
		try 
		{			
			statement = conexion.getSQLConexion().prepareStatement(insert);
			statement.setInt(1, escribania.getCuit());
			statement.setString(2, escribania.getRazonSocial());
			statement.setString(3, escribania.getLocalidad());
			statement.setString(4, escribania.getCalle());
			statement.setString(5, escribania.getAltura());
			statement.setString(6, escribania.getDepto());
			statement.setString(7, escribania.getMail());
			statement.setString(8, escribania.getTelefono());
			statement.setString(9, escribania.getTelefonoOpcional());	

			if(statement.executeUpdate() > 0) //Si se ejecuta devuelvo true
				return true;
		} 
		catch (SQLException e) 
		{
			JOptionPane.showMessageDialog(null, "no se puede agregar escribania, verifique si ya existe");
		}
		finally //Se ejecuta siempre
		{
			conexion.cerrarConexion();
		}
		return false;		
	}

	public boolean update(EscribaniaDTO escribania, int escribaniaUpdate) {
		
		PreparedStatement statement;
		try 
		{
			statement = conexion.getSQLConexion().prepareStatement(update);
			statement.setInt(1, escribania.getCuit());
			statement.setString(2, escribania.getRazonSocial());
			statement.setString(3, escribania.getLocalidad());
			statement.setString(4, escribania.getCalle());
			statement.setString(5, escribania.getAltura());
			statement.setString(6, escribania.getDepto());
			statement.setString(7, escribania.getMail());
			statement.setString(8, escribania.getTelefono());
			statement.setString(9, escribania.getTelefonoOpcional());		
			statement.setInt(10, escribaniaUpdate);
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

	public boolean delete(EscribaniaDTO escribania)
	{
		PreparedStatement statement;
		int chequeoUpdate=0;
		try 
		{
			statement = conexion.getSQLConexion().prepareStatement(delete);
			statement.setString(1, Integer.toString(escribania.getCuit()));
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

	public boolean seleccionar(EscribaniaDTO escribania)
	{
		PreparedStatement statement;
		ResultSet resultSet;
		try 
		{
			statement = conexion.getSQLConexion().prepareStatement(selectById);
			statement.setString(1, Integer.toString(escribania.getCuit()));
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
