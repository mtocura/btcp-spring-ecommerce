package br.com.aula4.tm.ecommerce.dto;

public class CategoriaDTO {
    private String nome;

    public CategoriaDTO() {
    }

    public CategoriaDTO(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
