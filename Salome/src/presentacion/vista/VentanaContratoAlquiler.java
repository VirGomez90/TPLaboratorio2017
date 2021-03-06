package presentacion.vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import com.toedter.calendar.JDateChooser;

import presentacion.controlador.ControladorContratoAlquiler;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JSpinner;

public class VentanaContratoAlquiler extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtApellidoPropietario;
	private JTextField txtNombrePropietario;
	private JTextField txtDNIPropietario;
	private JTextField txtCallePropietario;
	private JTextField txtTelefonoPropietario;
	private JTextField txtEmailPropietario;
	private JTextField txtMonto;
	private JTextField txtAlturaPropietario;
	private JTextField txtLocalidadPropietario;
	private JTextField txtDniInquilino;
	private JTextField txtApellidoInquilino;
	private JTextField txtCalleInquilino;
	private JTextField txtLocalidadInquilino;
	private JTextField txtNombreInquilino;
	private JTextField txtAlturaInquilino;
	private JTextField txtTelefonoInquilino;
	private JTextField txtEmailInquilino;
	JComboBox<String> cmbxInmuebles;
	
	JDateChooser dChFechaInicio;
	JDateChooser dChFechaFin;
	JComboBox<String> cmbxTipoAlquiler;
	JComboBox<String> cmbxEscribania;
	
	JSpinner spinnerIncremento;
	JSpinner spinnerComision;
	
	private JButton btnGuardar;
	private JButton btnBuscarPropietario;
	private JButton btnBuscarInquilino;

	ControladorContratoAlquiler controlador;
	private JTextField txtCargarArchivo;
	

	public VentanaContratoAlquiler(ControladorContratoAlquiler controlador) 
	{
		//prueba
		setTitle("Contrato de Alquiler");
		setBounds(100, 100, 601, 801);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setResizable(false); 
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBounds(0, 11, 575, 721);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblDatos = new JLabel("Datos del Propietario:");
		lblDatos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDatos.setBounds(10, 0, 164, 25);
		panel.add(lblDatos);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(10, 68, 64, 14);
		panel.add(lblApellido);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(253, 68, 70, 14);
		panel.add(lblNombre);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setBounds(10, 36, 70, 14);
		panel.add(lblDni);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(253, 139, 70, 14);
		panel.add(lblTelefono);
		
		JLabel lblEmail = new JLabel("email");
		lblEmail.setBounds(10, 167, 70, 14);
		panel.add(lblEmail);
		
		JLabel lblInmueble = new JLabel("Inmueble");
		lblInmueble.setBounds(10, 452, 70, 14);
		panel.add(lblInmueble);
		
		JLabel lblFechaInicio = new JLabel("Fecha Inicio");
		lblFechaInicio.setBounds(10, 494, 84, 14);
		panel.add(lblFechaInicio);
		
		dChFechaInicio = new JDateChooser();
		dChFechaInicio.setBounds(77, 488, 97, 20);
		panel.add(dChFechaInicio);
		
		JLabel lblFechaFin = new JLabel("Fecha Fin");
		lblFechaFin.setBounds(195, 494, 64, 14);
		panel.add(lblFechaFin);
		

		dChFechaFin = new JDateChooser();
		dChFechaFin.setBounds(262, 488, 97, 20);
		panel.add(dChFechaFin);
		
		JLabel lblMonto = new JLabel("Monto");
		lblMonto.setBounds(10, 525, 64, 14);
		panel.add(lblMonto);
		
		txtApellidoPropietario = new JTextField();
		txtApellidoPropietario.setBounds(77, 65, 137, 20);
		panel.add(txtApellidoPropietario);
		txtApellidoPropietario.setColumns(10);
		
		txtNombrePropietario = new JTextField();
		txtNombrePropietario.setColumns(10);
		txtNombrePropietario.setBounds(317, 68, 137, 20);
		panel.add(txtNombrePropietario);
		
		txtDNIPropietario = new JTextField();
		txtDNIPropietario.setColumns(10);
		txtDNIPropietario.setBounds(77, 36, 137, 20);
		panel.add(txtDNIPropietario);
		
		txtTelefonoPropietario = new JTextField();
		txtTelefonoPropietario.setColumns(10);
		txtTelefonoPropietario.setBounds(317, 136, 137, 20);
		panel.add(txtTelefonoPropietario);
		
		txtEmailPropietario = new JTextField();
		txtEmailPropietario.setColumns(10);
		txtEmailPropietario.setBounds(77, 164, 137, 20);
		panel.add(txtEmailPropietario);
		
		
		cmbxInmuebles = new JComboBox<String>();
		cmbxInmuebles.setBounds(77, 449, 191, 20);
		panel.add(cmbxInmuebles);
		
		txtMonto = new JTextField();
		txtMonto.setColumns(10);
		txtMonto.setBounds(77, 522, 84, 20);
		panel.add(txtMonto);
		
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(476, 687, 89, 23);
		btnGuardar.addActionListener(controlador);
		panel.add(btnGuardar);
		
	
		btnBuscarPropietario = new JButton("...");
		btnBuscarPropietario.setBounds(250, 32, 41, 23);
		panel.add(btnBuscarPropietario);
		btnBuscarPropietario.addActionListener(controlador);
		
		JLabel lblCalle = new JLabel("Calle");
		lblCalle.setBounds(10, 103, 64, 14);
		panel.add(lblCalle);
		
		txtCallePropietario = new JTextField();
		txtCallePropietario.setColumns(10);
		txtCallePropietario.setBounds(77, 100, 137, 20);
		panel.add(txtCallePropietario);
		
		JLabel lblAltura = new JLabel("Altura");
		lblAltura.setBounds(253, 103, 64, 14);
		panel.add(lblAltura);
		
		txtAlturaPropietario = new JTextField();
		txtAlturaPropietario.setColumns(10);
		txtAlturaPropietario.setBounds(317, 100, 137, 20);
		panel.add(txtAlturaPropietario);
		
		JLabel lblLocalidad = new JLabel("Localidad");
		lblLocalidad.setBounds(10, 139, 70, 14);
		panel.add(lblLocalidad);
		
		txtLocalidadPropietario = new JTextField();
		txtLocalidadPropietario.setColumns(10);
		txtLocalidadPropietario.setBounds(77, 136, 137, 20);
		panel.add(txtLocalidadPropietario);
		
		JLabel lblDatosDelInquilino = new JLabel("Datos del Inquilino:");
		lblDatosDelInquilino.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDatosDelInquilino.setBounds(10, 210, 164, 25);
		panel.add(lblDatosDelInquilino);
		
		JLabel lblDniInquilino = new JLabel("DNI");
		lblDniInquilino.setBounds(10, 246, 70, 14);
		panel.add(lblDniInquilino);
		
		JLabel lblApellidoInquilino = new JLabel("Apellido");
		lblApellidoInquilino.setBounds(10, 271, 64, 14);
		panel.add(lblApellidoInquilino);
		
		JLabel lblCalleInquilino = new JLabel("Calle");
		lblCalleInquilino.setBounds(10, 296, 64, 14);
		panel.add(lblCalleInquilino);
		
		JLabel lblLocalidadInquilino = new JLabel("Localidad");
		lblLocalidadInquilino.setBounds(10, 330, 70, 14);
		panel.add(lblLocalidadInquilino);
		
		txtDniInquilino = new JTextField();
		txtDniInquilino.setColumns(10);
		txtDniInquilino.setBounds(77, 243, 137, 20);
		panel.add(txtDniInquilino);
		
		txtApellidoInquilino = new JTextField();
		txtApellidoInquilino.setColumns(10);
		txtApellidoInquilino.setBounds(77, 268, 137, 20);
		panel.add(txtApellidoInquilino);
		
		txtCalleInquilino = new JTextField();
		txtCalleInquilino.setColumns(10);
		txtCalleInquilino.setBounds(77, 293, 137, 20);
		panel.add(txtCalleInquilino);
		
		txtLocalidadInquilino = new JTextField();
		txtLocalidadInquilino.setColumns(10);
		txtLocalidadInquilino.setBounds(77, 324, 137, 20);
		panel.add(txtLocalidadInquilino);
		
		JLabel label_4 = new JLabel("Nombre");
		label_4.setBounds(253, 271, 70, 14);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("Altura");
		label_5.setBounds(253, 296, 64, 14);
		panel.add(label_5);
		
		JLabel label_6 = new JLabel("Telefono");
		label_6.setBounds(253, 330, 70, 14);
		panel.add(label_6);
		
		txtNombreInquilino = new JTextField();
		txtNombreInquilino.setColumns(10);
		txtNombreInquilino.setBounds(317, 268, 137, 20);
		panel.add(txtNombreInquilino);
		
		txtAlturaInquilino = new JTextField();
		txtAlturaInquilino.setColumns(10);
		txtAlturaInquilino.setBounds(317, 299, 137, 20);
		panel.add(txtAlturaInquilino);
		
		txtTelefonoInquilino = new JTextField();
		txtTelefonoInquilino.setColumns(10);
		txtTelefonoInquilino.setBounds(317, 327, 137, 20);
		panel.add(txtTelefonoInquilino);
		
		JLabel lblEmailInquilino = new JLabel("email");
		lblEmailInquilino.setBounds(10, 360, 70, 14);
		panel.add(lblEmailInquilino);
		
		txtEmailInquilino = new JTextField();
		txtEmailInquilino.setColumns(10);
		txtEmailInquilino.setBounds(77, 357, 137, 20);
		panel.add(txtEmailInquilino);
		
		JLabel lblInmueble_1 = new JLabel("Datos del Inmueble:");
		lblInmueble_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblInmueble_1.setBounds(10, 410, 164, 25);
		panel.add(lblInmueble_1);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setBounds(319, 452, 56, 14);
		panel.add(lblTipo);
		
		cmbxTipoAlquiler = new JComboBox<String>();
		cmbxTipoAlquiler.setBounds(357, 449, 97, 20);
		panel.add(cmbxTipoAlquiler);
		
		btnBuscarInquilino = new JButton("...");
		btnBuscarInquilino.setBounds(253, 242, 41, 23);
		panel.add(btnBuscarInquilino);
		
		JLabel lblIncremento = new JLabel("% incremento");
		lblIncremento.setBounds(10, 567, 77, 14);
		panel.add(lblIncremento);
		
		spinnerIncremento = new JSpinner();
		spinnerIncremento.setBounds(97, 564, 47, 20);
		panel.add(spinnerIncremento);
		
		JLabel lblComisin = new JLabel("% comisi\u00F3n");
		lblComisin.setBounds(195, 567, 77, 14);
		panel.add(lblComisin);
		
		spinnerComision = new JSpinner();
		spinnerComision.setBounds(270, 564, 47, 20);
		panel.add(spinnerComision);
		
		JLabel lblEscribania = new JLabel("Escribania");
		lblEscribania.setBounds(10, 619, 64, 14);
		panel.add(lblEscribania);
		
		cmbxEscribania = new JComboBox<String>();
		cmbxEscribania.setBounds(77, 616, 191, 20);
		panel.add(cmbxEscribania);
		
		JLabel lblCargarArchivo = new JLabel("Cargar Archivo");
		lblCargarArchivo.setBounds(10, 661, 84, 14);
		panel.add(lblCargarArchivo);
		
		txtCargarArchivo = new JTextField();
		txtCargarArchivo.setColumns(10);
		txtCargarArchivo.setBounds(90, 658, 178, 20);
		panel.add(txtCargarArchivo);
		btnBuscarInquilino.addActionListener(controlador);
	}

	public JButton getBtnGuardar() {
		return btnGuardar;
	}

	public JButton getBtnBuscarPropietario() {
		return btnBuscarPropietario;
	}

	public JButton getBtnBuscarInquilino() {
		return btnBuscarInquilino;
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

	public JTextField getTxtMonto() {
		return txtMonto;
	}

	public void setTxtMonto(JTextField txtMonto) {
		this.txtMonto = txtMonto;
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

	public JTextField getTxtDniInquilino() {
		return txtDniInquilino;
	}

	public void setTxtDniInquilino(JTextField txtDniInquilino) {
		this.txtDniInquilino = txtDniInquilino;
	}

	public JTextField getTxtApellidoInquilino() {
		return txtApellidoInquilino;
	}

	public void setTxtApellidoInquilino(JTextField txtApellidoInquilino) {
		this.txtApellidoInquilino = txtApellidoInquilino;
	}

	public JTextField getTxtCalleInquilino() {
		return txtCalleInquilino;
	}

	public void setTxtCalleInquilino(JTextField txtCalleInquilino) {
		this.txtCalleInquilino = txtCalleInquilino;
	}

	public JTextField getTxtLocalidadInquilino() {
		return txtLocalidadInquilino;
	}

	public void setTxtLocalidadInquilino(JTextField txtLocalidadInquilino) {
		this.txtLocalidadInquilino = txtLocalidadInquilino;
	}

	public JTextField getTxtNombreInquilino() {
		return txtNombreInquilino;
	}

	public void setTxtNombreInquilino(JTextField txtNombreInquilino) {
		this.txtNombreInquilino = txtNombreInquilino;
	}

	public JTextField getTxtAlturaInquilino() {
		return txtAlturaInquilino;
	}

	public void setTxtAlturaInquilino(JTextField txtAlturaInquilino) {
		this.txtAlturaInquilino = txtAlturaInquilino;
	}

	public JTextField getTxtTelefonoInquilino() {
		return txtTelefonoInquilino;
	}

	public void setTxtTelefonoInquilino(JTextField txtTelefonoInquilino) {
		this.txtTelefonoInquilino = txtTelefonoInquilino;
	}

	public JTextField getTxtEmailInquilino() {
		return txtEmailInquilino;
	}

	public void setTxtEmailInquilino(JTextField txtEmailInquilino) {
		this.txtEmailInquilino = txtEmailInquilino;
	}

	public JComboBox<String> getCmbxInmuebles() {
		return cmbxInmuebles;
	}

	public void setCmbxInmuebles(JComboBox<String> cmbxInmuebles) {
		this.cmbxInmuebles = cmbxInmuebles;
	}

	public JDateChooser getdChFechaInicio() {
		return dChFechaInicio;
	}

	public void setdChFechaInicio(JDateChooser dChFechaInicio) {
		this.dChFechaInicio = dChFechaInicio;
	}

	public JDateChooser getdChFechaFin() {
		return dChFechaFin;
	}

	public void setdChFechaFin(JDateChooser dChFechaFin) {
		this.dChFechaFin = dChFechaFin;
	}

	public JComboBox<String> getCmbxTipoAlquiler() {
		return cmbxTipoAlquiler;
	}

	public void setCmbxTipoAlquiler(JComboBox<String> cmbxTipoAlquiler) {
		this.cmbxTipoAlquiler = cmbxTipoAlquiler;
	}

	public JComboBox<String> getCmbxEscribania() {
		return cmbxEscribania;
	}

	public void setCmbxEscribania(JComboBox<String> cmbxEscribania) {
		this.cmbxEscribania = cmbxEscribania;
	}

	public JSpinner getSpinnerIncremento() {
		return spinnerIncremento;
	}

	public void setSpinnerIncremento(JSpinner spinnerIncremento) {
		this.spinnerIncremento = spinnerIncremento;
	}

	public JSpinner getSpinnerComision() {
		return spinnerComision;
	}

	public void setSpinnerComision(JSpinner spinnerComision) {
		this.spinnerComision = spinnerComision;
	}

	public JTextField getTxtCargarArchivo() {
		return txtCargarArchivo;
	}

	public void setTxtCargarArchivo(JTextField txtCargarArchivo) {
		this.txtCargarArchivo = txtCargarArchivo;
	}
	
	
}
