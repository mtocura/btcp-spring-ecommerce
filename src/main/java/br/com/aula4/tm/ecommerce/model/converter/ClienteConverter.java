package br.com.aula4.tm.ecommerce.model.converter;

import br.com.aula4.tm.ecommerce.dto.ClienteDTO;
import br.com.aula4.tm.ecommerce.form.ClienteForm;
import br.com.aula4.tm.ecommerce.model.entity.Cliente;
import br.com.aula4.tm.ecommerce.utils.Id;

import java.util.ArrayList;
import java.util.List;

public class ClienteConverter {
    public static Cliente clienteFormToEntity(ClienteForm clienteForm) {
        return new Cliente(
                Id.generateIdCliente(),
                clienteForm.getTipo(),
                PedidoConverter.pedidoFormToEntity(clienteForm.getPedidos())
        );
    }

    public static List<Cliente> clienteFormToEntity(List<ClienteForm> clienteForms) {
        List<Cliente> clientes = new ArrayList<>();

        for (ClienteForm clienteForm : clienteForms) {
            clientes.add(clienteFormToEntity(clienteForm));
        }

        return clientes;
    }

    public static ClienteDTO clienteEntityToDTO(Cliente cliente) {
        return new ClienteDTO(
                cliente.getTipo(),
                PedidoConverter.pedidoEntityToDTO(cliente.getPedidos())
        );
    }

    public static List<ClienteDTO> clienteEntityToDTO(List<Cliente> clientes) {
        List<ClienteDTO> clienteDTOS = new ArrayList<>();

        for (Cliente cliente : clientes) {
            clienteDTOS.add(clienteEntityToDTO(cliente));
        }

        return clienteDTOS;
    }
}
