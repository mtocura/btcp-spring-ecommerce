package br.com.aula4.tm.ecommerce.controller;

import br.com.aula4.tm.ecommerce.form.ClienteForm;
import br.com.aula4.tm.ecommerce.form.ProdutoForm;
import br.com.aula4.tm.ecommerce.model.entity.Cliente;
import br.com.aula4.tm.ecommerce.model.entity.Produto;
import br.com.aula4.tm.ecommerce.model.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/aula4/tm")
public class ClienteController {

    private ClienteService clienteService;

    public ClienteController() {
    }

    @Autowired
    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping("/clientes")
    public ResponseEntity<?> getAllClientes() {
        return ResponseEntity.ok(clienteService.findAllClientes());
    }

    @PostMapping("/clientes")
    public ResponseEntity<?> getAllClientes(@RequestBody ClienteForm clienteForm, UriComponentsBuilder uriBuilder) {
        Cliente cliente =clienteService.addCliente(clienteForm);
        URI uri = uriBuilder.path("/aula4/tm/clientes/{id}").buildAndExpand(cliente.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @GetMapping("/produtos")
    public ResponseEntity<?> getAllProdutos() {
        return ResponseEntity.ok(clienteService.findAllProdutos());
    }

    @PostMapping("/clientes/{idCliente}/produtos")
    public ResponseEntity<?> addProduto(@PathVariable long idCliente, @RequestBody ProdutoForm produtoForm, UriComponentsBuilder uriBuilder) {
        Produto produto = clienteService.addProduto(idCliente, produtoForm);

        URI uri = uriBuilder.path("aula4/tm/produtos/{id}").buildAndExpand(produto.getId()).toUri();

        return ResponseEntity.created(uri).build();
    }

    @PutMapping("/clientes/{idCliente}/produtos/{id}")
    public ResponseEntity<?> updateProduto(@PathVariable long idCliente, @PathVariable long id, @RequestBody ProdutoForm produtoForm) {
        clienteService.updateProduto(idCliente, id, produtoForm);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/clientes/{idCliente}/produtos/{id}")
    public ResponseEntity<?> deleteProduto(@PathVariable long idCliente, @PathVariable long id) {
        clienteService.deleteProduto(idCliente, id);
        return ResponseEntity.ok().build();
    }
}
