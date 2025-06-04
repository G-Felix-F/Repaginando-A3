package br.com.a3.repaginando.entity;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.validator.constraints.br.CNPJ;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Table(name = "editora")
@Entity
public class EditoraEntity {

	// CONSTRUTORES
	public EditoraEntity() {
	}
	
	public EditoraEntity(String nome, String cnpj, String cep) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.cep = cep;
	}
	
	// MÉTODOS
	public void adicionarLivro(LivroEntity livro) {
		if (!this.livros.contains(livro)) {
			this.livros.add(livro);
			livro.setEditora(this);			
		}
	}
	
	public void removerLivro(LivroEntity livro) {
		this.livros.remove(livro);
		livro.setEditora(null);
	}
	
	// ATRIBUTOS
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String nome;
	
    @Column(nullable = false, unique = true, length = 18)
    @CNPJ
    private String cnpj;

    @Column(nullable = false, length = 9)
    private String cep;
	
	@OneToMany(mappedBy = "editora")
	private List<LivroEntity> livros = new ArrayList<>();

	// GETTERS E SETTERS
	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
	
	public List<LivroEntity> getLivros() {
		return livros;
	}
}
