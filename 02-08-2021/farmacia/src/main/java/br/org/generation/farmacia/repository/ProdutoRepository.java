package br.org.generation.farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.org.generation.farmacia.model.ProdutoModel;

@Repository
//criando comunicação entre o banco de dados e a aplicação
public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long> {
	
	public List<ProdutoModel> findAllByNomeContainingIgnoreCase(String nome);

}