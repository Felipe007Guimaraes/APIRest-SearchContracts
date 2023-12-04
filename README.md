# APIRest SearchContracts

## Description
### API com objetivo de busca de dados de contratos em uma rota do Banco central e trazer as informações tratadas

## Tools
* Java
* Spring Boot
* Insomnia



## Funções
* Salvar contratos no banco de dados
* Listar contratos salvos no banco de dados
  * Retorna lista de contratos ordenados por ID
* Buscar contrato por ID
  * Recebe um ID como parâmetro para retornar os dados do contrato solicitado
* Retornar a soma dos contratos por ano
  * Recebe um ano como parâmetro e retorna a soma de contratos para aquele ano
* Atualizar contratos no banco de dados
  * Recebe um ID como parâmetro e atualiza os dados do contrato
* remover contrato do banco de dados
  * Recebe um ID como parâmetro e deleta os dados do contrato


|ROTA|
|----------------------------------------------------------------------------------------------------------------------|
|https://olinda.bcb.gov.br/olinda/servico/SICOR/versao/v2/odata/CusteioMunicipioProduto?%24format=json&$top=1000       |

<img width="712" alt="image" src="https://github.com/Felipe007Guimaraes/APIRest-SearchContracts/assets/90731014/a12f19d6-2643-469f-92da-2101e508b2a5">
