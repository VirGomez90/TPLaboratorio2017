package main;

import java.io.IOException;

import presentacion.controlador.Controlador;
import presentacion.vista.Vista;


public class Main 
{

	public static void main(String[] args) throws IOException 
	{
		//hola soy un cambio
		Vista vista = new Vista();
		Controlador controlador = new Controlador (vista);
		controlador.inicialize();
	}
}
