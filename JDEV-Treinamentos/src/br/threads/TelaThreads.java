package br.threads;

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
	private JLabel descricaoHora = new JLabel("Time Thread 1");
	private JTextField mostraTempo = new JTextField();
	
	private JLabel descricaoHora2 = new JLabel("Time Thread 2");
	private JTextField mostraTempo2 = new JTextField();
	
	//BOTAO
	private JButton botaoStart = new JButton("Start");
	private JButton botaoStop = new JButton("Stop");
	
	//THREAD
	Runnable threadForTime = new Runnable() {
		@Override
		public void run() {
			 
			while(true) {
				
				mostraTempo.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss")
						.format(Calendar.getInstance().getTime()));
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			
		}
	};
	
	Runnable threadForTime2 = new Runnable() {
		@Override
		public void run() {
			 
			while(true) {
				
				mostraTempo2.setText(new SimpleDateFormat("dd-MM-yyyy hh:mm.ss")
						.format(Calendar.getInstance().getTime()));
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			
		}
	};
	
	private Thread threadHora;
	private Thread threadHora2;
	
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
		grid.gridwidth = 2;
		grid.anchor = GridBagConstraints.WEST;
		grid.insets = new Insets(5,10,5,5);

		
		//----------- CODIGO -----------//
		
		descricaoHora.setPreferredSize(new Dimension(200,25));
		jPanel.add(descricaoHora,grid);
		
		grid.gridy++;// espacamento
		
		mostraTempo.setPreferredSize(new Dimension(200,25));
		jPanel.add(mostraTempo,grid);
		mostraTempo.setEditable(false);
		
		grid.gridy++;// espacamento Y
		
		descricaoHora2.setPreferredSize(new Dimension(200,25));
		jPanel.add(descricaoHora2,grid);
		
		grid.gridy++;// espacamento Y
		
		mostraTempo2.setPreferredSize(new Dimension(200,25));
		jPanel.add(mostraTempo2,grid);
		mostraTempo2.setEditable(false);
		
		grid.gridy++;// espacamento Y
		
		grid.gridwidth = 1;
		
		botaoStart.setPreferredSize(new Dimension(90,25));
		jPanel.add(botaoStart,grid);
		
		grid.gridx++;// espacamento X
		
		botaoStop.setPreferredSize(new Dimension(90,25));
		jPanel.add(botaoStop,grid);
		
		botaoStop.setEnabled(false);
		
		
		botaoStart.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				threadHora = new Thread(threadForTime);
				threadHora.start();
				
				threadHora2 = new Thread(threadForTime2);
				threadHora2.start();
				
				botaoStop.setEnabled(true);
				botaoStart.setEnabled(false);
			}
		});
		
		botaoStop.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				threadHora.stop();
				threadHora2.stop();
				
				botaoStop.setEnabled(false);
				botaoStart.setEnabled(true);
			}
		});
		
		add(jPanel,BorderLayout.WEST);
		
		
		
		//----------- CODIGO FIM-----------//
		
		setVisible(true);// torna a tabela visivel para o usuario
	}

	
	
	
	
	
	
	
}
