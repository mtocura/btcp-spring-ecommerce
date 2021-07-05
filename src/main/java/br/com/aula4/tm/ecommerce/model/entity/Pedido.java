package br.com.aula4.tm.ecommerce.model.entity;

import java.util.List;

public class Pedido {
    private Long id;
    private List<Produto> produtos;
    private Double total;

    public Pedido() {
    }

    public Pedido(Long id, List<Produto> produtos, Double total) {
        this.id = id;
        this.produtos = produtos;
        this.total = total;
    }

    public Long getId() {
        return id;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public Double getTotal() {
        return total;
    }
}
