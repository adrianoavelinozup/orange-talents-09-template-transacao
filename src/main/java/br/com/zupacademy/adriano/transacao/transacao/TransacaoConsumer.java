package br.com.zupacademy.adriano.transacao.transacao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class TransacaoConsumer {
    final static Logger logger =LoggerFactory.getLogger(TransacaoConsumer.class);
    private final TransacaoRespository transacaoRespository;

    public TransacaoConsumer(TransacaoRespository transacaoRespository) {
        this.transacaoRespository = transacaoRespository;
    }

    @KafkaListener(topics = "${spring.kafka.topic.transactions}")
    public void ouvir(TransacaoResponse transacaoResponse) {
        Transacao transacao = transacaoResponse.toModel();
        transacaoRespository.save(transacao);
        logger.info("Transação {} consumida com sucesso!", transacaoResponse.getId());
    }
}

