package br.com.aula4.tm.ecommerce.model.converter;

import br.com.aula4.tm.ecommerce.dto.ProdutoDTO;
import br.com.aula4.tm.ecommerce.form.ProdutoForm;
import br.com.aula4.tm.ecommerce.model.entity.Produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutoConverter {
    public static Produto produtoFormToEntity(ProdutoForm produtoForm) {
        return new Produto(
                produtoForm.getNome(),
                CategoriaConverter.categoriaFormToEntity(produtoForm.getCategorias()),
                produtoForm.getPreco(),
                produtoForm.getQuantidade()
        );
    }

    public static List<Produto> produtoFormToEntity(List<ProdutoForm> produtoForms) {
        List<Produto> produtos = new ArrayList<>();

        for (ProdutoForm produtoForm : produtoForms) {
            produtos.add(produtoFormToEntity(produtoForm));
        }

        return produtos;
    }

    public static ProdutoDTO produtoEntityToDTO(Produto produto) {
        return new ProdutoDTO(
                produto.getNome(),
                CategoriaConverter.categoriaEntityToDTO(produto.getCategorias()),
                produto.getPreco(),
                produto.getQuantidade()
        );
    }

    public static List<ProdutoDTO> produtoEntityToDTO(List<Produto> produtos) {
        List<ProdutoDTO> produtoDTOS = new ArrayList<>();

        for (Produto produto : produtos) {
            produtoDTOS.add(produtoEntityToDTO(produto));
        }

        return produtoDTOS;
    }
}
