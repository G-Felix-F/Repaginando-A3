package br.com.a3.repaginando.entity;

import java.util.List;

import br.com.a3.repaginando.enums.CategoriaLivroEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Table(name = "livro")
@Entity
public class LivroEntity {

	// CONSTRUTORES
	public LivroEntity() {
	}
	
	public LivroEntity(String titulo, String categoria, String isbn, Integer anoPublicacao) {
		this.titulo = titulo;
	    this.categoria = CategoriaLivroEnum.valueOf(categoria);
	    this.isbn = isbn;
	    this.anoPublicacao = anoPublicacao;
	}
	
	// MÉTODOS
	
	// ATRIBUTOS
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String titulo;
	
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private CategoriaLivroEnum categoria;
	
	@Column(unique = true)
	private String isbn;
	
	@Column(nullable = false)
	private Integer anoPublicacao;
	
	@ManyToMany
	@JoinTable(
		name = "livro_autor",
		joinColumns = @JoinColumn(name = "livro_id"),
		inverseJoinColumns = @JoinColumn(name = "autor_id")
	)
	private List<AutorEntity> autores;
	
	@ManyToOne
	@JoinColumn(name = "editora_id")
	private EditoraEntity editora;

	// GETTERS E SETTERS	
	public Long getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public CategoriaLivroEnum getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaLivroEnum categoria) {
		this.categoria = categoria;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Integer getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(Integer anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public List<AutorEntity> getAutores() {
		return autores;
	}

	public EditoraEntity getEditora() {
		return editora;
	}

	public void setEditora(EditoraEntity editora) {
		this.editora = editora;
	}
}
