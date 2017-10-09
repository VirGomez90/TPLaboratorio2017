package presentacion.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import dto.ContratoAlquilerDTO;
import dto.PersonaDTO;
import modelo.ContratoAlquiler;
import modelo.Persona;
import presentacion.vista.VentanaContrato1;
import presentacion.vista.VentanaContratoAlquiler;

public class ControladorContratoAlquiler implements ActionListener
{
	//comentario de prueba
	VentanaContrato1 vC;
	VentanaContratoAlquiler ventanaContrato;
	
	List <ContratoAlquilerDTO> contratoAlquilerEnTabla;
	List <PersonaDTO> personasDTOEnTabla;
	
	Persona auxPersona;
	ContratoAlquiler auxContratoAl = new ContratoAlquiler();
	
	public ControladorContratoAlquiler ()
	{
		this.vC = new VentanaContrato1(this);
		this.ventanaContrato = new VentanaContratoAlquiler(this);
	}

	public void inicialize()
	{
		llenarTabla();
	}
	
	
	public void llenarTabla()
	{
		this.vC.getModelAlquileres().setRowCount(0);
		this.vC.getModelAlquileres().setColumnCount(0);
		this.vC.getModelAlquileres().setColumnIdentifiers(this.vC.getNombreColumnas());
		
		this.contratoAlquilerEnTabla = auxContratoAl.obtenerContratoAlquiler();
		
		for (int i=0 ; i<this.contratoAlquilerEnTabla.size() ; i++)
		{
			Object [] fila = {this.contratoAlquilerEnTabla.get(i).getFechaInicio(), 
								this.contratoAlquilerEnTabla.get(i).getInquilino()};
			
			this.vC.getModelAlquileres().addRow(fila);
		}
		
		this.vC.setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if (e.getSource() == this.vC.getBtnNuevoContratoAlquiler())
		{
			this.ventanaContrato.setVisible(true);
		}
		
		if (e.getSource() == this.ventanaContrato.getBtnGuardar())
		{
			this.ventanaContrato.dispose();
		}
			
	}
}
