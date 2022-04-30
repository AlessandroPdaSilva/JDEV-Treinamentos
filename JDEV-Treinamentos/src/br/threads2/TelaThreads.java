package br.threads2;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaThreads extends JDialog{

	// TELA
	private JPanel jPanel = new JPanel(new GridBagLayout());
	
	//LABEL
	private JLabel campoTexto = new JLabel("Nome");
	private JTextField campoInput = new JTextField();
	
	private JLabel campoTexto2 = new JLabel("Email");
	private JTextField campoInput2 = new JTextField();
	
	//BOTAO
	private JButton botao1 = new JButton("Add lista");
	private JButton botao2 = new JButton("Stop");
	
	
	
	// CONSTRUTOR
	public TelaThreads() {
		// Configuracoes do JDialog
		setTitle("Threads em fila");
		setSize(new Dimension(300,300));
		setResizable(false);
		setLocationRelativeTo(null);
		
		
		
		// Gerenciador de Posicoes
		GridBagConstraints grid = new GridBagConstraints();
		grid.gridx = 0;
		grid.gridy = 0;
		grid.gridwidth = 2;
		grid.anchor = GridBagConstraints.WEST;
		grid.insets = new Insets(5,10,5,5);

		
		//----------- CODIGO -----------//
		
		campoTexto.setPreferredSize(new Dimension(200,25));//label
		jPanel.add(campoTexto,grid);
		
		grid.gridy++;// espacamento
		
		campoInput.setPreferredSize(new Dimension(200,25));//input
		jPanel.add(campoInput,grid);
		
		
		grid.gridy++;// espacamento Y
		
		campoTexto2.setPreferredSize(new Dimension(200,25));//label
		jPanel.add(campoTexto2,grid);
		
		grid.gridy++;// espacamento Y
		
		campoInput2.setPreferredSize(new Dimension(200,25));//input
		jPanel.add(campoInput2,grid);
		
		
		grid.gridy++;// espacamento Y
		
		grid.gridwidth = 1;
		
		botao1.setPreferredSize(new Dimension(90,25));//botao
		jPanel.add(botao1,grid);
		
		grid.gridx++;// espacamento X
		
		botao2.setPreferredSize(new Dimension(90,25));//botao
		jPanel.add(botao2,grid);
		
		
		
		
		// THREAD DE FILA
		ClasseThreadDeFila fila = new ClasseThreadDeFila();
		fila.start();
		

		
		
		// BOTAO
		botao1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(fila == null) {
					ClasseThreadDeFila fila = new ClasseThreadDeFila();
					fila.start();
				}
				
				String nome = campoInput.getText();
				String email = campoInput2.getText();
				
				Pessoa p = new Pessoa();
				p.setNome(nome);
				p.setEmail(email);
				
				fila.add(p);
			}
		});
		
		
		
		// BOTAO
		botao2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ClasseThreadDeFila fila = new ClasseThreadDeFila();
				fila.stop();
				fila = null;
			}
		});
		
		
		add(jPanel,BorderLayout.WEST);
		
		
		
		//----------- CODIGO FIM-----------//
		
		setVisible(true);// torna a tabela visivel para o usuario
	}

	
	
	
	
	
	
	
}
