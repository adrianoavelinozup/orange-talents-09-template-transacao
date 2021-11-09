# orange-talents-09-template-transacao

```bash
# acessa kafka no docker
docker-compose exec kafka bash

# cria um tópico
kafka-topics --create --topic foo --partitions 1 --replication-factor 1 --if-not-exists --zookeeper zookeeper:2181

# lista os tópicos 
kafka-topics --bootstrap-server localhost:9092 --describe

# consumir as mensagens
kafka-console-consumer --bootstrap-server localhost:9092 --topic transacoes --from-beginning

# lista os grupos criados
kafka-consumer-groups  --bootstrap-server localhost:9092 --list

# descreve as informações de um grupo
kafka-consumer-groups --group sistema-transacao --bootstrap-server localhost:9092 --describe
```

# Por favor faça um Fork desse projeto!

## Está em dúvida de como fazer um Fork? Não tem problema! [Aqui tem uma explicação do que entendemos que você deve considerar!](https://docs.github.com/en/github/getting-started-with-github/fork-a-repo)