/**
 * 
 */
/* A aplicação deverá conter um end-point que retorna
uma string com os seus objetivos de aprendizagem para
essa semana. */

package br.org.generation.habilidades.controller;

//importando comandos para rodar aplicação
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * /@RestController: Annotation (Anotação), que indica que a Classe é uma RestController,
 * ou seja, é responsável por responder às requisições http enviadas para um endpoint
 * (endereço) definido na anotação @RequestMapping
 * 
 * @RequestMapping("/postagens"): Annotation (Anotação), que indica o endpoint (endereço) 
 * que a controladora responderá as requisições 
 * 
 */

@RestController
@RequestMapping("/objetivos")
public class ObjetivosSemana {
	
	/**
	 * Exibir a mensagem
	 *  
	 * /@GetMapping: Annotation (Anotação), que indica que o método abaixo responderá todaas as 
	 * requisições do tipo GET que forem enviadas no endpoint /hello
	 * 
	 * O Método hello() será do tipo String porque ele retornará um String (Hello Turma 25!)
	 * 
	 * return "Hello Turma 25!";: Retorna a mensagem
	 *
	 */
	
	@GetMapping
	public String goals() {
		return "Os meus objetivos de aprendizagem para essa semana foram: "
				+ "\n\n- Manipulação de tabelas em bancos de dados\n- Familiarização com o ambiente Spring Tool"
				+ "\n- Entender e rodar minhas primeiras aplicações em Spring";
	}

}
