![GitHub](https://img.shields.io/github/license/douglaslimaluz/desafio-sistema-de-gerenciamento-escolar?logo=MIT)

# Sistema de Gerenciamento Escolar

## Sobre o Projeto

A API permite gerenciamento de provas, dando a possibilidade de cadastro de provas dos alunos e gabaritos.


Contém métodos que calculam dinamicamente as médias dos alunos para cada prova e a média final, e, utilizando desses cálculos  sobre todas as provas, para saber quais são os alunos aprovados. 


Além do CRUD padrão, contém também uma listagem dinâmica de alunos aprovados, tendo como parâmetro a média final.
  
 
Com esse projeto eu pude desenvolver mais sobre:

- Estrutura em camadas;
- Conceito de API-Rest;
- Handler de erros;
- Crud;
 
 # Documentação
 
 ## CRUD Aluno
 
 - GET //Lista todos os alunos do banco de dados.
 
 - POST //Cadastra um aluno no banco de dados.
 
     {
         "nome": "Douglas",
         "matricula": "1420"
    } 
 
 ## CRUD Gabarito 
 
 - GET //lista todo o gabarito do banco de dados.
 
 - POST //cadastra um gabarito do banco de dados.

 
     {
        "titulo": "Matematica",
        "gabarito": [1, 1, 1, 1, 1, 1, 1, 1, 1, 1]
    }
 
 
 ## CRUD de Respostas do Aluno
 
 - GET //lista todas as respostas dos alunos.
 
 - GET //lista nota final de um aluno especifico.
 
 - GET //lista todos alunos aprovados.
          
  - POST //cadastra resposta do aluno no banco de dados.
  
  
      {
        "idAluno": "2",
        "idProvaProfessor": "2",
        "respostas": [1, 1, 1, 1, 1, 1, 1, 0, 0, 0],
        "pesosRespostas": [1, 1, 1, 1, 1, 1, 2, 2, 2, 2]
     }
  
          
## Tecnologias Utilizadas

- Java
- Spring Boot
- JPA / Hibernate
- Maven
- Git
- Postman
- MySQL

## Como executar o projeto

```bash
# clonar repositório
git clone https://github.com/douglaslimaluz/desafio-sistema-de-gerenciamento-escolar.git

# entrar na pasta do projeto
cd ```nome do projeto```

# executar o projeto
mvn spring-boot:run
```

# Autoria

```Linked-In:``` [Douglas Lima Da Luz](www.linkedin.com/in/douglas-lima-da-luz-82895a19b)
