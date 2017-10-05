package presentacion.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import presentacion.vista.Contrato;
import presentacion.vista.Vista;

public class Controlador implements ActionListener 
{

	Vista vista;
	Contrato ventanaContrato;
	
	
	ControladorContrato controladorContrato;
	
	public Controlador(Vista vista)
	{ 
		this.vista = vista;
		this.vista.getBtnBuscar().addActionListener(this);
		this.vista.getBtnVer().addActionListener(this);
		this.vista.getMnContratos().addActionListener(this);
		this.vista.getMntmNuevoContrato().addActionListener(this);
		this.vista.getMntmConsultarContrato().addActionListener(this);
		this.vista.getMnInteresados().addActionListener(this);
		this.vista.getMntmNuevoInteresado().addActionListener(this);
		this.vista.getMntmConsultarInteresados().addActionListener(this);
		
	
			
	}

	public void inicialize()
	{
		this.llenarTabla();				
	}
	
	
	public void llenarTabla()
	{
		this.vista.getModelPersonas().setRowCount(0);
		this.vista.getModelPersonas().setColumnCount(0);
		this.vista.getModelPersonas().setColumnIdentifiers(this.vista.getNombreColumnas());
		
		this.vista.show();
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		if (e.getSource() == this.vista.getMntmNuevoContrato())
		{
			controladorContrato = new ControladorContrato();
			this.ventanaContrato = new Contrato(controladorContrato);
			this.controladorContrato.inicialize();
			
		}
		
		
	}

}