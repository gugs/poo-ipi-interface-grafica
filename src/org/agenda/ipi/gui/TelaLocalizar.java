package org.agenda.ipi.gui;

import javax.swing.JDialog;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaLocalizar extends JDialog{
	private JTextField txfLocalizar;
	private JTextField txfNome;
	private JTextField txfEmail;
	private JTextField txfTelefone;
	
	
	public TelaLocalizar() {
		
		setTitle("Tela Localizar");
		getContentPane().setLayout(null);
		setSize(459,360);
		setModal(true);
		JButton btnLocalizar = new JButton("Localizar");
		btnLocalizar.setBounds(39, 199, 89, 23);
		getContentPane().add(btnLocalizar);
		
		JLabel lblNewLabel = new JLabel("Localizar:");
		lblNewLabel.setBounds(48, 35, 46, 14);
		getContentPane().add(lblNewLabel);
		
		txfLocalizar = new JTextField();
		txfLocalizar.setBounds(104, 32, 86, 20);
		getContentPane().add(txfLocalizar);
		txfLocalizar.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nome:");
		lblNewLabel_1.setBounds(10, 77, 46, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("E-mail:");
		lblNewLabel_2.setBounds(10, 113, 46, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Telefone:");
		lblNewLabel_3.setBounds(10, 148, 46, 14);
		getContentPane().add(lblNewLabel_3);
		
		txfNome = new JTextField();
		txfNome.setBounds(48, 74, 361, 20);
		getContentPane().add(txfNome);
		txfNome.setColumns(10);
		
		txfEmail = new JTextField();
		txfEmail.setBounds(48, 110, 361, 20);
		getContentPane().add(txfEmail);
		txfEmail.setColumns(10);
		
		txfTelefone = new JTextField();
		txfTelefone.setBounds(66, 145, 124, 20);
		getContentPane().add(txfTelefone);
		txfTelefone.setColumns(10);
	}
}
