# API de Controle de Produtos

Este repositório contém a implementação de uma API para o controle de produtos, desenvolvida em Java com o framework Spring Boot.

## Endpoints Disponíveis

- **Cadastrar Produto**
  - Método: POST
  - URL: `/cadastrar`
  - Descrição: Adiciona um novo produto ao sistema.
  - Parâmetros de Requisição: Objeto ProdutoModelo no formato JSON.

- **Alterar Produto**
  - Método: PUT
  - URL: `/alterar`
  - Descrição: Atualiza as informações de um produto existente.
  - Parâmetros de Requisição: Objeto ProdutoModelo no formato JSON.

- **Remover Produto**
  - Método: DELETE
  - URL: `/remover/{codigo}`
  - Descrição: Remove um produto com base no código fornecido.
  - Parâmetros de Requisição: Código do produto a ser removido.

- **Listar Produtos**
  - Método: GET
  - URL: `/listar`
  - Descrição: Retorna a lista de todos os produtos cadastrados.

- **Rota Principal**
  - Método: GET
  - URL: `/`
  - Descrição: Rota principal para verificar se a API está funcionando.

## Configuração de CORS

Para permitir requisições de qualquer origem, a API está configurada com suporte a Cross-Origin Resource Sharing (CORS).

## Uso da API

Certifique-se de ter o ambiente configurado adequadamente antes de usar a API. Você pode utilizar as operações CRUD para interagir com os produtos.
