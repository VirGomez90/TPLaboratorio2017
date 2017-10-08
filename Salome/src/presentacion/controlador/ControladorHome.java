package presentacion.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import presentacion.vista.VentanaContrato1;
import presentacion.vista.VentanaContratoAlquiler;
import presentacion.vista.VistaHome;
import presentacion.vista.VistaInteresado;
import presentacion.vista.VistaInteresadosAlta;

public class ControladorHome implements ActionListener 
{
//comentario de prueba
	VistaHome vista;
	VentanaContratoAlquiler ventanaContrato;
	VentanaContrato1 vC;
	
	VistaInteresado ventanaInteresados;
	VistaInteresadosAlta ventanaAltaInteresados; 
	
	ControladorContratoAlquiler controladorContrato;
	ControladorInteresado controladorInteresados;
	
	public ControladorHome(VistaHome vista)
	{ 
		this.vista = vista;
		this.vista.getBtnBuscar().addActionListener(this);
		this.vista.getBtnVer().addActionListener(this);
		this.vista.getMnContratos().addActionListener(this); 
		this.vista.getMntmContratoAlquiler().addActionListener(this);
		this.vista.getMntmConsultarContrato().addActionListener(this);
		this.vista.getMnInteresados().addActionListener(this);
		this.vista.getMntmConsultarInteresados().addActionListener(this);
		this.vista.getMntmPago().addActionListener(this);
		
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
		if (e.getSource() == this.vista.getMntmContratoAlquiler())
		{
			controladorContrato = new ControladorContratoAlquiler();
			this.vC = new VentanaContrato1(controladorContrato);
			this.controladorContrato.inicialize();
			
		}
		
		if (e.getSource() == this.vista.getMntmConsultarInteresados())
		{
			controladorInteresados = new ControladorInteresado();
			this.ventanaInteresados = new VistaInteresado(controladorInteresados);
			this.controladorInteresados.inicialize();
			
		}
		
//		if (e.getSource() == this.vista.getMntmPago())
//		{
//			controladorContrato = new ControladorContrato();
//			this.vC = new VentanaContrato1(controladorContrato);
//			this.controladorContrato.inicialize();
//			
//		}
		
	}

}
