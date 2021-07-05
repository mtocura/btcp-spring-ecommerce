package br.com.aula4.tm.ecommerce.dto;

import br.com.aula4.tm.ecommerce.model.entity.ClienteEnum;

import java.util.List;

public class ClienteDTO {
    private ClienteEnum tipo;
    private List<PedidoDTO> pedidos;

    public ClienteDTO() {
    }

    public ClienteDTO(ClienteEnum tipo, List<PedidoDTO> pedidos) {
        this.tipo = tipo;
        this.pedidos = pedidos;
    }

    public ClienteEnum getTipo() {
        return tipo;
    }

    public List<PedidoDTO> getPedidos() {
        return pedidos;
    }
}
