package presentacion.vista;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

import presentacion.controlador.Controlador;
import presentacion.controlador.ControladorInteresado;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JSeparator;

public class Interesados extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
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
	private JButton btnBuscarPropietario;

	Controlador controlador;
	private JTextField textAmbientes;
	private JTextField textMtsCubiertos;
	private JTextField textMtsTotales;
	private JTextField textBanios;
	
	public Interesados(ControladorInteresado controladorInteresado) 
	{
		setTitle("Registrar interesado");
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
		
		JLabel lblDatos = new JLabel("Datos del la Persona Interesada");
		lblDatos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDatos.setBounds(10, 24, 204, 25);
		panel.add(lblDatos);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(10, 108, 64, 14);
		panel.add(lblApellido);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(253, 108, 70, 14);
		panel.add(lblNombre);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setBounds(10, 76, 70, 14);
		panel.add(lblDni);
		
		JLabel lblTelefono = new JLabel("Telefono");
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
		txtHabitaciones.setBounds(87, 356, 64, 20);
		panel.add(txtHabitaciones);
		
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(233, 589, 89, 23);
		btnGuardar.addActionListener(controladorInteresado);
		panel.add(btnGuardar);
		
	
		btnBuscarPropietario = new JButton("...");
		btnBuscarPropietario.setBounds(250, 72, 41, 23);
		panel.add(btnBuscarPropietario);
		btnBuscarPropietario.addActionListener(controladorInteresado);
		
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
		lblInmueble_1.setBounds(10, 268, 189, 25);
		panel.add(lblInmueble_1);
		
		JComboBox<String> cmbxTipoInmueble = new JComboBox<String>();
		cmbxTipoInmueble.setBounds(119, 508, 95, 20);
		panel.add(cmbxTipoInmueble);
		
		JLabel lblHabitaciones = new JLabel("Habitaciones");
		lblHabitaciones.setBounds(10, 359, 84, 14);
		panel.add(lblHabitaciones);
		
		JLabel lblTipoInmueble = new JLabel("Tipo de inmueble");
		lblTipoInmueble.setBounds(10, 511, 99, 14);
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
		textAmbientes.setBounds(87, 325, 64, 20);
		panel.add(textAmbientes);
		
		textMtsCubiertos = new JTextField();
		textMtsCubiertos.setColumns(10);
		textMtsCubiertos.setBounds(359, 325, 64, 20);
		panel.add(textMtsCubiertos);
		
		textMtsTotales = new JTextField();
		textMtsTotales.setColumns(10);
		textMtsTotales.setBounds(359, 356, 64, 20);
		panel.add(textMtsTotales);
		
		JLabel lblBanios = new JLabel("Ba\u00F1os");
		lblBanios.setBounds(253, 395, 84, 14);
		panel.add(lblBanios);
		
		textBanios = new JTextField();
		textBanios.setColumns(10);
		textBanios.setBounds(359, 392, 64, 20);
		panel.add(textBanios);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 291, 499, 2);
		panel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 49, 499, 2);
		panel.add(separator_1);
	}

	public JButton getBtnGuardar() {
		return btnGuardar;
	}

	public JTextField getTxtApellidoPropietario() {
		return txtApellidoPropietario;
	}

	public void setTxtApellidoPropietario(JTextField txtApellidoPropietario) {
		this.txtApellidoPropietario = txtApellidoPropietario;
	}

	public JTextField getTxtNombrePropietario() {
		return txtNombrePropietario;
	}

	public void setTxtNombrePropietario(JTextField txtNombrePropietario) {
		this.txtNombrePropietario = txtNombrePropietario;
	}

	public JTextField getTxtDNIPropietario() {
		return txtDNIPropietario;
	}

	public void setTxtDNIPropietario(JTextField txtDNIPropietario) {
		this.txtDNIPropietario = txtDNIPropietario;
	}

	public JTextField getTxtCallePropietario() {
		return txtCallePropietario;
	}

	public void setTxtCallePropietario(JTextField txtCallePropietario) {
		this.txtCallePropietario = txtCallePropietario;
	}

	public JTextField getTxtTelefonoPropietario() {
		return txtTelefonoPropietario;
	}

	public void setTxtTelefonoPropietario(JTextField txtTelefonoPropietario) {
		this.txtTelefonoPropietario = txtTelefonoPropietario;
	}

	public JTextField getTxtEmailPropietario() {
		return txtEmailPropietario;
	}

	public void setTxtEmailPropietario(JTextField txtEmailPropietario) {
		this.txtEmailPropietario = txtEmailPropietario;
	}

	public JTextField getTxtHabitaciones() {
		return txtHabitaciones;
	}

	public void setTxtHabitaciones(JTextField txtHabitaciones) {
		this.txtHabitaciones = txtHabitaciones;
	}

	public JTextField getTxtAlturaPropietario() {
		return txtAlturaPropietario;
	}

	public void setTxtAlturaPropietario(JTextField txtAlturaPropietario) {
		this.txtAlturaPropietario = txtAlturaPropietario;
	}

	public JTextField getTxtLocalidadPropietario() {
		return txtLocalidadPropietario;
	}

	public void setTxtLocalidadPropietario(JTextField txtLocalidadPropietario) {
		this.txtLocalidadPropietario = txtLocalidadPropietario;
	}

	public JButton getBtnBuscarPropietario() {
		return btnBuscarPropietario;
	}

	public void setBtnBuscarPropietario(JButton btnBuscarPropietario) {
		this.btnBuscarPropietario = btnBuscarPropietario;
	}

	public JTextField getTextAmbientes() {
		return textAmbientes;
	}

	public void setTextAmbientes(JTextField textAmbientes) {
		this.textAmbientes = textAmbientes;
	}

	public JTextField getTextMtsCubiertos() {
		return textMtsCubiertos;
	}

	public void setTextMtsCubiertos(JTextField textMtsCubiertos) {
		this.textMtsCubiertos = textMtsCubiertos;
	}

	public JTextField getTextMtsTotales() {
		return textMtsTotales;
	}

	public void setTextMtsTotales(JTextField textMtsTotales) {
		this.textMtsTotales = textMtsTotales;
	}

	public JTextField getTextBanios() {
		return textBanios;
	}

	public void setTextBanios(JTextField textBanios) {
		this.textBanios = textBanios;
	}
	
	
}


