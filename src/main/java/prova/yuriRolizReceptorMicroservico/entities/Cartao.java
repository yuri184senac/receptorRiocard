package prova.yuriRolizReceptorMicroservico.entities;

import jakarta.persistence.*;


@Entity
@Table(name="cartoes")
public class Cartao  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false)
    private Long id;

    @Column(name="cpf")
    private String cpf;

    @Column(name="saldo")
    private Long saldo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Long getSaldo() {
        return saldo;
    }

    public void setSaldo(Long saldo) {
        this.saldo = saldo;
    }

    public Cartao(Long id, String cpf, Long saldo) {
        this.id = id;
        this.cpf = cpf;
        this.saldo = saldo;
    }


}
