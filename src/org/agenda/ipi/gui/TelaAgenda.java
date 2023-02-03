package org.agenda.ipi.gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.agenda.ipi.dao.ContatoDAO;
import org.agenda.ipi.model.Contato;

public class TelaAgenda extends JFrame{

	//Barra de menu
	private JMenuBar barra;
	private JMenu mAgenda;
	private JMenu mSobre;
	private JMenuItem miNovo;
	private JMenuItem miSair;
	
	//formulário
	private JPanel panel;
	private JLabel lblNome;
	private JTextField txfNome;
	private JLabel lblemail;
	private JTextField txfEmail;
	private JLabel lblTelefone;
	private JTextField txfTelefone;
	
	//botoes
	private JButton btnSalvar;
	private JButton btnLimpar;
	private JButton btnFechar;
	private JPanel panelBotoes;	
	
	
	public TelaAgenda() {
		//definir tamanho da tela
		setSize(320, 220);
		//definir título da janela
		setTitle("Minha Agenda");
		//definir ação ao fechar a janela
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//definir posição da janela na tela
		setLocationRelativeTo(null);
		//Bloquear redimensionamento da janlea
		setResizable(false);
		//Definir o gerenciador de layout da janela
		setLayout(new BorderLayout());
		
		carregarMenu();
		carregarFormulario();
		carregarBotoes();
	}
	
	
	private void carregarMenu() {
		
		barra = new JMenuBar();
		mAgenda = new JMenu("Agenda");
		mSobre = new JMenu("Sobre");
		
		miNovo = new JMenuItem("Novo");
		miSair = new JMenuItem("Sair");
		mAgenda.add(miNovo);
		mAgenda.add(miSair);
		barra.add(mAgenda);
		barra.add(mSobre);
		getContentPane().add(barra,BorderLayout.NORTH);
	}
	
	private void carregarFormulario() {
		panel = new JPanel();
		lblNome = new JLabel("Nome: ");
		txfNome = new JTextField(21);
		lblemail = new JLabel("E-mail: ");
		txfEmail = new JTextField(21);
		lblTelefone = new JLabel("Telefone: ");
		txfTelefone = new JTextField(20);
		panel.setLayout(new FlowLayout());
		panel.add(lblNome);
		panel.add(txfNome);
		panel.add(lblemail);
		panel.add(txfEmail);
		panel.add(lblTelefone);
		panel.add(txfTelefone);
		getContentPane().add(panel, BorderLayout.CENTER);
		
	}
	
	private void carregarBotoes() {
		panelBotoes = new JPanel();
		btnSalvar = new JButton("Salvar");
		btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new LimparAction());
		btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new FecharAction());
		panelBotoes.setLayout(new FlowLayout());
		btnSalvar.addActionListener(new SalvarAction());
		panelBotoes.add(btnSalvar);
		panelBotoes.add(btnLimpar);
		panelBotoes.add(btnFechar);
		getContentPane().add(panelBotoes, BorderLayout.SOUTH);
	}
	
	
	private class FecharAction implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int resposta = JOptionPane
					.showConfirmDialog(null, 
							"Deseja realmente fechar o programa?");
			if(resposta == 0)
				System.exit(0);
		}
	}
	
	private class LimparAction implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			txfNome.setText("");
			txfTelefone.setText("");
			txfEmail.setText("");
		}
		
	}
	
	
	private class SalvarAction implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			ContatoDAO.getInstance().addItem(new Contato(0, txfNome.getText(), txfEmail.getText(), txfTelefone.getText()));
		}
	}
	
}
