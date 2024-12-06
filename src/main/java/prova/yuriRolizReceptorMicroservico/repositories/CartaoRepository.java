package prova.yuriRolizReceptorMicroservico.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import prova.yuriRolizReceptorMicroservico.entities.Cartao;

public interface CartaoRepository extends JpaRepository<Cartao, Long> {
}
