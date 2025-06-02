package br.com.a3.repaginando.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String titulo;
	
	@Column(unique = true)
	private String isbn;
	
	@Column(nullable = false)
	private Integer anoPublicacao;
	
	@ManyToOne
	@JoinColumn(name = "categoria_id")
	private CategoriaEntity categoria;
	
	@ManyToMany
	@JoinTable(
		name = "livro_autor",
		joinColumns = @JoinColumn(name = "livro_id"),
		inverseJoinColumns = @JoinColumn(name = "autor_id")
	)
	private List<AutorEntity> autores;
}
