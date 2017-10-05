package presentacion.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import presentacion.vista.Contrato;

public class ControladorContrato implements ActionListener
{
	Contrato ventanaContrato;
	
	public ControladorContrato ()
	{
		this.ventanaContrato = new Contrato(this);
		this.ventanaContrato.setVisible(true);
		
	}

	public void inicialize()
	{
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if (e.getSource() == this.ventanaContrato.getBtnGuardar())
		{
			this.ventanaContrato.dispose();
		}
			
	}
}
