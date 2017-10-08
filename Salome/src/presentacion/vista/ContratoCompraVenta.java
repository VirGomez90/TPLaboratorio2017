package presentacion.vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import com.toedter.calendar.JDateChooser;

import presentacion.controlador.ControladorContrato;

public class ContratoCompraVenta extends JFrame {

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
	private JTextField txtCargarArchivo;
	
	
	private JButton btnGuardar;
	private JButton btnBuscarVendedor;
	private JButton btnBuscarInquilino;

	ControladorContrato controlador;
	private JTextField txtComision;
	

	public ContratoCompraVenta(ControladorContrato controlador) 
	{
		//comentario de prueba
		setTitle("Contrato de Compra/Venta");
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
		
		JLabel lblDatos = new JLabel("Datos del Vendedor:");
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
		lblInmueble.setBounds(10, 493, 70, 14);
		panel.add(lblInmueble);
		
		JLabel lblFechaInicio = new JLabel("Fecha Inicio");
		lblFechaInicio.setBounds(10, 452, 84, 14);
		panel.add(lblFechaInicio);
		
		JDateChooser dChFechaInicio = new JDateChooser();
		dChFechaInicio.setBounds(117, 452, 97, 20);
		panel.add(dChFechaInicio);
		
		JLabel lblMonto = new JLabel("Monto");
		lblMonto.setBounds(317, 452, 64, 14);
		panel.add(lblMonto);
		
		JLabel lblCargarArchivo = new JLabel("Cargar archivo");
		lblCargarArchivo.setBounds(10, 538, 84, 14);
		panel.add(lblCargarArchivo);
		
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
		
		JComboBox<String> cmbxInmuebles = new JComboBox<String>();
		cmbxInmuebles.setBounds(117, 490, 149, 20);
		panel.add(cmbxInmuebles);
		
		txtMonto = new JTextField();
		txtMonto.setColumns(10);
		txtMonto.setBounds(370, 449, 84, 20);
		panel.add(txtMonto);
		
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(476, 613, 89, 23);
		btnGuardar.addActionListener(controlador);
		panel.add(btnGuardar);
		
	
		btnBuscarVendedor = new JButton("");
		btnBuscarVendedor.setToolTipText("Buscar");
		btnBuscarVendedor.setIcon(new ImageIcon(ContratoCompraVenta.class.getResource("/im\u00E1genes/lupa.jpg")));
		btnBuscarVendedor.setFont(new Font("Tahoma", Font.PLAIN, 5));
		btnBuscarVendedor.setSelectedIcon(null);
		btnBuscarVendedor.setBounds(250, 32, 26, 23);
		panel.add(btnBuscarVendedor);
		btnBuscarVendedor.addActionListener(controlador);
		
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
		
		JLabel lblDatosDelInquilino = new JLabel("Datos del Comprador:");
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
		
		btnBuscarInquilino = new JButton("");
		btnBuscarInquilino.setToolTipText("Buscar");
		btnBuscarInquilino.setIcon(new ImageIcon(ContratoCompraVenta.class.getResource("/im\u00E1genes/lupa.jpg")));
		btnBuscarInquilino.setBounds(253, 242, 23, 23);
		panel.add(btnBuscarInquilino);
		btnBuscarInquilino.addActionListener(controlador);
		
		txtCargarArchivo = new JTextField();
		txtCargarArchivo.setColumns(10);
		txtCargarArchivo.setBounds(117, 535, 255, 20);
		panel.add(txtCargarArchivo);
		
		JLabel lblComision = new JLabel("Comisi\u00F3n");
		lblComision.setBounds(317, 493, 64, 14);
		panel.add(lblComision);
		
		txtComision = new JTextField();
		txtComision.setColumns(10);
		txtComision.setBounds(370, 490, 84, 20);
		panel.add(txtComision);
	}

	public JButton getBtnGuardar() {
		return btnGuardar;
	}

	public JButton getBtnBuscarPropietario() {
		return btnBuscarVendedor;
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

	public JTextField getTxtCargarArchivo() {
		return txtCargarArchivo;
	}

	public void setTxtCargarArchivo(JTextField txtCargarArchivo) {
		this.txtCargarArchivo = txtCargarArchivo;
	}
	
	
}
