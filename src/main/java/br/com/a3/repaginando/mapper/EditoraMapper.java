package br.com.a3.repaginando.mapper;

import java.util.List;

import br.com.a3.repaginando.dto.AutorDTO;
import br.com.a3.repaginando.dto.EditoraDTO;
import br.com.a3.repaginando.dto.LivroDTO;
import br.com.a3.repaginando.entity.EditoraEntity;
	
public class EditoraMapper {

//	public static EditoraDTO toDTO(EditoraEntity entity) {
//		List<LivroDTO> livros = entity.getLivros().stream()
//				.map(livro -> new LivroDTO(livro.getId(), livro.getTitulo(), livro.getCategoria(), 
//						livro.getIsbn(), livro.getAnoPublicacao(), livro.getAutores(), livro.getEditora()))
//				.toList();
//	
//		return new EditoraDTO(
//				entity.getId(),
//				entity.getNome(),
//				entity.getCnpj(),
//				entity.getCep(),
//				livros
//				);
//	}

	public static EditoraEntity toEntity(EditoraDTO dto) {
		return new EditoraEntity(dto.getNome(), dto.getCnpj(), dto.getCep());
	}
}
