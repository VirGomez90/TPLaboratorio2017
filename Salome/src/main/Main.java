package main;

import java.io.IOException;

import presentacion.controlador.ControladorHome;
import presentacion.vista.VistaHome;


public class Main 
{

	public static void main(String[] args) throws IOException 
	{
		VistaHome vista = new VistaHome();
		ControladorHome controlador = new ControladorHome (vista);
		controlador.inicialize();
	}
}
