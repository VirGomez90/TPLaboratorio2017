package persistencia.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import dto.InmobiliariaColegaDTO;
import persistencia.conexion.Conexion;

public class InmobiliariaColegaDAO {

	private static final String selectAll = "SELECT * FROM Escribania";
	private static final String insert = "INSERT INTO Escribania(cuit, razonSocial, localidad, calle, altura, depto, mail, telefono, telefonoOpcional) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
	private static final String delete = "DELETE FROM Escribania WHERE cuit = ?";
	private static final String update = "UPDATE Escribania SET cuit= ? razonSocial= ? localidad= ? calle= ? altura= ? depto= ? mail= ? telefono= ? telefonoOpcional= ? WHERE cuit= ?";
	private static final String selectById = "SELECT * FROM Escribania WHERE cuit = ?";
	private static final Conexion conexion = Conexion.getConexion();
	
	
	public List<InmobiliariaColegaDTO> readAll()
	{
		PreparedStatement statement;
		ResultSet resultSet; 
		ArrayList<InmobiliariaColegaDTO> inmobiliariaColega = new ArrayList<InmobiliariaColegaDTO>();
		try 
		{
			statement = conexion.getSQLConexion().prepareStatement(selectAll);
			resultSet = statement.executeQuery();
			
			while(resultSet.next())
			{
				inmobiliariaColega.add(new InmobiliariaColegaDTO(
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
		return inmobiliariaColega;
	}	

	public boolean insert(InmobiliariaColegaDTO inmobiliariaColega) {
		PreparedStatement statement;
		try 
		{			
			statement = conexion.getSQLConexion().prepareStatement(insert);
			statement.setInt(1, inmobiliariaColega.getCuit());
			statement.setString(2, inmobiliariaColega.getRazonSocial());
			statement.setString(3, inmobiliariaColega.getLocalidad());
			statement.setString(4, inmobiliariaColega.getCalle());
			statement.setString(5, inmobiliariaColega.getAltura());
			statement.setString(6, inmobiliariaColega.getDepto());
			statement.setString(7, inmobiliariaColega.getMail());
			statement.setString(8, inmobiliariaColega.getTelefono());
			statement.setString(9, inmobiliariaColega.getTelefonoOpcional());	

			if(statement.executeUpdate() > 0) //Si se ejecuta devuelvo true
				return true;
		} 
		catch (SQLException e) 
		{
			JOptionPane.showMessageDialog(null, "no se puede agregar inmobiliaria colega, verifique si ya existe");
		}
		finally //Se ejecuta siempre
		{
			conexion.cerrarConexion();
		}
		return false;		
	}

	public boolean update(InmobiliariaColegaDTO inmobiliariaColega, int colegaUpdate) {
		
		PreparedStatement statement;
		try 
		{
			statement = conexion.getSQLConexion().prepareStatement(update);
			statement.setInt(1, inmobiliariaColega.getCuit());
			statement.setString(2, inmobiliariaColega.getRazonSocial());
			statement.setString(3, inmobiliariaColega.getLocalidad());
			statement.setString(4, inmobiliariaColega.getCalle());
			statement.setString(5, inmobiliariaColega.getAltura());
			statement.setString(6, inmobiliariaColega.getDepto());
			statement.setString(7, inmobiliariaColega.getMail());
			statement.setString(8, inmobiliariaColega.getTelefono());
			statement.setString(9, inmobiliariaColega.getTelefonoOpcional());		
			statement.setInt(10, colegaUpdate);
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

	public boolean delete(InmobiliariaColegaDTO inmobiliariaColega)
	{
		PreparedStatement statement;
		int chequeoUpdate=0;
		try 
		{
			statement = conexion.getSQLConexion().prepareStatement(delete);
			statement.setString(1, Integer.toString(inmobiliariaColega.getCuit()));
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

	public boolean seleccionar(InmobiliariaColegaDTO inmobiliariaColega)
	{
		PreparedStatement statement;
		ResultSet resultSet;
		try 
		{
			statement = conexion.getSQLConexion().prepareStatement(selectById);
			statement.setString(1, Integer.toString(inmobiliariaColega.getCuit()));
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
