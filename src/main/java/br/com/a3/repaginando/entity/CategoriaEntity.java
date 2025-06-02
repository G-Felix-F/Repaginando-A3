package br.com.a3.repaginando.entity;

import java.util.List;

import br.com.a3.repaginando.enums.CategoriaEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Table(name = "categoria")
@Entity
public class CategoriaEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private CategoriaEnum categoria;
	
	@OneToMany
	private List<LivroEntity> livros;
}
