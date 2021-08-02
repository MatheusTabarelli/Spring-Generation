package br.org.generation.farmacia.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//definindo tabela a ser armazenada no banco de dados
@Entity
@Table(name = "tb_categorias")

public class CategoriaModel {

	//criando atributo ID
	@Id
	//definindo o atributo ID como auto increment
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	//criando atributo tipo, não nulo
	@NotNull(message = "O atributo tipo precisa ser preenchido!")
	private String tipo;
	
	//criando relação da tabela categoria com a tabela produtos, através do atributo produto
	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
	//utilizando annotation para evitar loopings na saída do programa
	@JsonIgnoreProperties("categoria")
	private List<ProdutoModel> Produto;

	//gerando getters e setters
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public List<ProdutoModel> getProduto() {
		return Produto;
	}

	public void setProduto(List<ProdutoModel> produto) {
		Produto = produto;
	}

	
}
