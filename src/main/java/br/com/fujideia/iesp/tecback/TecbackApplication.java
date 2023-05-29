package br.com.fujideia.iesp.tecback;

import br.com.fujideia.iesp.tecback.model.Favoritos;
import br.com.fujideia.iesp.tecback.model.Genero;
import br.com.fujideia.iesp.tecback.service.FavoritosService;
import br.com.fujideia.iesp.tecback.service.GeneroService;
import br.com.fujideia.iesp.tecback.service.PagamentoService;
import br.com.fujideia.iesp.tecback.service.SerieService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TecbackApplication {

	public static void main(String[] args) {
		SpringApplication.run(TecbackApplication.class, args);
	}

	@Bean
	public FavoritosService Favoritos() {
		return new FavoritosService ();
	}
	@Bean
	public GeneroService Genero() {
		return new GeneroService ();
	}
	@Bean
	public PagamentoService Pagamento() {
		return new PagamentoService ();
	}
	@Bean
	public SerieService Serie() {
		return new SerieService ();
	}


}
