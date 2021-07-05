package br.com.aula4.tm.ecommerce.form;

import br.com.aula4.tm.ecommerce.model.entity.ClienteEnum;

import java.util.List;

public class ClienteForm {
    private ClienteEnum tipo;
    private List<PedidoForm> pedidos;

    public ClienteForm() {
    }

    public ClienteForm(ClienteEnum tipo, List<PedidoForm> pedidos) {
        this.tipo = tipo;
        this.pedidos = pedidos;
    }

    public ClienteEnum getTipo() {
        return tipo;
    }

    public List<PedidoForm> getPedidos() {
        return pedidos;
    }
}
