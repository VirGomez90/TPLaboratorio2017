package presentacion.vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import java.awt.Label;
import javax.swing.JScrollPane;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.Font;
import com.toedter.calendar.JMonthChooser;
import com.toedter.calendar.JYearChooser;

import presentacion.controlador.ControladorContratoAlquiler;

import javax.swing.ImageIcon;

public class VentanaContrato1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;


	JScrollPane scrollPane;
	
	private Tabla tablaAlquileres;
	private DefaultTableModel modelAlquileres;

	private  String[] nombreColumnas = {"Fecha", "Inquilino"};
	
	ControladorContratoAlquiler controlador;
	
	JButton btnNuevoContratoAlquiler;
	JButton btnRenovarContrato;
	JButton btnBuscar;
	
	public VentanaContrato1(ControladorContratoAlquiler controlador) 
	{
		//comentario
		setTitle("Contratos");
		setBounds(100, 100, 647, 504);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 370, 443);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		contentPane.add(panel);
		panel.setLayout(null);
		
		Label label = new Label("Contratos de Alquileres");
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label.setBounds(10, 10, 237, 22);
		panel.add(label);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 120, 348, 312);
		scrollPane.setBorder(new LineBorder(SystemColor.desktop, 2));
		scrollPane.setBackground(Color.BLACK);
		panel.add(scrollPane);
		
		
		modelAlquileres = new DefaultTableModel(null,nombreColumnas);
		tablaAlquileres = new Tabla();
		tablaAlquileres.setModel(modelAlquileres);
		
		tablaAlquileres.getColumnModel().getColumn(0).setPreferredWidth(103);
		tablaAlquileres.getColumnModel().getColumn(0).setResizable(false);
		
		tablaAlquileres.getColumnModel().getColumn(1).setPreferredWidth(100);
		tablaAlquileres.getColumnModel().getColumn(1).setResizable(false);
		
		scrollPane.setViewportView(tablaAlquileres);
		
		Label lblMes = new Label("Mes:");
		lblMes.setBounds(10, 48, 60, 22);
		panel.add(lblMes);
		
		Label label_1 = new Label("Año:");
		label_1.setBounds(10, 76, 60, 22);
		panel.add(label_1);
		
		JMonthChooser monthChooser = new JMonthChooser();
		monthChooser.setBounds(73, 50, 99, 20);
		panel.add(monthChooser);
		
		JYearChooser yearChooser = new JYearChooser();
		yearChooser.setBounds(76, 76, 47, 20);
		panel.add(yearChooser);
		
		btnBuscar = new JButton("");
		btnBuscar.setIcon(new ImageIcon(VentanaContrato1.class.getResource("/im\u00E1genes/lupa.jpg")));
		btnBuscar.setToolTipText("Buscar");
		btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 5));
		btnBuscar.setBounds(209, 48, 26, 23);
		btnBuscar.addActionListener(controlador);
		panel.add(btnBuscar);

		btnNuevoContratoAlquiler = new JButton("Nuevo");
		btnNuevoContratoAlquiler.setBounds(414, 25, 100, 23);
		btnNuevoContratoAlquiler.addActionListener(controlador);
		contentPane.add(btnNuevoContratoAlquiler);
		
		btnRenovarContrato = new JButton("Renovar");
		btnRenovarContrato.setBounds(414, 82, 100, 23);
		btnRenovarContrato.addActionListener(controlador);
		contentPane.add(btnRenovarContrato);
	
	}

	public JButton getBtnNuevoContratoAlquiler() {
		return btnNuevoContratoAlquiler;
	}

	public JButton getBtnRenovarContrato() {
		return btnRenovarContrato;
	}

	public JButton getBtnBuscar() {
		return btnBuscar;
	}

	public Tabla getTablaAlquileres() {
		return tablaAlquileres;
	}

	public DefaultTableModel getModelAlquileres() {
		return modelAlquileres;
	}

	public String[] getNombreColumnas() {
		return nombreColumnas;
	}
	
	
}
