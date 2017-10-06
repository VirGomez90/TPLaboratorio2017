package dto;

import java.sql.Blob;

public class InmuebleImagenDTO {
	
	private int idImagen;
	private String idInmueble;
	private Blob imagen;
	
	public InmuebleImagenDTO(
			int idImagen,
			String idInmueble,
			Blob imagen)
	{
		this.idImagen = idImagen;
		this.idInmueble = idInmueble;
		this.imagen = imagen;
		
	}
	
	public int getIdImagen() {
		return idImagen;
	}
	public void setIdImagen(int idImagen) {
		this.idImagen = idImagen;
	}
	public String getIdInmueble() {
		return idInmueble;
	}
	public void setIdInmueble(String idInmueble) {
		this.idInmueble = idInmueble;
	}
	public Blob getImagen() {
		return imagen;
	}
	public void setImagen(Blob imagen) {
		this.imagen = imagen;
	}
	

	
}
