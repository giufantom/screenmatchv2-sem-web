package br.com.alura.screenmatchv2;

import br.com.alura.screenmatchv2.model.DadosEpisodio;
import br.com.alura.screenmatchv2.model.DadosSerie;
import br.com.alura.screenmatchv2.model.DadosTemporadas;
import br.com.alura.screenmatchv2.service.ConsumoApi;
import br.com.alura.screenmatchv2.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import br.com.alura.principal.Principal;
import java.util.ArrayList;
import java.util.Collection;

@SpringBootApplication
public class Screenmatchv2Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Screenmatchv2Application.class, args);
	}

	@Override
	public void run(String[] args) throws Exception {
		Principal principal = new Principal();
		principal.exibeMenu();
	}
}
