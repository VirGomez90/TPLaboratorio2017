package persistencia.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import dto.ContratoCompraVentaDTO;
import persistencia.conexion.Conexion;

public class ContratoCompraVentaDAO {
	
	private static final String selectAll = "SELECT * FROM ContratoCompraVenta";
	private static final String insert = "INSERT INTO ContratoCompraVenta(idBoleto, vendedor, comprador, fecha, valor, comision, idInmueble) VALUES(?, ?, ?, ?, ?, ?, ? )";
	private static final String delete = "DELETE FROM ContratoCompraVenta WHERE idBoleto = ?";
	private static final String update = "UPDATE ContratoCompraVenta SET idBoleto= ? vendedor= ? comprador= ? fecha= ? valor= ? comision= ? idInmueble= ? WHERE idBoleto= ?";
	private static final String selectById = "SELECT * FROM ContratoCompraVenta WHERE idBoleto = ?";
	private static final Conexion conexion = Conexion.getConexion();
	
	public List<ContratoCompraVentaDTO> readAll()
	{
		PreparedStatement statement;
		ResultSet resultSet; 
		ArrayList<ContratoCompraVentaDTO> contrato = new ArrayList<ContratoCompraVentaDTO>();
		try 
		{
			statement = conexion.getSQLConexion().prepareStatement(selectAll);
			resultSet = statement.executeQuery();
			
			while(resultSet.next())
			{
				contrato.add(new ContratoCompraVentaDTO(
						resultSet.getInt("idBoleto"),
						resultSet.getInt("vendedor"),
						resultSet.getInt("comprador"),
						resultSet.getDate("fecha"),
						resultSet.getInt("valor"),
						resultSet.getInt("comision"),
						resultSet.getInt("idInmueble")
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

	public boolean insert(ContratoCompraVentaDTO contrato) {
		PreparedStatement statement;
		try 
		{			
			statement = conexion.getSQLConexion().prepareStatement(insert);
			statement.setInt(1, contrato.getIdBoleto());
			statement.setInt(2, contrato.getVendedor());
			statement.setInt(3, contrato.getComprador());
			statement.setDate(4, contrato.getFecha());
			statement.setInt(5, contrato.getValor());
			statement.setInt(6, contrato.getComision());
			statement.setInt(7, contrato.getIdInmueble());
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

	public boolean update(ContratoCompraVentaDTO contrato, int contratoUpdate) {
		
		PreparedStatement statement;
		try 
		{
			statement = conexion.getSQLConexion().prepareStatement(update);
			statement.setInt(1, contrato.getIdBoleto());
			statement.setInt(2, contrato.getVendedor());
			statement.setInt(3, contrato.getComprador());
			statement.setDate(4, contrato.getFecha());
			statement.setInt(5, contrato.getValor());
			statement.setInt(6, contrato.getComision());
			statement.setInt(7, contrato.getIdInmueble());
			statement.setInt(8, contratoUpdate);
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

	public boolean delete(ContratoCompraVentaDTO contrato)
	{
		PreparedStatement statement;
		int chequeoUpdate=0;
		try 
		{
			statement = conexion.getSQLConexion().prepareStatement(delete);
			statement.setString(1, Integer.toString(contrato.getIdBoleto()));
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

	public boolean seleccionar(ContratoCompraVentaDTO contrato)
	{
		PreparedStatement statement;
		ResultSet resultSet;
		try 
		{
			statement = conexion.getSQLConexion().prepareStatement(selectById);
			statement.setString(1, Integer.toString(contrato.getIdBoleto()));
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
