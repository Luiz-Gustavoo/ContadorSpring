package br.com.desafio.desafio;

import br.com.desafio.desafio.modelos.Contador;
import br.com.desafio.desafio.services.LerNumero;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesafioApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DesafioApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		System.out.println("teste");

		LerNumero lerNumero = new LerNumero();
		int numeroDigitado = lerNumero.lerNumero();

		Contador contador = new Contador();
		contador.contador(numeroDigitado);
	}
}
