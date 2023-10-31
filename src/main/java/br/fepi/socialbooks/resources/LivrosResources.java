package br.fepi.socialbooks.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.fepi.socialbooks.Livro;

@RestController
public class LivrosResources {
	
	@RequestMapping(value = "/livros", method = RequestMethod.GET)
	public List<Livro> listar() {
		
		Livro livro1 = new Livro("A arte da guerra");
		Livro livro2 = new Livro("O pequeno príncipe");
		Livro livro3 = new Livro("Teste");
		
		Livro[] livros = {
			livro1, livro2, livro3
		};
		
		return Arrays.asList(livros);
	}
}
