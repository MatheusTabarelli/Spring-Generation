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

//solicitando comandos para pacote da aplicação
@RestController
@RequestMapping("/habilidades")
public class HabilidadesSemana {
	
	//criando string para printar texto 
	@GetMapping
	public String habil() {
		return "Para a realização desta atividade, foram utilizadas as seguintes mentalidades e habilidades: "
				+ "\n\n- Persistência\n- Atenção aos detalhes\n- Mentalidade de crescimento";
	}

}
