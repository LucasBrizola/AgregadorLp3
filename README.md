# AgregadorLp3

Trabalho sobre Agregadores para disciplina LP3.
O projeto busca jsons em urls específicos, parseia-os como POJOs e os retransmite como um json único.

English version:

Aggregator API for LP3 class.
the project gets jsons from specified url's, parse them as POJO's and retransmit as a unique JSON.

# Definição do projeto
Linguagem de Programação III–Turma TI13
Prof. Anderson Konzen
Trabalho 2
Este trabalho consistirá na criação de um agregador, ou seja, iremos criar uma API que irá agregar dados de outras fontes. Um caso bastante comum na indústria é a necessidade de um cliente consultar dados que estão espalhados em diversas fontes. Para facilitar a catpura destes dados utiliza-se agregadores, que são um mecanismo intermediário – entre o cliente e as fontes de dados –e que são responsáveis por consultar as diversas fontes, agregar os dados, e retornar o dado já processado para o cliente.

Para isso, iremos criar uma API REST com um único endpoint, e este endpoint deve retornar um dado estruturado no formato JSON que é a agregação dos dados das diversas fontes

Requisitos
Endpoint
A sua API REST deve fornecer um endpoint chamado /info, o qual deverá retornar o dado agregado no formato JSON abaixo: {“tempo”: {// ...},“zen”: {// ...},“secreto”: {//...}} O conteúdo de cada fielddeste JSON deve ser populado pelas fontes abaixo descritas.

Fontes
Iremos usar três diferentes fontes de dados:

1)	https://advisor.climatempo.com.br
Este serviçoexpõe uma API para consulta de dados de meteorologia de uma determinada cidade ou região. Para utilizar este serviço, será necessário criar o seu token de acesso. O endpoint específico que iremos usar é o que retorna dados meteorológicos do momento da consulta. A documentação deste endpoint está em: http://apiadvisor.climatempo.com.br/doc/index.html#api-Weather-CurrentWeatherByCity

2)	https://api.github.com/zen
Este endpoint retorna uma frase diferente a cada consulta.

3) DESAFIO:
https://lp3-secret.herokuapp.com/ Este endpoint retornará um dado secreto para cada estudante, porém ele é protegido por umusuário esenha (que será fornecida em separado). O mecanismo de autenticação que deve ser usado é o Basic Authorization, ou seja, na chamada POST deve ser enviado o header “Authorization: Basic ”, onde “” é a informação de usuário e senha embaralhados usando base64. O retorno desta API é um código 401 quando o usuário/senha estiver incorreto, ou umcódigo 200 com umJ SON como abaixo: {usuario: "seu_usuario",dado_secreto: "bla bla bla"} Observação: a string a ser usada para codificar em base64 é “usuario:senha”.Observação 2: cada aluno terá um retorno diferente da API. O JSON exemplo acima não será o mesmo que a API irá retornar para você. Assim, cada um terá que modelar a sua classe correspondente ao retorno da API
