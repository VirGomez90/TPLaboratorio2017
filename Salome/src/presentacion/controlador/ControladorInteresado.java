package presentacion.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import presentacion.vista.Interesados;
import presentacion.vista.VistaAltaInteresados;

public class ControladorInteresado implements ActionListener{ 
	Interesados ventanaInteresado;
	VistaAltaInteresados ventanaAltaInteresados;
	
	public ControladorInteresado(){
		this.ventanaInteresado = new Interesados(this);
		this.ventanaInteresado.setVisible(true);
		this.ventanaInteresado.getBtnAgregar().addActionListener(this);

	
	}
	
	public void inicialize()
	{
		
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		//PARA VISTA INTERESADOS

		if (e.getSource() == this.ventanaInteresado.getBtnAgregar())
		{
			this.ventanaAltaInteresados = new VistaAltaInteresados(this);
		}
	
		//me traigo los campos, modifico y guardo
		if (e.getSource() == this.ventanaInteresado.getBtnEditar())
		{
		
		}
		
		//lo seleciono y borro
		if (e.getSource() == this.ventanaInteresado.getBtnBorrar())
		{
		}
		
		//filtro en base a lo seleccionado
		if (e.getSource() == this.ventanaInteresado.getBtnBuscar())
		{
			
		}
		
		//PARA ALTA INTERESADOS, CHEQUEAR SI SU ID EXISTE, SI ES NUEVO LO CREO
		if (e.getSource() == this.ventanaAltaInteresados.getBtnGuardar())
		{
		
		
		}
		
		//PARA ALTA INTERESADOS, CHEQUEAR SI SU ID EXISTE, REEMPLAZO 
		if (e.getSource() == this.ventanaAltaInteresados.getBtnGuardar())
		{
		
		
		}

}
}
