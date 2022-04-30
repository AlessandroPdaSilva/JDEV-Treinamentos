package br.threads2;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ClasseThreadDeFila extends Thread{// Classe Thread

	private static ConcurrentLinkedQueue<Pessoa> filaPessoa = new ConcurrentLinkedQueue<Pessoa>();// listaFila
	
	// Add Pessoa
	public static void add(Pessoa p){
		filaPessoa.add(p);
	}
	
	
	//RUN
	@Override
	public void run() {
		
		
		
		while(true) {// Toda Thread precisa ter um Loop Infinito
		
			
			
			synchronized (filaPessoa) {// O synchronized evita acesso de outro processo dentro desse codigo
				
				Iterator filaPessoaInterator = filaPessoa.iterator();// iterator serve para percorrer lista
				while(filaPessoaInterator.hasNext()) {
					
					
					Pessoa p = (Pessoa) filaPessoaInterator.next();
					
					// Execucao de algum codigo (Ex: gerar milhares de emails em massa)
					System.out.println(" ------- Execucao do codigo -------");
					System.out.println(p.getNome());
					System.out.println(p.getEmail());
					
					filaPessoa.remove();
					
					
					try {// dar um tempo para descarga de memoria
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				
				
				
				try {// mais um tempo para descarga de memoria
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				
				
			}// ---fim synchronized
		
		}
		 
	}
	
	
}
