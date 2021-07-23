/**
 * 
 */
/* A aplicação deverá conter um end-point que retorna
uma string com as habilidades e mentalidades que você
utilizou para realizar essa atividade. */

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
@RequestMapping("/habilidades")
public class HabilidadesSemana {
	
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
	public String habil() {
		return "Para a realização desta atividade, foram utilizadas as seguintes mentalidades e habilidades: "
				+ "\n\n- Persistência\n- Atenção aos detalhes\n- Mentalidade de crescimento";
	}

}
