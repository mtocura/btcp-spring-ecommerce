package br.com.aula4.tm.ecommerce.model.service;

import br.com.aula4.tm.ecommerce.dto.ClienteDTO;
import br.com.aula4.tm.ecommerce.dto.ProdutoDTO;
import br.com.aula4.tm.ecommerce.exception.AccessException;
import br.com.aula4.tm.ecommerce.form.ClienteForm;
import br.com.aula4.tm.ecommerce.form.ProdutoForm;
import br.com.aula4.tm.ecommerce.model.converter.ClienteConverter;
import br.com.aula4.tm.ecommerce.model.converter.ProdutoConverter;
import br.com.aula4.tm.ecommerce.model.entity.Cliente;
import br.com.aula4.tm.ecommerce.model.entity.ClienteEnum;
import br.com.aula4.tm.ecommerce.model.entity.Produto;
import br.com.aula4.tm.ecommerce.model.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    private ClienteRepository clienteRepository;

    public ClienteService() {
    }

    @Autowired
    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<ClienteDTO> findAllClientes() {
        return ClienteConverter.clienteEntityToDTO(clienteRepository.getAllClientes());
    }

    public void addCliente(ClienteForm clienteForm) {
        clienteRepository.addCliente(ClienteConverter.clienteFormToEntity(clienteForm));
    }

    public List<ProdutoDTO> findAllProdutos() {
        return ProdutoConverter.produtoEntityToDTO(clienteRepository.getAllProdutos());
    }

    public Produto addProduto(long idCliente, ProdutoForm produtoForm){
        Optional<Cliente> clienteOptional = clienteRepository.getAllClientes().stream().filter(cliente -> cliente.getId() == idCliente).findAny();

        if(clienteOptional.isPresent() && clienteOptional.get().getTipo() == ClienteEnum.ADMIN) {
            return clienteRepository.addProduto(ProdutoConverter.produtoFormToEntity(produtoForm));
        } else {
            throw new AccessException("Você não tem permissão para adicionar um produto na base de dados!");
        }
    }

    public void updateProduto(long idCliente, long id, ProdutoForm produtoForm) {
        Optional<Cliente> clienteOptional = clienteRepository.getAllClientes().stream().filter(cliente -> cliente.getId() == idCliente).findAny();

        if(clienteOptional.isPresent() && clienteOptional.get().getTipo() == ClienteEnum.ADMIN) {
            clienteRepository.updateProduto(id, ProdutoConverter.produtoFormToEntity(produtoForm));
        } else {
            throw new AccessException("Você não tem permissão para adicionar um produto na base de dados!");
        }
    }

    public void deleteProduto(long idCliente, long id) {
        Optional<Cliente> clienteOptional = clienteRepository.getAllClientes().stream().filter(cliente -> cliente.getId() == idCliente).findAny();

        if(clienteOptional.isPresent() && clienteOptional.get().getTipo() == ClienteEnum.ADMIN) {
            clienteRepository.deleteProduto(id);
        } else {
            throw new AccessException("Você não tem permissão para adicionar um produto na base de dados!");
        }
    }
}
