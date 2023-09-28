package br.fepi.socialbooks;

//anotaçoes trazem o 'import' automaticamente
//caso nao venha automaticamente basta fazer um Ctrl+Shift+0

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LivrosResources {
	
	//Adiciona o recurso. no valor se coloca /nome para acessar o recurso.
	@RequestMapping(value = "/livros", method = RequestMethod.GET)
	public String listar() {
		return "O pequeno príncipe; Os segredos da mente milionaria.";
	}

}
