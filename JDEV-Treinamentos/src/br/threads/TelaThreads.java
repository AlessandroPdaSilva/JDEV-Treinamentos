package br.threads;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaThreads extends JDialog{

	// TELA
	private JPanel jPanel = new JPanel(new GridBagLayout());
	
	//LABEL
	private JLabel descricaoHora = new JLabel("Time Thread 1");
	private JTextField mostraTempo = new JTextField();
	
	private JLabel descricaoHora2 = new JLabel("Time Thread 2");
	private JTextField mostraTempo2 = new JTextField();
	
	//BOTAO
	private JButton botaoStart = new JButton("Start");
	private JButton botaoStop = new JButton("Stop");
	
	
	
	// CONSTRUTOR
	public TelaThreads() {
		// Configuracoes do JDialog
		setTitle("Primeira Tela em JDialog");
		setSize(new Dimension(300,300));
		setResizable(false);
		setLocationRelativeTo(null);
		
		
		
		// Gerenciador de Posicoes
		GridBagConstraints grid = new GridBagConstraints();
		grid.gridx = 0;
		grid.gridy = 0;

		
		//----------- CODIGO -----------//
		
		descricaoHora.setPreferredSize(new Dimension(200,25));
		jPanel.add(descricaoHora,grid);
		
		grid.gridy++;// espacamento
		
		mostraTempo.setPreferredSize(new Dimension(200,25));
		jPanel.add(mostraTempo,grid);
		
		grid.gridy++;// espacamento
		
		descricaoHora2.setPreferredSize(new Dimension(200,25));
		jPanel.add(descricaoHora2,grid);
		
		grid.gridy++;// espacamento
		
		mostraTempo2.setPreferredSize(new Dimension(200,25));
		jPanel.add(mostraTempo2,grid);
		
		grid.gridy++;// espacamento
		
		botaoStart.setPreferredSize(new Dimension(90,25));
		jPanel.add(botaoStart,grid);
		
		grid.gridy++;// espacamento
		
		botaoStop.setPreferredSize(new Dimension(90,25));
		jPanel.add(botaoStop,grid);
		
		
		add(jPanel,BorderLayout.WEST);
		
		
		//----------- CODIGO FIM-----------//
		
		setVisible(true);// torna a tabela visivel para o usuario
	}

	
	
	
	
	
	
	
}
