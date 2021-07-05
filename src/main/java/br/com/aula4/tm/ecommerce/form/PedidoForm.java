package br.com.aula4.tm.ecommerce.form;

import java.util.List;

public class PedidoForm {
    private List<ProdutoForm> produtos;

    public PedidoForm() {
    }

    public PedidoForm(List<ProdutoForm> produtos) {
        this.produtos = produtos;
    }

    public List<ProdutoForm> getProdutos() {
        return produtos;
    }
}
