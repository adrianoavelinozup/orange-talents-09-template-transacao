package br.com.zupacademy.adriano.transacao.transacao;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface TransacaoRespository extends PagingAndSortingRepository<Transacao, String> {
}
