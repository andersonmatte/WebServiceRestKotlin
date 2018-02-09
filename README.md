## Web Service Rest em Kotlin

Tecnologias e ferramentas utilizadas:  

Kotlin, Spring Tool Suite, Spring Boot, H2 Data Base, Postman. 

# Preparando o Ambiente:

Baixar o Spring Tool Suite  https://spring.io/tools

![alt text](/imagens/SprinToolSuite.png)

Baixar os fontes do projeto e importar para a IDE Spring Tool Suite, a estrutura do projeto ficará assim:

![alt text](/imagens/EstruturaProjeto.png)

# Configuração do Banco e Start do projeto:

Fazer o download do H2 :

http://www.h2database.com/html/main.html 

Após a configuração do banco H2, o arquivo aplication.properties devereá ser configurado com as credências de aceso ao banco de dados.

![alt text](/imagens/AplicationProperties.png)

Agora já será possível startar a aplicação Spring Boot!

![alt text](/imagens/SpringBoot.png)

## Acessando o banco de dados H2:

Acessar o banco http://localhost:8080/h2/ 

![alt text](/imagens/AcessoBancoH2.png)

 Após logado no banco de dados criar a tabela cliente via script Cliente.sql.

![alt text](/imagens/LogadoNoBanco.png)


## Utilizando o Web Service com Postman

Acessar o Postman e executar os Métodos de CRUD.

# Get

![alt text](/imagens/Get.png)

# Post

![alt text](/imagens/Post.png)

# Put

![alt text](/imagens/Put.png)

# Delete

![alt text](/imagens/Delete.png)
