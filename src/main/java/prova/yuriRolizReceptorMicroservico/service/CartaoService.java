package prova.yuriRolizReceptorMicroservico.service;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import prova.yuriRolizReceptorMicroservico.dto.CartaoDTO;
import prova.yuriRolizReceptorMicroservico.entities.Cartao;
import prova.yuriRolizReceptorMicroservico.repositories.CartaoRepository;
import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class CartaoService {

    private CartaoRepository cartaoRepository;
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @RabbitListener(queues = "queue-a")
    private void subscribe(CartaoDTO cartao){
        Cartao novo_cartao = new Cartao(cartao.getId(), cartao.getCpf(), cartao.getSaldo());

        cartaoRepository.save(novo_cartao);
    }


}
