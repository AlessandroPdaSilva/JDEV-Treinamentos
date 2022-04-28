package br.threads;

public class AulaThreads3 {

	public static void main(String[] args) {
System.out.println("-------- Inicio do fluxo --------");
		
		// Envio de Email
		new Thread() {
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
		}.start();

		// Envio de Nota Fiscal
		new Thread() {
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
		}.start();

		System.out.println("-------- Fim do fluxo --------");

	}

}
