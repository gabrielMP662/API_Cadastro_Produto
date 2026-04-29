#  API de Cadastro de Produtos

API REST desenvolvida para gerenciar o cadastro de produtos, permitindo operações básicas como criação, listagem, atualização e remoção.

---

##  Tecnologias utilizadas

* Java
* Spring Boot
* Maven
* Banco de dados (ex: H2 / MySQL)
* Postman (para testes)

---

##  Funcionalidades

* ✅ Cadastrar produto
* 📄 Listar produtos
* ✏️ Atualizar produto
* ❌ Deletar produto

---

##  Conceitos aplicados

Este projeto foi desenvolvido com foco em aprendizado de:

* API REST
* Arquitetura em camadas (Controller, Service, Repository)
* CRUD (Create, Read, Update, Delete)
* Integração com banco de dados
* Boas práticas com Spring Boot

---

##  Endpoints da API

###  Criar produto

```
POST /produtos
```

###  Listar produtos

```
GET /produtos
```

###  Buscar produto por ID

```
GET /produtos/{id}
```

###  Atualizar produto

```
PUT /produtos/{id}
```

###  Deletar produto

```
DELETE /produtos/{id}
```

---

##  Como testar

Você pode testar a API utilizando:

* Postman
* Insomnia

Exemplo de JSON:

```json
{
  "nome": "Produto Exemplo",
  "descricao":"Produto faz isso"
  "preco": 99.90
  "qtd": Quantidade
  ""
}
```

---

## ⚙️ Como rodar o projeto

1. Clone o repositório:

```
git clone https://github.com/gabrielMP662/API_Cadastro_Produto.git
```

2. Abra o projeto em uma IDE (IntelliJ ou Eclipse)

3. Execute a aplicação

4. A API estará disponível em:

```
http://localhost:8080
```

---

## 📈 Melhorias futuras

* 🔐 Implementar autenticação (JWT)
* 📊 Criar paginação
* 🔎 Filtros de busca
* 🌐 Deploy da API
* 📦 Documentação com Swagger


---

## 💡 Observação

Este projeto faz parte do meu processo de aprendizado em desenvolvimento Back-End e construção de APIs REST com Java e Spring Boot.
