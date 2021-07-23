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

//solicitando comandos para pacote da aplicação
@RestController
@RequestMapping("/objetivos")
public class ObjetivosSemana {
	
	//criando string para printar texto 
	@GetMapping
	public String goals() {
		return "Os meus objetivos de aprendizagem para essa semana foram: "
				+ "\n\n- Manipulação de tabelas em bancos de dados\n- Familiarização com o ambiente Spring Tool"
				+ "\n- Entender e rodar minhas primeiras aplicações em Spring";
	}

}
