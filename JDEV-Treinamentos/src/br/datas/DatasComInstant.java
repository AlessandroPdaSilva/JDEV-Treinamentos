package br.datas;

import java.time.Duration;
import java.time.Instant;

public class DatasComInstant {

	public static void main(String[] args) throws InterruptedException {
		
		Instant agora = Instant.now();
		
		Thread.sleep(2000);
		
		Instant agora2 = Instant.now();
		
		Duration duracao = Duration.between(agora, agora2);// duration e para horas, minutos e segundos

		System.out.println("Duracao em segundos: "+duracao.getSeconds());
		System.out.println("Duracao em millisegundos: "+ duracao.toNanos());
	}

}
