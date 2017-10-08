package presentacion.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import presentacion.vista.VentanaContrato1;
import presentacion.vista.VentanaContratoAlquiler;

public class ControladorContrato implements ActionListener
{
	VentanaContrato1 vC;
	VentanaContratoAlquiler ventanaContrato;
	
	public ControladorContrato ()
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
