package br.com.aula4.tm.ecommerce.model.converter;

import br.com.aula4.tm.ecommerce.dto.PedidoDTO;
import br.com.aula4.tm.ecommerce.form.PedidoForm;
import br.com.aula4.tm.ecommerce.form.ProdutoForm;
import br.com.aula4.tm.ecommerce.model.entity.Pedido;
import br.com.aula4.tm.ecommerce.utils.Id;

import java.util.ArrayList;
import java.util.List;

public class PedidoConverter {
    public static Pedido pedidoFormToEntity(PedidoForm pedidoForm) {
        return new Pedido(
                Id.generateIdPedido(),
                ProdutoConverter.produtoFormToEntity(pedidoForm.getProdutos()),
                total(pedidoForm.getProdutos())
        );
    }

    public static List<Pedido> pedidoFormToEntity(List<PedidoForm> pedidoForms) {
        List<Pedido> pedidos = new ArrayList<>();

        for (PedidoForm pedidoForm : pedidoForms) {
            pedidos.add(pedidoFormToEntity(pedidoForm));
        }

        return pedidos;
    }

    public static PedidoDTO pedidoEntityToDTO(Pedido pedido) {
        return new PedidoDTO(
                ProdutoConverter.produtoEntityToDTO(pedido.getProdutos()),
                pedido.getTotal()
        );
    }

    public static List<PedidoDTO> pedidoEntityToDTO(List<Pedido> pedidos) {
        List<PedidoDTO> pedidoDTOS = new ArrayList<>();

        for (Pedido pedido : pedidos) {
            pedidoDTOS.add(pedidoEntityToDTO(pedido));
        }

        return pedidoDTOS;
    }

    private static double total(List<ProdutoForm> produtoForms) {
        double value = 0.0;

        for (ProdutoForm produtoForm : produtoForms) {
            value += produtoForm.getPreco() * produtoForm.getQuantidade();
        }

        return value;
    }
}
