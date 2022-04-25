package br.interfaces;

import javax.swing.JOptionPane;

public class TesteDeInterface {
	
	public static void main(String[] args) {
		
		/*TESTE DE INTERFACE*/
		PermitirAcesso logar = new Login();
		
		String login = JOptionPane.showInputDialog(null, "Digite seu login");
		String senha = JOptionPane.showInputDialog(null, "Digite sua senha");
		
		/* login = "adm"
		 * senha = "adm" */
		
		
		if(logar.autenticar(login, senha)) {
			System.out.println("Parabens, voce esta logado!!");
		}else {
			System.out.println("Voce errou o login ou a senha. Tente novamente!!");
		}
		
	}
}
