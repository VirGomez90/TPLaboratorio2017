package presentacion.vista;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

import presentacion.controlador.ControladorInteresado;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JSeparator;

public class VistaInteresadosAlta extends JFrame {
	// calse de mierda subite
	//holllllllllaaaaaaa
	private static final long serialVersionUID = 1L;
	private JPanel contentPanel;
	private JTextField txtApellidoPropietario;
	private JTextField txtNombrePropietario;
	private JTextField txtDNIPropietario;
	private JTextField txtCallePropietario;
	private JTextField txtTelefonoPropietario;
	private JTextField txtEmailPropietario;
	private JTextField txtHabitaciones;
	private JTextField txtAlturaPropietario;
	private JTextField txtLocalidadPropietario;
	
	
	private JButton btnGuardar;

	ControladorInteresado controladorInteresados;
	private JTextField textAmbientes;
	private JTextField textMtsCubiertos;
	private JTextField textMtsTotales;
	private JTextField textBanios;
	
	public VistaInteresadosAlta(ControladorInteresado controladorInteresados) 
	{
		setTitle("Registrar interesado");
		this.controladorInteresados=controladorInteresados;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 601, 698);
		contentPanel = new JPanel();
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPanel);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBounds(10, 11, 575, 647);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblDatos = new JLabel("Datos del la Persona Interesada");
		lblDatos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDatos.setBounds(10, 24, 204, 25);
		panel.add(lblDatos);
		
		JLabel lblApellido = new JLabel("* Apellido");
		lblApellido.setBounds(10, 108, 64, 14);
		panel.add(lblApellido);
		
		JLabel lblNombre = new JLabel("* Nombre");
		lblNombre.setBounds(253, 108, 70, 14);
		panel.add(lblNombre);
		
		JLabel lblDni = new JLabel("* DNI");
		lblDni.setBounds(10, 76, 70, 14);
		panel.add(lblDni);
		
		JLabel lblTelefono = new JLabel("* Telefono");
		lblTelefono.setBounds(253, 179, 70, 14);
		panel.add(lblTelefono);
		
		JLabel lblEmail = new JLabel("email");
		lblEmail.setBounds(10, 207, 70, 14);
		panel.add(lblEmail);
		
		JLabel lblAmbientes = new JLabel("Ambientes");
		lblAmbientes.setBounds(10, 328, 70, 14);
		panel.add(lblAmbientes);
		
		JLabel lblMtsVubiertos = new JLabel("Metros cubiertos");
		lblMtsVubiertos.setBounds(253, 328, 84, 14);
		panel.add(lblMtsVubiertos);
		
		JLabel lblMtsTotales = new JLabel("Metros totales");
		lblMtsTotales.setBounds(253, 359, 84, 14);
		panel.add(lblMtsTotales);
		
		txtApellidoPropietario = new JTextField();
		txtApellidoPropietario.setBounds(77, 105, 137, 20);
		panel.add(txtApellidoPropietario);
		txtApellidoPropietario.setColumns(10);
		
		txtNombrePropietario = new JTextField();
		txtNombrePropietario.setColumns(10);
		txtNombrePropietario.setBounds(317, 108, 137, 20);
		panel.add(txtNombrePropietario);
		
		txtDNIPropietario = new JTextField();
		txtDNIPropietario.setColumns(10);
		txtDNIPropietario.setBounds(77, 76, 137, 20);
		panel.add(txtDNIPropietario);
		
		txtTelefonoPropietario = new JTextField();
		txtTelefonoPropietario.setColumns(10);
		txtTelefonoPropietario.setBounds(317, 176, 137, 20);
		panel.add(txtTelefonoPropietario);
		
		txtEmailPropietario = new JTextField();
		txtEmailPropietario.setColumns(10);
		txtEmailPropietario.setBounds(77, 204, 137, 20);
		panel.add(txtEmailPropietario);
		
		txtHabitaciones = new JTextField();
		txtHabitaciones.setColumns(10);
		txtHabitaciones.setBounds(77, 353, 64, 20);
		panel.add(txtHabitaciones);
		
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(233, 589, 89, 23);
		panel.add(btnGuardar);
		
	

		JLabel lblCalle = new JLabel("Calle");
		lblCalle.setBounds(10, 143, 64, 14);
		panel.add(lblCalle);
		
		txtCallePropietario = new JTextField();
		txtCallePropietario.setColumns(10);
		txtCallePropietario.setBounds(77, 140, 137, 20);
		panel.add(txtCallePropietario);
		
		JLabel lblAltura = new JLabel("Altura");
		lblAltura.setBounds(253, 143, 64, 14);
		panel.add(lblAltura);
		
		txtAlturaPropietario = new JTextField();
		txtAlturaPropietario.setColumns(10);
		txtAlturaPropietario.setBounds(317, 140, 137, 20);
		panel.add(txtAlturaPropietario);
		
		JLabel lblLocalidad = new JLabel("Localidad");
		lblLocalidad.setBounds(10, 179, 70, 14);
		panel.add(lblLocalidad);
		
		txtLocalidadPropietario = new JTextField();
		txtLocalidadPropietario.setColumns(10);
		txtLocalidadPropietario.setBounds(77, 176, 137, 20);
		panel.add(txtLocalidadPropietario);
		
		JLabel lblInmueble_1 = new JLabel("Datos del Inmueble que busca:");
		lblInmueble_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblInmueble_1.setBounds(10, 255, 189, 25);
		panel.add(lblInmueble_1);
		
		JComboBox<String> cmbxTipoInmueble = new JComboBox<String>();
		cmbxTipoInmueble.setBounds(104, 508, 95, 20);
		panel.add(cmbxTipoInmueble);
		
		JLabel lblHabitaciones = new JLabel("Habitaciones");
		lblHabitaciones.setBounds(10, 359, 84, 14);
		panel.add(lblHabitaciones);
		
		JLabel lblTipoInmueble = new JLabel("Tipo de inmueble");
		lblTipoInmueble.setBounds(10, 511, 84, 14);
		panel.add(lblTipoInmueble);
		
		JCheckBox chckbxQuincho = new JCheckBox("Quincho");
		chckbxQuincho.setBounds(10, 443, 97, 23);
		panel.add(chckbxQuincho);
		
		JCheckBox chckbxParrilla = new JCheckBox("Parrilla");
		chckbxParrilla.setBounds(10, 391, 97, 23);
		panel.add(chckbxParrilla);
		
		JCheckBox chckbxSalon = new JCheckBox("Salon");
		chckbxSalon.setBounds(10, 417, 97, 23);
		panel.add(chckbxSalon);
		
		JCheckBox chckbxGarage = new JCheckBox("Garage");
		chckbxGarage.setBounds(253, 428, 97, 23);
		panel.add(chckbxGarage);
		
		JCheckBox chckbxPileta = new JCheckBox("Pileta");
		chckbxPileta.setBounds(10, 469, 97, 23);
		panel.add(chckbxPileta);
		
		JCheckBox chckbxBalcon = new JCheckBox("Balcon");
		chckbxBalcon.setBounds(253, 469, 97, 23);
		panel.add(chckbxBalcon);
		
		textAmbientes = new JTextField();
		textAmbientes.setColumns(10);
		textAmbientes.setBounds(77, 325, 64, 20);
		panel.add(textAmbientes);
		
		textMtsCubiertos = new JTextField();
		textMtsCubiertos.setColumns(10);
		textMtsCubiertos.setBounds(347, 325, 64, 20);
		panel.add(textMtsCubiertos);
		
		textMtsTotales = new JTextField();
		textMtsTotales.setColumns(10);
		textMtsTotales.setBounds(347, 356, 64, 20);
		panel.add(textMtsTotales);
		
		JLabel lblBanios = new JLabel("Ba\u00F1os");
		lblBanios.setBounds(253, 395, 84, 14);
		panel.add(lblBanios);
		
		textBanios = new JTextField();
		textBanios.setColumns(10);
		textBanios.setBounds(347, 392, 64, 20);
		panel.add(textBanios);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 278, 499, 2);
		panel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 49, 499, 2);
		panel.add(separator_1);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(253, 74, 64, 23);
		panel.add(btnBuscar);
		
		this.setVisible(true);

	}

	
	
	public JButton getBtnGuardar() {
		return btnGuardar;
	}
}