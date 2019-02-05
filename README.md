# spring-activemq
Spring Boot - ActiveMQ

Instruções:

1 - baixar e iniciar o ActiveMQ
http://activemq.apache.org/getting-started.html#GettingStarted-OnWindows:
activemq start
http://localhost:8161 - login e user: admin

2 - executar a classe main da aplicação

3 - executar o serviço/resource REST em ProducerResource.java
http://localhost:8081/rest/producers/um/{mensagem} (GET)
http://localhost:8081/rest/producers/dois/{mensagem} (GET)
http://localhost:8081/rest/producers/tres (POST) 
Body: 
{
"nome": "",
"salario": 6800,
"valores": [100, 200, 900],
"listaTransacoes": [
	{"tipo": "entrada", "valor": 400},
	{"tipo": "saida", "valor": 80}
]
} 
http://localhost:8081/rest/producers/quatro/{mensagem} (POST)
Body: 
{
"nome": "",
"salario": 6800,
"valores": [100, 200, 900],
"listaTransacoes": [
	{"tipo": "entrada", "valor": 400},
	{"tipo": "saida", "valor": 80}
]
} 