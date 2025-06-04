package br.com.a3.repaginando.dto;

import java.util.List;

public class EditoraDTO {
	
	// ATRIBUTOS
	private Long id;
	private String nome;
	private String cnpj;
	private String cep;
	private List<LivroDTO> livros;

	// CONSTRUTORES
	public EditoraDTO(Long id, String nome, String cnpj, String cep, List<LivroDTO> livros) {
		this.id = id;
		this.nome = nome;
		this.cnpj = cnpj;
		this.cep = cep;
		this.livros = livros;
	}
	
	// GETTERS E SETTERS
	public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getCep() {
        return cep;
    }
    
    public List<LivroDTO> getLivros() {
    	return livros;
    }
}
