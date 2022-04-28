package threads;

public class Aulathreads2 {

	public static void main(String[] args) {
		
		System.out.println("-------- Inicio do fluxo --------");
		
		// DECLARACAO DA THREAD
		new Thread() {
			
			// RUN
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

		
		System.out.println("-------- Fim do fluxo --------");
	}

}
