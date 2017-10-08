package presentacion.vista;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

import presentacion.controlador.ControladorInteresado;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.JComboBox;


public class Interesados extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable tablaPersonas;
	private DefaultTableModel modelPersonas;
	private  String[] nombreColumnas = {"Nombre", "Apellido", "DNI","Telefono" , "Email"};
	private JButton btnAgregar;
	private JButton btnBorrar;
	private JButton btnEditar;
	private JButton btnBuscar;

	private JTextField textAmbientes;
	private JTextField textMtsCubiertos;
	private JTextField textMtsTotal;
	private JTextField textBaños;
	private JTextField textHabitaciones;
	
	private JComboBox<String> cmboxTipoInmueble;
	
	public Interesados(ControladorInteresado controladorInteresado) 
	{
		setTitle("Menu Interesados");
		setBounds(100, 100, 601, 698);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setResizable(false); 
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBounds(10, 11, 575, 647);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JScrollPane spPersonas = new JScrollPane();
		spPersonas.setBounds(10, 11, 304, 625);
		panel.add(spPersonas);
		modelPersonas = new DefaultTableModel(null,nombreColumnas);

		tablaPersonas = new JTable(modelPersonas);
		
		tablaPersonas.getColumnModel().getColumn(0).setPreferredWidth(103);
		tablaPersonas.getColumnModel().getColumn(0).setResizable(false);
		tablaPersonas.getColumnModel().getColumn(1).setPreferredWidth(100);
		tablaPersonas.getColumnModel().getColumn(1).setResizable(false);
		
		spPersonas.setViewportView(tablaPersonas);
		
		btnAgregar = new JButton("Agregar");
		btnAgregar.setBounds(407, 46, 89, 23);
		panel.add(btnAgregar);
		
		btnEditar = new JButton("Editar");
		btnEditar.setBounds(407, 98, 89, 23);
		panel.add(btnEditar);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(407, 159, 89, 23);
		panel.add(btnBorrar);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(407, 600, 89, 23);
		panel.add(btnBuscar);
		
		JLabel lblBuscarPor = new JLabel("Filtrar resultados por :");
		lblBuscarPor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblBuscarPor.setBounds(355, 250, 168, 14);
		panel.add(lblBuscarPor);
		
		JLabel lblAmbientes = new JLabel("Ambientes");
		lblAmbientes.setBounds(355, 283, 68, 14);
		panel.add(lblAmbientes);
		
		JLabel lblMtsCubiertos = new JLabel("Mts Cubiertos");
		lblMtsCubiertos.setBounds(355, 331, 68, 14);
		panel.add(lblMtsCubiertos);
		
		JLabel lblMtsTotal = new JLabel("Mts total");
		lblMtsTotal.setBounds(355, 356, 68, 14);
		panel.add(lblMtsTotal);
		
		JCheckBox chckbxNewQuincho = new JCheckBox("Quincho");
		chckbxNewQuincho.setBounds(355, 468, 97, 23);
		panel.add(chckbxNewQuincho);
		
		JCheckBox chckbxParrilla = new JCheckBox("Parrilla");
		chckbxParrilla.setBounds(355, 494, 97, 23);
		panel.add(chckbxParrilla);
		
		JCheckBox chckbxSalon = new JCheckBox("Salon");
		chckbxSalon.setBounds(355, 546, 97, 23);
		panel.add(chckbxSalon);
		
		JLabel lblBaos = new JLabel("Ba\u00F1os");
		lblBaos.setBounds(355, 377, 46, 14);
		panel.add(lblBaos);
		
		JLabel lblHabitaciones = new JLabel("Habitaciones");
		lblHabitaciones.setBounds(355, 308, 61, 14);
		panel.add(lblHabitaciones);
		
		JCheckBox chckbxPileta = new JCheckBox("Pileta");
		chckbxPileta.setBounds(355, 520, 97, 23);
		panel.add(chckbxPileta);
		
		JCheckBox chckbxBalcon = new JCheckBox("Balcon");
		chckbxBalcon.setBounds(355, 572, 97, 23);
		panel.add(chckbxBalcon);
		
		textAmbientes = new JTextField();
		textAmbientes.setBounds(428, 283, 68, 14);
		panel.add(textAmbientes);
		textAmbientes.setColumns(10);
		
		textMtsCubiertos = new JTextField();
		textMtsCubiertos.setColumns(10);
		textMtsCubiertos.setBounds(428, 331, 68, 14);
		panel.add(textMtsCubiertos);
		
		textMtsTotal = new JTextField();
		textMtsTotal.setColumns(10);
		textMtsTotal.setBounds(428, 356, 68, 14);
		panel.add(textMtsTotal);
		
		textBaños = new JTextField();
		textBaños.setColumns(10);
		textBaños.setBounds(428, 377, 68, 14);
		panel.add(textBaños);
		
		textHabitaciones = new JTextField();
		textHabitaciones.setColumns(10);
		textHabitaciones.setBounds(428, 308, 68, 14);
		panel.add(textHabitaciones);
		
		JCheckBox chckbxGarage = new JCheckBox("Garage");
		chckbxGarage.setBounds(355, 442, 97, 23);
		panel.add(chckbxGarage);
		
		JLabel lblTipoInmueble = new JLabel("Tipo Inmueble");
		lblTipoInmueble.setBounds(355, 407, 81, 14);
		panel.add(lblTipoInmueble);
		
		cmboxTipoInmueble = new JComboBox<String>();
		cmboxTipoInmueble.setBounds(428, 402, 68, 20);
		panel.add(cmboxTipoInmueble);
		
	}
	
	public JButton getBtnAgregar() 
	{
		return btnAgregar;
	}

	public JButton getBtnBorrar() 
	{
		return btnBorrar;
	}
	
	public JButton getBtnBuscar() 
	{
		return btnBuscar;
	}
	
	public JButton getBtnEditar() 
	{
		return btnEditar;
	}
}


