# Booklist
[![NPM](https://img.shields.io/npm/l/react)](LICENSE)

# Sobre o projeto

Booklist é uma aplicação web full stack desenvolvida para gerenciar listas de livros, permitindo funcionalidades como visualização, organização e reordenação dos livros por meio de "arrasta e solta". O projeto foi criado com o objetivo de praticar conceitos de backend com Java e Spring Boot.

## Funcionalidades

- Listagem de livros e listas de livros
- Visualização detalhada de cada livro
- Organização dos livros dentro das listas com atualização de posição

## Modelo conceitual

O modelo de dados é composto pelas entidades principais:
- **Book**: representa um livro, com informações como título, autor, ano de publicação, descrições, imagem e gênero.
- **BookList**: representa uma lista de livros.
- **Belonging**: entidade de associação entre livros e listas, com controle da posição de cada livro na lista.

## Tecnologias utilizadas

### Back end
- Java 17
- Spring Boot
- Spring Data JPA / Hibernate
- Maven
- Banco de dados H2 (testes) e PostgreSQL (produção/desenvolvimento)


# Como executar o projeto

## Back end

Pré-requisitos: Java 17, Maven

```bash
# clonar repositório
git clone https://github.com/seu-usuario/booklist

# entrar na pasta do projeto
cd booklist

# executar o projeto
./mvnw spring-boot:run
