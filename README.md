# Aula 4 - Tratamento de Erros - TM

## Prática Complementar - E-commerce

Este repositório contém a solução para a prática complementar da aula 4 TM.

- GET ``` /aula4/tm/clientes ```
    - retorna uma lista com todos os clientes cadastrados no sistema
    - body response:
    ````
    [
        {
            "tipo": "ADMIN",
            "pedidos": [
                {
                    "produtos": [
                        {
                            "nome": "PS5",
                            "categorias": [
                                {
                                    "nome": "Video game"
                                }
                            ],
                            "preco": 4999.99,
                            "quantidade": 1
                        },
                        {
                            "nome": "Televisão 4K UHD 62' ",
                            "categorias": [
                                {
                                    "nome": "Eletrodoméstico"
                                }
                            ],
                            "preco": 4999.99,
                            "quantidade": 1
                        }
                    ],
                    "total": 9999.98
                }
            ]
        },
    ]
    ````
  
- POST ``` /aula4/tm/clientes ```
    - adiciona um cliente no sistema
    - body request:
    ````
    {
        "tipo": "ADMIN",
        "pedidos": [
            {
                "produtos": [
                    {
                        "nome": "PS5",
                        "categorias": [
                            {
                                "nome": "Video game"
                            }
                        ],
                        "preco": 4999.99,
                        "quantidade": 1
                    },
                    {
                        "nome": "Televisão 4K UHD 62' ",
                        "categorias": [
                            {
                                "nome": "Eletrodoméstico"
                            }
                        ],
                        "preco": 4999.99,
                        "quantidade": 1
                    }
                ],
                "total": 9999.98
            }
        ]
    }
    ````
  
- GET ``` /aula4/tm/produtos ```
    - retorna todos os produtos cadastrados no sistema
    - body response:
    ````
    [
        {
            "nome": "Teclado",
            "categorias": [
                {
                    "nome": "Periféricos"
                }
            ],
            "preco": 159.9,
            "quantidade": 1
        }
    ]
    ````
  
- POST ``` /aula4/tm/clientes/{idCliente}/produtos ```
    - cadastra um produto no sistema caso o id do cliente corresponda a um usuário do tipo ADMIN
    - body request:
    ```
    {
        "nome": "Teclado",
        "categorias": [
            {
                "nome": "Periféricos"
            }
        ],
        "preco": 159.9,
        "quantidade": 1
    }
    ```
    - body response (caso não seja um admin):
    ```
    {
        "mensagem": "Você não tem permissão para adicionar um produto na base de dados!"
    }
    ```
  
- PUT ``` /aula4/tm/clientes/{idCliente}/produtos/{id} ```
    - atualiza um produto no sistema caso o id do cliente corresponda a um usuário ADMIN
    - body request:
  - body request:
    ```
    {
        "nome": "Teclado",
        "categorias": [
            {
                "nome": "Periféricos"
            }
        ],
        "preco": 159.9,
        "quantidade": 1
    }
    ```
    - body response (caso não seja um admin):
    ```
    {
        "mensagem": "Você não tem permissão para adicionar um produto na base de dados!"
    }
    ```

- DELETE ``` /aula4/tm/clientes/{idCliente}/produtos ```
    - remove um produto do sistema caso o id do cliente corresponda a um usuário ADMIN
  - body response (caso não seja um admin):
    ```
    {
        "mensagem": "Você não tem permissão para adicionar um produto na base de dados!"
    }
    ```