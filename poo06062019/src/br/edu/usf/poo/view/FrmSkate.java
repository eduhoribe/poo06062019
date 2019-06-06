package br.edu.usf.poo.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import br.edu.usf.poo.client.LixaClient;
import br.edu.usf.poo.client.RodaClient;
import br.edu.usf.poo.client.RolamentoClient;
import br.edu.usf.poo.client.ShapeClient;
import br.edu.usf.poo.client.TruckClient;
import br.edu.usf.poo.models.Lixa;
import br.edu.usf.poo.models.Roda;
import br.edu.usf.poo.models.Rolamento;
import br.edu.usf.poo.models.Shape;
import br.edu.usf.poo.models.Truck;
import javax.swing.SwingConstants;

public class FrmSkate extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JComboBox<Lixa>		 accLixa;
	private JComboBox<Roda>		 accRoda;
	private JComboBox<Rolamento> accRolamento;
	private JComboBox<Shape>	 accShape;
	private JComboBox<Truck>	 accTruck;

	private JLabel lblValorfinal;

	public FrmSkate() {
		initComponents();
	}
	
	private void save() {
		// TODO
	}
	
	private void cancel() {
		// TODO
	}
	
	private void initComponents() {
		setMinimumSize(new Dimension(1280, 720));
		
		JPanel panel = new JPanel();
		
		getContentPane().add(panel, BorderLayout.CENTER);
		
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 500, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JPanel panel_3 = new JPanel();
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.gridwidth = 2;
		gbc_panel_3.insets = new Insets(0, 0, 5, 0);
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.gridx = 0;
		gbc_panel_3.gridy = 0;
		panel.add(panel_3, gbc_panel_3);
		
		JLabel lblLixa = new JLabel("Lixa");
		
		GridBagConstraints gbc_lblLixa = new GridBagConstraints();
		gbc_lblLixa.fill = GridBagConstraints.VERTICAL;
		gbc_lblLixa.insets = new Insets(0, 0, 5, 5);
		gbc_lblLixa.gridx = 0;
		gbc_lblLixa.gridy = 1;
		panel.add(lblLixa, gbc_lblLixa);
		
		accLixa = new JComboBox<>(new Vector<>(LixaClient.gi().getAll()));
		accLixa.setSelectedItem(null);
		
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 1;
		gbc_panel_1.gridy = 1;
		panel.add(accLixa, gbc_panel_1);
		
		JLabel lblRoda = new JLabel("Roda");
		GridBagConstraints gbc_lblRoda = new GridBagConstraints();
		gbc_lblRoda.insets = new Insets(0, 0, 5, 5);
		gbc_lblRoda.gridx = 0;
		gbc_lblRoda.gridy = 2;
		panel.add(lblRoda, gbc_lblRoda);
		
		accRoda = new JComboBox<>(new Vector<>(RodaClient.gi().getAll()));
		accRoda.setSelectedItem(null);
		
		GridBagConstraints gbc_lblA = new GridBagConstraints();
		gbc_lblA.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblA.insets = new Insets(0, 0, 5, 0);
		gbc_lblA.gridx = 1;
		gbc_lblA.gridy = 2;
		panel.add(accRoda, gbc_lblA);
		
		JLabel lblRolamento = new JLabel("Rolamento");
		GridBagConstraints gbc_lblRolamento = new GridBagConstraints();
		gbc_lblRolamento.insets = new Insets(0, 0, 5, 5);
		gbc_lblRolamento.gridx = 0;
		gbc_lblRolamento.gridy = 3;
		panel.add(lblRolamento, gbc_lblRolamento);
		
		accRolamento = new JComboBox<>(new Vector<>(RolamentoClient.gi().getAll()));
		accRolamento.setSelectedItem(null);
		
		GridBagConstraints gbc_lblB = new GridBagConstraints();
		gbc_lblB.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblB.insets = new Insets(0, 0, 5, 0);
		gbc_lblB.gridx = 1;
		gbc_lblB.gridy = 3;
		panel.add(accRolamento, gbc_lblB);
		
		JLabel lblShape = new JLabel("Shape");
		GridBagConstraints gbc_lblShape = new GridBagConstraints();
		gbc_lblShape.insets = new Insets(0, 0, 5, 5);
		gbc_lblShape.gridx = 0;
		gbc_lblShape.gridy = 4;
		panel.add(lblShape, gbc_lblShape);
		
		accShape = new JComboBox<>(new Vector<>(ShapeClient.gi().getAll()));
		accShape.setSelectedItem(null);
		
		GridBagConstraints gbc_lblV = new GridBagConstraints();
		gbc_lblV.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblV.insets = new Insets(0, 0, 5, 0);
		gbc_lblV.gridx = 1;
		gbc_lblV.gridy = 4;
		panel.add(accShape, gbc_lblV);
		
		JLabel lblTruck = new JLabel("Truck");
		GridBagConstraints gbc_lblTruck = new GridBagConstraints();
		gbc_lblTruck.insets = new Insets(0, 0, 5, 5);
		gbc_lblTruck.gridx = 0;
		gbc_lblTruck.gridy = 5;
		panel.add(lblTruck, gbc_lblTruck);
		
		accTruck = new JComboBox<>(new Vector<>(TruckClient.gi().getAll()));
		accTruck.setSelectedItem(null);
		
		GridBagConstraints gbc_lblD = new GridBagConstraints();
		gbc_lblD.insets = new Insets(0, 0, 5, 0);
		gbc_lblD.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblD.gridx = 1;
		gbc_lblD.gridy = 5;
		panel.add(accTruck, gbc_lblD);
		
		JPanel panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.gridwidth = 2;
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 0;
		gbc_panel_2.gridy = 6;
		panel.add(panel_2, gbc_panel_2);
		
		lblValorfinal = new JLabel();
		lblValorfinal.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblValorfinal);
		
		JPanel panel_1 = new JPanel();
		getContentPane().add(panel_1, BorderLayout.SOUTH);
		
		JButton btnSave = new JButton("Salvar");
		btnSave.setBackground(new Color(47, 128, 38));
		btnSave.setForeground(Color.WHITE);
		btnSave.setPreferredSize(new Dimension(100, 25));
		btnSave.addActionListener((e) -> save());
		panel_1.add(btnSave);
		
		JButton btnCancel = new JButton("Cancelar");
		btnCancel.setBackground(new Color(255, 6, 1));
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setPreferredSize(new Dimension(100, 25));
		btnCancel.addActionListener((e) -> cancel());
		panel_1.add(btnCancel);
	}
	
}