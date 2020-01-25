package modelos;

public abstract class Conta {

    private String titular;
    private Integer agencia;
    private Integer conta;
    protected Double saldo = 0.0;

    public Conta(String titular, Integer agencia, Integer conta, Double saldo) {
        this.titular = titular;
        this.agencia = agencia;
        this.conta = conta;
        depositar(saldo);
    }

    public void depositar(Double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    abstract void sacar(Double valor);

    public void transferir(Double valor, Conta contaDestino) {
        if (valor > 0 && saldo > valor) {
            this.sacar(valor);
            contaDestino.depositar(valor);
        }
    }

    @Override
    public String toString() {
        return "Conta{" +
                "titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
