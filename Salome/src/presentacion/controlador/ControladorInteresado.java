package presentacion.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import presentacion.vista.Interesados;

public class ControladorInteresado implements ActionListener{ 
	Interesados ventanaInteresado;
	
	public ControladorInteresado(){
		this.ventanaInteresado = new Interesados(this);
		this.ventanaInteresado.setVisible(true);
	}
	
	public void inicialize()
	{
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.ventanaInteresado.getBtnGuardar())
		{
			this.ventanaInteresado.dispose();
		}
	}

}
