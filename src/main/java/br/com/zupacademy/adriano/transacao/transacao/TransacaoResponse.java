package br.com.zupacademy.adriano.transacao.transacao;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TransacaoResponse {
    private String id;
    private BigDecimal valor;
    private Estabelecimento estabelecimento;
    private Cartao cartao;
    private LocalDateTime efetivadaEm;

    public TransacaoResponse() {
    }

    public TransacaoResponse(Transacao transacao) {
        this.id = transacao.getIdTransacao();
        this.valor = transacao.getValor();
        this.estabelecimento = transacao.getEstabelecimento();
        this.cartao = transacao.getCartao();
        this.efetivadaEm = transacao.getEfetivadaEm();
    }

    public String getId() {
        return id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public Estabelecimento getEstabelecimento() {
        return estabelecimento;
    }

    public Cartao getCartao() {
        return cartao;
    }

    public LocalDateTime getEfetivadaEm() {
        return efetivadaEm;
    }

    public Transacao toModel() {
      return new Transacao(this.id, this.valor, this.estabelecimento, this.cartao, this.efetivadaEm);
    }
}
