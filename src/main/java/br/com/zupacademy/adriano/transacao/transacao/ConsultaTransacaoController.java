package br.com.zupacademy.adriano.transacao.transacao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/transacoes")
public class ConsultaTransacaoController {

    private final TransacaoRespository transacaoRespository;

    public ConsultaTransacaoController(TransacaoRespository transacaoRespository) {
        this.transacaoRespository = transacaoRespository;
    }

    @GetMapping
    public ResponseEntity<Page<TransacaoResponse>> consultar(Pageable pageable) {
        Page<Transacao> transacoes = transacaoRespository.findAll(pageable);
        Page<TransacaoResponse> transacoesResponse = transacoes.map(TransacaoResponse::new);
        return ResponseEntity.ok(transacoesResponse);
    }
}
