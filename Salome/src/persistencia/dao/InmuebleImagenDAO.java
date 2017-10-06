package persistencia.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import dto.InmuebleImagenDTO;
import persistencia.conexion.Conexion;

public class InmuebleImagenDAO {

	private static final String selectAll = "SELECT * FROM InmuebleImagen";
	private static final String insert = "INSERT INTO InmuebleImagen() VALUES(?, ?, ? )";
	private static final String delete = "DELETE FROM InmuebleImagen WHERE idImagen = ?";
	private static final String update = "UPDATE InmuebleImagen SET WHERE idImagen= ?";
	private static final String selectById = "SELECT * FROM InmuebleImagen WHERE idImagen = ?";
	private static final Conexion conexion = Conexion.getConexion();
	
	public List<InmuebleImagenDTO> readAll()
	{
		PreparedStatement statement;
		ResultSet resultSet; 
		ArrayList<InmuebleImagenDTO> imagen = new ArrayList<InmuebleImagenDTO>();
		try 
		{
			statement = conexion.getSQLConexion().prepareStatement(selectAll);
			resultSet = statement.executeQuery();
			
			while(resultSet.next())
			{
				imagen.add(new InmuebleImagenDTO(
						resultSet.getInt("idImagen"),
						resultSet.getString("idInmueble"),
						resultSet.getBlob("imagen")
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
		return imagen;
	}
	
	public boolean insert(InmuebleImagenDTO imagen) {
		PreparedStatement statement;
		try 
		{			
			statement = conexion.getSQLConexion().prepareStatement(insert);
			statement.setInt(1, imagen.getIdImagen());
			statement.setString(2, imagen.getIdInmueble());
			statement.setBlob(3, imagen.getImagen());
			if(statement.executeUpdate() > 0) //Si se ejecuta devuelvo true
				return true;
		} 
		catch (SQLException e) 
		{
			JOptionPane.showMessageDialog(null, "no se puede agregar imagen, verifique si ya existe");
		}
		finally //Se ejecuta siempre
		{
			conexion.cerrarConexion();
		}
		return false;		
	}

	public boolean update(InmuebleImagenDTO imagen, int imagenUpdate) {
		
		PreparedStatement statement;
		try 
		{
			statement = conexion.getSQLConexion().prepareStatement(update);
			statement.setInt(1, imagen.getIdImagen());
			statement.setString(2, imagen.getIdInmueble());
			statement.setBlob(3, imagen.getImagen());
			statement.setInt(4, imagenUpdate);
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

	public boolean delete(InmuebleImagenDTO imagen)
	{
		PreparedStatement statement;
		int chequeoUpdate=0;
		try 
		{
			statement = conexion.getSQLConexion().prepareStatement(delete);
			statement.setString(1, Integer.toString(imagen.getIdImagen()));
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

	public boolean seleccionar(InmuebleImagenDTO imagen)
	{
		PreparedStatement statement;
		ResultSet resultSet;
		try 
		{
			statement = conexion.getSQLConexion().prepareStatement(selectById);
			statement.setString(1, Integer.toString(imagen.getIdImagen()));
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
