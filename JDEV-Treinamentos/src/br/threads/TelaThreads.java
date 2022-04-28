package br.threads;

import java.awt.Dimension;

import javax.swing.JDialog;

public class TelaThreads extends JDialog{

	public TelaThreads() {
		setTitle("Primeira Tela em JDialog");
		setSize(new Dimension(300,300));
		setResizable(false);
		setLocationRelativeTo(null);
		
		setVisible(true);
	}
	
	
}
