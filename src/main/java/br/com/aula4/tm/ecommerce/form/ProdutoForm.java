package br.com.aula4.tm.ecommerce.form;

import br.com.aula4.tm.ecommerce.model.entity.Categoria;

import java.util.List;

public class ProdutoForm {
    private String nome;
    private List<Categoria> categorias;
    private Double preco;
    private Integer quantidade;

    public ProdutoForm() {
    }

    public ProdutoForm(String nome, List<Categoria> categorias, Double preco, Integer quantidade) {
        this.nome = nome;
        this.categorias = categorias;
        this.preco = preco;
        this.quantidade = quantidade;
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
