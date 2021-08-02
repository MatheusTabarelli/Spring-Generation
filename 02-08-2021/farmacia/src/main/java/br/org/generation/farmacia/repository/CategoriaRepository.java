package br.org.generation.farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.org.generation.farmacia.model.CategoriaModel;


@Repository
//criando interfaco para comunicação do banco de dados com a aplicação
public interface CategoriaRepository extends JpaRepository<CategoriaModel, Long> {
		
		public List<CategoriaModel> findAllByTipoContainingIgnoreCase(String tipo);


}
