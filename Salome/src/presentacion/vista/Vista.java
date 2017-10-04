package presentacion.vista;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Frame;
import javax.swing.JMenuBar;
import java.awt.Color;
import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import com.toedter.calendar.JCalendar;
import java.awt.Label;
import javax.swing.JMenuItem;


public class Vista
{
	private JFrame frmInmobiliaria;
	private Tabla tablaNotificaciones;
	private Tabla tablaContratos;
	private Tabla tablaAlquileres;

	
	private DefaultTableModel modelNotificaciones;
	private  String[] nombreColumnas = {"Notificaciones"};

	private DefaultTableModel modelContratos;
	private DefaultTableModel modelAlquileres;

	private  String[] nombreColumnasContratos = {"Fecha", "Inquilino"};

	JMenuBar menuBar;
	JMenu mnInmuebles;
	JMenu mnBoletosCompraventa;
	JMenu mnCitas;
	JMenu mnContratos;
	JMenu mnInmobiliariasColegas;
	JMenu mnCartelesInmobiliarios;
	JMenu mnReportes;
	JMenu mnInteresados;
	JMenu mnCalificaciones;
	JMenu mnPagos;
	JMenu mnCobros;
	JMenu mnBackup;

	
	JComboBox<String> cmbxOperacion;
	JComboBox<String> cmbxTipoPropiedad;
	JComboBox<String> cmbxProvRegion;
	JComboBox<String> cmbxLocalidadBarrio;
	JButton btnBuscar;
	JButton btnVer;
	private JPanel panelContratos;
	private JScrollPane spContratos;
	private JMenuItem mntmNuevoContrato;
	private JMenuItem mntmConsultarContrato;
	private JMenuItem mntmNuevoInteresado;
	private JMenuItem mntmConsultarInteresados;
	/**
	 * @wbp.nonvisual location=-3,-31
	 */
	

	public Vista() 
	{
		super();
		initialize();
	}

	private void initialize() 
	{
		frmInmobiliaria = new JFrame();
		frmInmobiliaria.setTitle("L\u00F3pez & L\u00F3pez Asociados");
		frmInmobiliaria.setBounds(100, 100, 1144, 465);
		frmInmobiliaria.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmInmobiliaria.getContentPane().setLayout(null);
		frmInmobiliaria.setExtendedState(Frame.MAXIMIZED_BOTH);
		

		JPanel panelNotificaciones = new JPanel();
		panelNotificaciones.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelNotificaciones.setBounds(0, 46, 276, 589);
		frmInmobiliaria.getContentPane().add(panelNotificaciones);
		panelNotificaciones.setLayout(null);
		
		JScrollPane spNotificaciones = new JScrollPane();
		spNotificaciones.setBackground(SystemColor.desktop);
		spNotificaciones.setBorder(new LineBorder(SystemColor.desktop, 2));
		spNotificaciones.setBounds(10, 11, 257, 568);
		panelNotificaciones.add(spNotificaciones);
		
		modelNotificaciones = new DefaultTableModel(null,nombreColumnas);
		tablaNotificaciones = new Tabla();
		tablaNotificaciones.setModel(modelNotificaciones);
		
		tablaNotificaciones.getColumnModel().getColumn(0).setPreferredWidth(103);
		tablaNotificaciones.getColumnModel().getColumn(0).setResizable(false);
		
	
		spNotificaciones.setViewportView(tablaNotificaciones);
		
		
		menuBar = new JMenuBar();
		menuBar.setBackground(Color.LIGHT_GRAY);
		menuBar.setBounds(0, 0, 1354, 35);
		frmInmobiliaria.getContentPane().add(menuBar);
		
		mnInmuebles = new JMenu("Inmuebles");
		menuBar.add(mnInmuebles);
		
		mnBoletosCompraventa = new JMenu("Boletos Compra/Venta");
		menuBar.add(mnBoletosCompraventa);
		
		mnCitas = new JMenu("Citas");
		menuBar.add(mnCitas);
		
		mnContratos = new JMenu("Contratos");
		menuBar.add(mnContratos);
		
		mntmNuevoContrato = new JMenuItem("Nuevo Contrato");
		mnContratos.add(mntmNuevoContrato);
		
		mntmConsultarContrato = new JMenuItem("Consultar Contratos");
		mnContratos.add(mntmConsultarContrato);
		
		mnInmobiliariasColegas = new JMenu("Inmobiliarias Colegas");
		menuBar.add(mnInmobiliariasColegas);
		
		mnCartelesInmobiliarios = new JMenu("Carteles Inmobiliarios");
		menuBar.add(mnCartelesInmobiliarios);
		
		mnReportes = new JMenu("Reportes");
		menuBar.add(mnReportes);
		
		mnInteresados = new JMenu("Interesados");
		menuBar.add(mnInteresados);
		
		mntmNuevoInteresado = new JMenuItem("Nuevo Interesado");
		mnInteresados.add(mntmNuevoInteresado);
		
		mntmConsultarInteresados = new JMenuItem("Consultar Interesados");
		mnInteresados.add(mntmConsultarInteresados);
		
		mnCalificaciones = new JMenu("Calificaciones");
		menuBar.add(mnCalificaciones);
		
		mnPagos = new JMenu("Pagos");
		menuBar.add(mnPagos);
		
		mnCobros = new JMenu("Cobros");
		menuBar.add(mnCobros);
		
		mnBackup = new JMenu("Back-up");
		menuBar.add(mnBackup);
		
		JPanel panelBusqueda = new JPanel();
		panelBusqueda.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelBusqueda.setBounds(286, 46, 1058, 344);
		frmInmobiliaria.getContentPane().add(panelBusqueda);
		panelBusqueda.setLayout(null);
		
		JLabel lblBusquedaDePropiedades = new JLabel("B\u00FAsqueda de Propiedades");
		lblBusquedaDePropiedades.setLabelFor(frmInmobiliaria);
		lblBusquedaDePropiedades.setBounds(10, 11, 331, 23);
		panelBusqueda.add(lblBusquedaDePropiedades);

		cmbxOperacion = new JComboBox<String>();
		cmbxOperacion.setBounds(10, 39, 117, 20);
		panelBusqueda.add(cmbxOperacion);
		cmbxOperacion.setName("Operación");
		
		cmbxTipoPropiedad = new JComboBox<String>();
		cmbxTipoPropiedad.setName("Propiedad");
		cmbxTipoPropiedad.setBounds(156, 39, 117, 20);
		panelBusqueda.add(cmbxTipoPropiedad);
		
		cmbxProvRegion = new JComboBox<String>();
		cmbxProvRegion.setName("Prov/Region");
		cmbxProvRegion.setBounds(302, 39, 117, 20);
		panelBusqueda.add(cmbxProvRegion);
		
		cmbxLocalidadBarrio = new JComboBox<String>();
		cmbxLocalidadBarrio.setName("Localidad/Barrio");
		cmbxLocalidadBarrio.setBounds(450, 39, 117, 20);
		panelBusqueda.add(cmbxLocalidadBarrio);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(274, 83, 89, 23);
		panelBusqueda.add(btnBuscar);
		
		JLabel lblTusCitasHoy = new JLabel("Tus citas hoy:");
		lblTusCitasHoy.setBounds(10, 127, 331, 23);
		panelBusqueda.add(lblTusCitasHoy);
		
		
		btnVer = new JButton("Ver");
		btnVer.setBounds(54, 313, 89, 23);
		panelBusqueda.add(btnVer);
		
		JCalendar calendar = new JCalendar();
		calendar.setBounds(10, 149, 184, 153);
		panelBusqueda.add(calendar);
		
		
		panelContratos = new JPanel();
		panelContratos.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelContratos.setBounds(286, 401, 507, 234);
		frmInmobiliaria.getContentPane().add(panelContratos);
		panelContratos.setLayout(null);

		Label label = new Label("Contratos Pr\u00F3ximos a Vencer");
		label.setBounds(10, 10, 458, 22);
		panelContratos.add(label);
		
		spContratos = new JScrollPane();
		spContratos.setBounds(10, 41, 487, 182);
		spContratos.setBorder(new LineBorder(SystemColor.desktop, 2));
		spContratos.setBackground(Color.BLACK);
		panelContratos.add(spContratos);
		
		modelContratos = new DefaultTableModel(null,nombreColumnasContratos);
		tablaContratos = new Tabla();
		tablaContratos.setModel(modelContratos);
		
		tablaContratos.getColumnModel().getColumn(0).setPreferredWidth(103);
		tablaContratos.getColumnModel().getColumn(0).setResizable(false);
		
		tablaContratos.getColumnModel().getColumn(1).setPreferredWidth(100);
		tablaContratos.getColumnModel().getColumn(1).setResizable(false);
		
		spContratos.setViewportView(tablaContratos);
		
		
		
		JPanel panelAlquileres = new JPanel();
		panelAlquileres.setLayout(null);
		panelAlquileres.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelAlquileres.setBounds(821, 401, 523, 234);
		frmInmobiliaria.getContentPane().add(panelAlquileres);
		
		Label lblAlquileres = new Label("Alquileres Pr\u00F3ximos a Vencer");
		lblAlquileres.setBounds(10, 10, 458, 22);
		panelAlquileres.add(lblAlquileres);
		
		JScrollPane spAlquileres = new JScrollPane();
		spAlquileres.setBorder(new LineBorder(SystemColor.desktop, 2));
		spAlquileres.setBackground(Color.BLACK);
		spAlquileres.setBounds(10, 41, 503, 182);
		panelAlquileres.add(spAlquileres);
		
		///
	
		
		modelAlquileres = new DefaultTableModel(null,nombreColumnasContratos);
		tablaAlquileres = new Tabla();
		tablaAlquileres.setModel(modelAlquileres);
		
		tablaAlquileres.getColumnModel().getColumn(0).setPreferredWidth(103);
		tablaAlquileres.getColumnModel().getColumn(0).setResizable(false);
		
		tablaAlquileres.getColumnModel().getColumn(1).setPreferredWidth(100);
		tablaAlquileres.getColumnModel().getColumn(1).setResizable(false);
		
		spAlquileres.setViewportView(tablaAlquileres);
	
		
	}
	
	public void show()
	{
		this.frmInmobiliaria.setVisible(true);
	}
	
	public DefaultTableModel getModelPersonas() 
	{
		return modelNotificaciones;
	}
	
	public JTable getTablaPersonas()
	{
		return tablaNotificaciones;
	}

	public String[] getNombreColumnas() 
	{
		return nombreColumnas;
	}

	
	public JComboBox<String> getCmbxOperacion() {
		return cmbxOperacion;
	}

	public void setCmbxOperacion(JComboBox<String> cmbxOperacion) {
		this.cmbxOperacion = cmbxOperacion;
	}

	public JComboBox<String> getCmbxTipoPropiedad() {
		return cmbxTipoPropiedad;
	}

	public void setCmbxTipoPropiedad(JComboBox<String> cmbxTipoPropiedad) {
		this.cmbxTipoPropiedad = cmbxTipoPropiedad;
	}

	public JComboBox<String> getCmbxProvRegion() {
		return cmbxProvRegion;
	}

	public void setCmbxProvRegion(JComboBox<String> cmbxProvRegion) {
		this.cmbxProvRegion = cmbxProvRegion;
	}

	public JComboBox<String> getCmbxLocalidadBarrio() {
		return cmbxLocalidadBarrio;
	}

	public void setCmbxLocalidadBarrio(JComboBox<String> cmbxLocalidadBarrio) {
		this.cmbxLocalidadBarrio = cmbxLocalidadBarrio;
	}

	public JMenuBar getMenuBar() {
		return menuBar;
	}

	public JMenu getMnInmuebles() {
		return mnInmuebles;
	}

	public JMenu getMnBoletosCompraventa() {
		return mnBoletosCompraventa;
	}

	public JMenu getMnCitas() {
		return mnCitas;
	}

	public JMenu getMnContratos() {
		return mnContratos;
	}

	public JMenu getMnInmobiliariasColegas() {
		return mnInmobiliariasColegas;
	}

	public JMenu getMnCartelesInmobiliarios() {
		return mnCartelesInmobiliarios;
	}

	public JMenu getMnReportes() {
		return mnReportes;
	}

	public JMenu getMnInteresados() {
		return mnInteresados;
	}

	public JMenu getMnCalificaciones() {
		return mnCalificaciones;
	}

	public JMenu getMnPagos() {
		return mnPagos;
	}

	public JMenu getMnCobros() {
		return mnCobros;
	}

	public JMenu getMnBackup() {
		return mnBackup;
	}

	public JButton getBtnBuscar() {
		return btnBuscar;
	}

	public JButton getBtnVer() {
		return btnVer;
	}

	
	public JMenuItem getMntmNuevoContrato() {
		return mntmNuevoContrato;
	}

	public JMenuItem getMntmConsultarContrato() {
		return mntmConsultarContrato;
	}
	public JMenuItem getMntmNuevoInteresado() {
		return mntmNuevoInteresado;
	}

	public JMenuItem getMntmConsultarInteresados() {
		return mntmConsultarInteresados;
	}


}
