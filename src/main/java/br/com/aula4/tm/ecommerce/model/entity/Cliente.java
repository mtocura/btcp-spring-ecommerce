package br.com.aula4.tm.ecommerce.model.entity;

import java.util.List;

public class Cliente {
    private Long id;
    private ClienteEnum tipo;
    private List<Pedido> pedidos;

    public Cliente() {
    }

    public Cliente(Long id, ClienteEnum tipo, List<Pedido> pedidos) {
        this.id = id;
        this.tipo = tipo;
        this.pedidos = pedidos;
    }

    public Long getId() {
        return id;
    }

    public ClienteEnum getTipo() {
        return tipo;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }
}
