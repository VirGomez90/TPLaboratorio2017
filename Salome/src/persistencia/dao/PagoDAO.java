package persistencia.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import dto.EgresosDTO;
import dto.PagoDTO;
import persistencia.conexion.Conexion;

public class PagoDAO {
	private static final String selectAll = "SELECT * FROM Pago";
	private static final String insert = "INSERT INTO Pago(idPago,	idContrato,	mes, pagoDuenio, cobroInqui, valor, interes) VALUES(?, ?, ?, ?, ?, ?, ? )";
	private static final String delete = "DELETE FROM Pago WHERE idPago = ?";
	private static final String update = "UPDATE Pago SET WHERE idPago= ?";
	private static final String selectById = "SELECT * FROM Pago WHERE idPago = ?";
	private static final Conexion conexion = Conexion.getConexion();

	public List<PagoDTO> readAll()
	{
		PreparedStatement statement;
		ResultSet resultSet; 
		ArrayList<PagoDTO> pago = new ArrayList<PagoDTO>();
		try 
		{
			statement = conexion.getSQLConexion().prepareStatement(selectAll);
			resultSet = statement.executeQuery();
			
			while(resultSet.next())
			{
				pago.add(new PagoDTO(
						resultSet.getInt("idPago"),
						resultSet.getInt("idContrato"),
						resultSet.getInt("mes"),
						resultSet.getInt("pagoDuenio"),
						resultSet.getInt("cobroInqui"),
						resultSet.getInt("valor"),
						resultSet.getInt("interes")
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
		return pago;
	}	
	
	public boolean insert(PagoDTO pago) {
		PreparedStatement statement;
		try 
		{			
			statement = conexion.getSQLConexion().prepareStatement(insert);
			statement.setInt(1, pago.getIdPago());
			statement.setInt(2, pago.getIdContrato());
			statement.setInt(3, pago.getMes());
			statement.setInt(4, pago.getPagoDuenio());
			statement.setInt(5, pago.getCobroInqui());
			statement.setInt(6, pago.getValor());
			statement.setInt(7, pago.getInteres());
			if(statement.executeUpdate() > 0) //Si se ejecuta devuelvo true
				return true;
		} 
		catch (SQLException e) 
		{
			JOptionPane.showMessageDialog(null, "no se puede agregar pago, verifique si ya existe");
		}
		finally //Se ejecuta siempre
		{
			conexion.cerrarConexion();
		}
		return false;		
	}
	
	public boolean update(PagoDTO pago, int pagoUpdate) {
		
		PreparedStatement statement;
		try 
		{
			statement = conexion.getSQLConexion().prepareStatement(update);
			statement.setInt(1, pago.getIdPago());
			statement.setInt(2, pago.getIdContrato());
			statement.setInt(3, pago.getMes());
			statement.setInt(4, pago.getPagoDuenio());
			statement.setInt(5, pago.getCobroInqui());
			statement.setInt(6, pago.getValor());
			statement.setInt(7, pago.getInteres());
			statement.setInt(8, pagoUpdate);
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

	public boolean delete(PagoDTO pago)
	{
		PreparedStatement statement;
		int chequeoUpdate=0;
		try 
		{
			statement = conexion.getSQLConexion().prepareStatement(delete);
			statement.setString(1, Integer.toString(pago.getIdPago()));
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
	
	public boolean seleccionar(PagoDTO pago)
	{
		PreparedStatement statement;
		ResultSet resultSet;
		try 
		{
			statement = conexion.getSQLConexion().prepareStatement(selectById);
			statement.setString(1, Integer.toString(pago.getIdPago()));
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
