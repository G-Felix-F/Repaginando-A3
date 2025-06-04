package br.com.a3.repaginando.dto;

import java.util.List;

public class LivroDTO {

	// ATRIBUTOS
	private Long id;
    private String titulo;
    private String categoria;
    private String isbn;
    private Integer anoPublicacao;
    private List<AutorDTO> autores;
    private EditoraDTO editora;
    
    // CONSTRUTORES
    public LivroDTO(Long id, String titulo, String categoria, String isbn, Integer anoPublicacao, List<AutorDTO> autores, EditoraDTO editora) {
        this.id = id;
        this.titulo = titulo;
        this.categoria = categoria;
        this.isbn = isbn;
        this.anoPublicacao = anoPublicacao;
        this.autores = autores;
        this.editora = editora;
    }

    // GETTERS E SETTERS
	public Long getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getCategoria() {
		return categoria;
	}

	public String getIsbn() {
		return isbn;
	}

	public Integer getAnoPublicacao() {
		return anoPublicacao;
	}

	public List<AutorDTO> getAutores() {
		return autores;
	}

	public EditoraDTO getEditora() {
		return editora;
	}
}
