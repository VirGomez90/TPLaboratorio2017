package presentacion.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import com.toedter.calendar.JDateChooser;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class Contrato extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtApellido;
	private JTextField txtNombre;
	private JTextField txtDNI;
	private JTextField txtTelefono;
	private JTextField txtEmail;
	private JTextField txtMonto;

	
	public Contrato() {
		setTitle("Contratos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 601, 418);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBounds(10, 11, 565, 357);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblDatos = new JLabel("Datos:");
		lblDatos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDatos.setBounds(10, 0, 143, 25);
		panel.add(lblDatos);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(10, 40, 70, 14);
		panel.add(lblApellido);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 68, 70, 14);
		panel.add(lblNombre);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setBounds(10, 97, 70, 14);
		panel.add(lblDni);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(10, 128, 70, 14);
		panel.add(lblTelefono);
		
		JLabel lblEmail = new JLabel("email");
		lblEmail.setBounds(10, 153, 70, 14);
		panel.add(lblEmail);
		
		JLabel lblInmueble = new JLabel("Inmueble");
		lblInmueble.setBounds(10, 189, 70, 14);
		panel.add(lblInmueble);
		
		JLabel lblFechaInicio = new JLabel("Fecha Inicio");
		lblFechaInicio.setBounds(10, 230, 84, 14);
		panel.add(lblFechaInicio);
		
		JDateChooser dChFechaInicio = new JDateChooser();
		dChFechaInicio.setBounds(90, 230, 106, 20);
		panel.add(dChFechaInicio);
		
		JLabel lblFechaFin = new JLabel("Fecha Fin");
		lblFechaFin.setBounds(206, 230, 64, 14);
		panel.add(lblFechaFin);
		
		JDateChooser dChFechaFin = new JDateChooser();
		dChFechaFin.setBounds(264, 230, 106, 20);
		panel.add(dChFechaFin);
		
		JLabel lblMonto = new JLabel("Monto");
		lblMonto.setBounds(10, 282, 84, 14);
		panel.add(lblMonto);
		
		JLabel lblCargarArchivo = new JLabel("Cargar archivo");
		lblCargarArchivo.setBounds(10, 319, 84, 14);
		panel.add(lblCargarArchivo);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(90, 37, 280, 20);
		panel.add(txtApellido);
		txtApellido.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(90, 65, 280, 20);
		panel.add(txtNombre);
		
		txtDNI = new JTextField();
		txtDNI.setColumns(10);
		txtDNI.setBounds(90, 94, 280, 20);
		panel.add(txtDNI);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(90, 125, 280, 20);
		panel.add(txtTelefono);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(90, 150, 280, 20);
		panel.add(txtEmail);
		
		JComboBox cmbxInmuebles = new JComboBox();
		cmbxInmuebles.setBounds(90, 186, 191, 20);
		panel.add(cmbxInmuebles);
		
		txtMonto = new JTextField();
		txtMonto.setColumns(10);
		txtMonto.setBounds(90, 279, 84, 20);
		panel.add(txtMonto);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(283, 315, 89, 23);
		panel.add(btnGuardar);
	}
}
