package prova.yuriRolizReceptorMicroservico;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableRabbit
@SpringBootApplication
public class YuriRolizReceptorMicroservicoApplication {

	public static void main(String[] args) {
		SpringApplication.run(YuriRolizReceptorMicroservicoApplication.class, args);
	}

}
