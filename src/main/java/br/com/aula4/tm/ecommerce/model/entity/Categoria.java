package br.com.aula4.tm.ecommerce.model.entity;

public class Categoria {
    private String nome;

    public Categoria() {
    }

    public Categoria(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
