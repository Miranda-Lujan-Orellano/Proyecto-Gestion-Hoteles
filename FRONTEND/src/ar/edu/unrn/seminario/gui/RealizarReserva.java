package ar.edu.unrn.seminario.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class RealizarReserva extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RealizarReserva frame = new RealizarReserva();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RealizarReserva() {
		setTitle("Realizar Reserva");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(-8, -23, 685, 594);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		
		panel.setPreferredSize(new Dimension(580, 500));
		
		scrollPane.setViewportView(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_11 = new JLabel("Agregar cliente:");
		lblNewLabel_11.setBounds(10, 11, 111, 14);
		panel.add(lblNewLabel_11);
		
		JLabel lblNewLabel_5 = new JLabel("Cliente");
		lblNewLabel_5.setBounds(30, 36, 46, 14);
		panel.add(lblNewLabel_5);
		
		textField_3 = new JTextField();
		textField_3.setBounds(145, 33, 117, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Nombre:");
		lblNewLabel_7.setBounds(40, 61, 46, 14);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_9 = new JLabel("Contacto:");
		lblNewLabel_9.setBounds(40, 86, 60, 14);
		panel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_8 = new JLabel("-");
		lblNewLabel_8.setBounds(110, 61, 133, 14);
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_10 = new JLabel("-");
		lblNewLabel_10.setBounds(110, 86, 133, 14);
		panel.add(lblNewLabel_10);
		
		JButton btnBuscarCliente = new JButton("Buscar");
		btnBuscarCliente.setBounds(307, 32, 89, 23);
		panel.add(btnBuscarCliente);
		
		JButton btnAgregarAReserva = new JButton("Agregar a la Reserva");
		btnAgregarAReserva.setBounds(69, 111, 135, 23);
		panel.add(btnAgregarAReserva);
		
		JLabel lblNewLabel = new JLabel("Fecha de entrada");
		lblNewLabel.setBounds(30, 165, 92, 14);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(145, 162, 117, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_3 = new JButton("Buscar habitaciones disponibles");
		btnNewButton_3.setBounds(307, 161, 183, 23);
		panel.add(btnNewButton_3);
		
		JLabel lblNewLabel_1 = new JLabel("Fecha de salida");
		lblNewLabel_1.setBounds(30, 196, 79, 14);
		panel.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(145, 193, 117, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Habitación/es");
		lblNewLabel_2.setBounds(30, 221, 79, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_6 = new JLabel("Plan solicitado");
		lblNewLabel_6.setBounds(30, 388, 67, 14);
		panel.add(lblNewLabel_6);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(145, 384, 117, 22);
		panel.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Estándar", "Premium"}));
		
		textField_2 = new JTextField();
		textField_2.setBounds(145, 417, 117, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Huéspedes");
		lblNewLabel_3.setBounds(30, 354, 79, 14);
		panel.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Agregar");
		btnNewButton.setBounds(145, 350, 117, 23);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("Seña");
		lblNewLabel_4.setBounds(30, 420, 46, 14);
		panel.add(lblNewLabel_4);
		
		JButton btnNewButton_1 = new JButton("Aceptar");
		btnNewButton_1.setBounds(30, 478, 89, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Cancelar");
		btnNewButton_2.setBounds(135, 478, 89, 23);
		panel.add(btnNewButton_2);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(30, 235, 505, 82);
		panel.add(scrollPane_1);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
			},
			new String[] {
				"Numero", "TIpo de habitacion", "Tipo de camas", "Cantidad de camas", "Precio", "Seleccionar"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				true, true, true, false, true, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(55);
		table.getColumnModel().getColumn(5).setResizable(false);
		scrollPane_1.setViewportView(table);

	}
}
