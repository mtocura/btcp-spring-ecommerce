package br.com.aula4.tm.ecommerce.model.entity;

import java.util.List;

public class Produto {
    private Long id;
    private String nome;
    private List<Categoria> categorias;
    private Double preco;
    private Integer quantidade;

    public Produto() {
    }

    public Produto(Long id, String nome, List<Categoria> categorias, Double preco, Integer quantidade) {
        this.id = id;
        this.nome = nome;
        this.categorias = categorias;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public Double getPreco() {
        return preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }
}
