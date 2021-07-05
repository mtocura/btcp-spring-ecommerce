package br.com.aula4.tm.ecommerce.model.repository;

import br.com.aula4.tm.ecommerce.model.entity.Cliente;
import br.com.aula4.tm.ecommerce.model.entity.Produto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ClienteRepository {
    List<Cliente> clientes = new ArrayList<>();
    List<Produto> produtos = new ArrayList<>();

    public List<Cliente> getAllClientes() {
        return clientes;
    }

    public void addCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void addProduto(Produto produto) {
        produtos.add(produto);
    }

    public List<Produto> getAllProdutos() {
        return produtos;
    }

    public void updateProduto(long id, Produto produto) {
        Optional<Produto> produtoOptional = produtos.stream().filter(p -> p.getId() == id).findFirst();

        if(produtoOptional.isPresent()) {
            produtos.remove(produtoOptional.get());
            produtos.add(produto);
        }
    }

    public void deleteProduto(long id) {
        Optional<Produto> produtoOptional = produtos.stream().filter(p -> p.getId() == id).findFirst();

        if(produtoOptional.isPresent()) {
            produtos.remove(produtoOptional.get());
        }
    }
}
