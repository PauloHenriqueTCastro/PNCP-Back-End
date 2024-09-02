# PNCP-Back-End
Aplicação responsável pelo back-end de um projeto que estou desenvolvendo, onde utilizo a API do Portal Nacional de Contratações Públicas para obter informações sobre contratos de um determinado órgão público.


### Bibliotecas externas untilizadas:
- Spring
- Maven
- Hibernate (JPA)
- PostgreSQL
- Lombok

## Funções:

- Verificação de contratos armazenados.
- Cadastro de contratos.

## Como utilizar:
Para a correta utilização, é necessário configurar o arquivo application.properties com os campos que faltam. São eles:

spring.datasource.url=jdbc:postgresql: *Rota de acesso ao banco de dados*\
spring.datasource.username= *Username cadastrado no seu banco de dados*\
spring.datasource.password= *Senha cadastrada no seu banco de dados*

## Rota "/api":
Get: Recupera todos os contratos que estão cadastrados na API. Não precisa de body ou parâmetro para ser acessada.

Post: Faz a criação de um novo contrato dentro do banco de dados vinculado à aplicação. Precisa de um body:\
Exemplo de body:\
[\
	{\
 	"cnpjPublicOrganization": "STRING",\
	"startDate": "STRING",\
	"endDate": "STRING",\
	"supplier": "STRING",\
	"object": STRING",\
	"initialValue": FLOAT\
 }\
]
