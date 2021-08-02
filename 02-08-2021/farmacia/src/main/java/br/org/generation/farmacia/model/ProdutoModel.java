package br.org.generation.farmacia.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//definindo tabela a ser armazenada no banco de dados
@Entity
@Table(name = "tb_produtos")

public class ProdutoModel {

	//criando atributo ID
	@Id
	//definindo o atributo ID como auto increment
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	//criando atributo nome, não nulo
	@NotNull(message = "O atributo nome precisa ser preenchido!")
	//definindo tamanho mininmo e maximo do atributo nome
	@Size(min = 4, max = 25, message = "O atributo descrição deve ter entre 4 e 25 caracteres!")
	private String nome;

	//criando atributo descricao, não nulo
	@NotNull(message = "O atributo descrição precisa ser preenchido!")
	//definindo tamanho mininmo e maximo do atributo descrição
	@Size(min = 4, max = 200, message = "O atributo descrição deve ter entre 4 e 200 caracteres!")
	private String descricao;

	//criando atributo preço, não nulo
	@NotNull(message = "O atributo preço precisa ser preenchido!")
	//definindo atributo preco para valores positivos
	@Positive(message = "O atributo preço precisa ser maior do que zero!")
	private BigDecimal preco;
	
	//criando relação da tabela produtos com a tabela categoria, através do atributo categoria
	@ManyToOne
	//utilizando annotation para evitar loopings na saída do programa
	@JsonIgnoreProperties("produto")
	private CategoriaModel categoria;

	//gerando getters e setters
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public CategoriaModel getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaModel categoria) {
		this.categoria = categoria;
	}

	
}