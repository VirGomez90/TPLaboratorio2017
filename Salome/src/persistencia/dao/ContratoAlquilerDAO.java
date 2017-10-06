package persistencia.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import dto.ContratoAlquilerDTO;
import persistencia.conexion.Conexion;

public class ContratoAlquilerDAO {

	private static final String selectAll = "SELECT * FROM ContratoAlquiler";
	private static final String insert = "INSERT INTO ContratoAlquiler(idContrato, duenio, inquilino, fechaInicio, fechaFin, idInmueble, incremento, porcentajeIncremento, porcentajeComision, tipoContrato, escribania) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";
	private static final String delete = "DELETE FROM ContratoAlquiler WHERE idContrato = ?";
	private static final String update = "UPDATE ContratoAlquiler SET idContrato= ? duenio= ? inquilino= ? fechaInicio= ? fechaFin= ? idInmueble= ? incremento= ? porcentajeIncremento= ? porcentajeComision= ? tipoContrato= ? escribania WHERE idContrato= ?";
	private static final String selectById = "SELECT * FROM ContratoAlquiler WHERE idContrato = ?";
	private static final Conexion conexion = Conexion.getConexion();
	
	public List<ContratoAlquilerDTO> readAll()
	{
		PreparedStatement statement;
		ResultSet resultSet; 
		ArrayList<ContratoAlquilerDTO> contrato = new ArrayList<ContratoAlquilerDTO>();
		try 
		{
			statement = conexion.getSQLConexion().prepareStatement(selectAll);
			resultSet = statement.executeQuery();
			
			while(resultSet.next())
			{
				contrato.add(new ContratoAlquilerDTO(
						resultSet.getInt("idContrato"),
						resultSet.getInt("duenio"),
						resultSet.getInt("inquilino"),
						resultSet.getDate("fechaInicio"),
						resultSet.getDate("fechaFin"),
						resultSet.getInt("idInmueble"),
						resultSet.getInt("incremento"),
						resultSet.getInt("porcentajeIncremento"),
						resultSet.getInt("porcentajeComision"),
						resultSet.getString("tipoContrato"),
						resultSet.getInt("escribania")
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
		return contrato;
	}	
										
	public boolean insert(ContratoAlquilerDTO contrato) {
		PreparedStatement statement;
		try 
		{			
			statement = conexion.getSQLConexion().prepareStatement(insert);
			statement.setInt(1, contrato.getIdContrato());
			statement.setInt(2, contrato.getDuenio());
			statement.setInt(3, contrato.getInquilino());
			statement.setDate(4, contrato.getFechaInicio());
			statement.setDate(5, contrato.getFechaFin());
			statement.setInt(6, contrato.getIdInmueble());
			statement.setInt(7, contrato.getIncremento());
			statement.setInt(8, contrato.getPorcentajeIncremento());
			statement.setInt(9, contrato.getPorcentajeComision());			
			statement.setString(10, contrato.getTipoContrato());
			statement.setInt(11, contrato.getEscribania());
			if(statement.executeUpdate() > 0) //Si se ejecuta devuelvo true
				return true;
		} 
		catch (SQLException e) 
		{
			JOptionPane.showMessageDialog(null, "no se puede agregar contrato, verifique si ya existe");
		}
		finally //Se ejecuta siempre
		{
			conexion.cerrarConexion();
		}
		return false;		
	}

	public boolean update(ContratoAlquilerDTO contrato, int contratoUpdate) {
		
		PreparedStatement statement;
		try 
		{
			statement = conexion.getSQLConexion().prepareStatement(update);
			statement.setInt(1, contrato.getIdContrato());
			statement.setInt(2, contrato.getDuenio());
			statement.setInt(3, contrato.getInquilino());
			statement.setDate(4, contrato.getFechaInicio());
			statement.setDate(5, contrato.getFechaFin());
			statement.setInt(6, contrato.getIdInmueble());
			statement.setInt(7, contrato.getIncremento());
			statement.setInt(8, contrato.getPorcentajeIncremento());
			statement.setInt(9, contrato.getPorcentajeComision());			
			statement.setString(10, contrato.getTipoContrato());
			statement.setInt(11, contrato.getEscribania());
			statement.setInt(12, contratoUpdate);
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

	public boolean delete(ContratoAlquilerDTO contrato)
	{
		PreparedStatement statement;
		int chequeoUpdate=0;
		try 
		{
			statement = conexion.getSQLConexion().prepareStatement(delete);
			statement.setString(1, Integer.toString(contrato.getIdContrato()));
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
	
	public boolean seleccionar(ContratoAlquilerDTO contrato)
	{
		PreparedStatement statement;
		ResultSet resultSet;
		try 
		{
			statement = conexion.getSQLConexion().prepareStatement(selectById);
			statement.setString(1, Integer.toString(contrato.getIdContrato()));
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
