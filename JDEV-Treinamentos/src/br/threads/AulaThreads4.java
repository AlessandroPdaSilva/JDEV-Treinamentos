package br.threads;

public class AulaThreads4 {

	public static void main(String[] args) {
		
		
		System.out.println("-------- Inicio do fluxo --------");
		
		// Envio de Email
		Thread envioDeEmail = new Thread(threadEmail);
		envioDeEmail.start();

		// Envio de Nota Fiscal
		Thread envioDeNotaFiscal = new Thread(threadNotaFiscal);
		envioDeNotaFiscal.start();

		System.out.println("-------- Fim do fluxo --------");

	}

	
	
	
	// Metodo Thread - Email
	private static Runnable threadEmail = new Thread(){
		public void run() {
			
			
			//---- codigo -----//
			
			for(int i = 1; i < 10; i++) {
				System.out.println("Enviando email!!");
				
				try {// FUNCAO SLEEP
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
			
			//---- codigo -----//
			
			
		};
		
		
	};
	
	
	// Metodo Thread - Nota Fiscal
	private static Runnable threadNotaFiscal = new Thread() {
		public void run() {
			
			
			//---- codigo -----//
			
			for(int i = 1; i < 10; i++) {
				System.out.println("Enviando nota Fiscal!!");
				
				try {// FUNCAO SLEEP
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
			
			//---- codigo -----//
			
		};
	};
	
	
	
	
}
