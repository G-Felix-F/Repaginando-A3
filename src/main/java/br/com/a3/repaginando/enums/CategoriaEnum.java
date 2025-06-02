package br.com.a3.repaginando.enums;

public enum CategoriaEnum {
    FICCAO("Ficção Científica"),
    ROMANCE("Romance"),
    SUSPENSE("Suspense"),
    TERROR("Terror"),
    FANTASIA("Fantasia"),
    BIOGRAFIA("Biografia"),
    HISTORIA("História"),
    CIENCIA("Ciência"),
    AUTOAJUDA("Auto-Ajuda"),
    MANGA("Mangá");
	
	private final String categoriaNome;

	CategoriaEnum(String categoriaNome) {
		this.categoriaNome = categoriaNome;
	};
	
	public String getCategoriaNome() {
		return this.categoriaNome;
	}
}
