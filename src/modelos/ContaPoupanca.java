package modelos;

public class ContaPoupanca extends Conta {

    private final Double RENDIMENTO = 0.05;

    public ContaPoupanca(String titular, Integer agencia, Integer conta, Double saldo) {
        super(titular, agencia, conta, saldo);
    }

    @Override
    public void sacar(Double valor) {
        if (valor > 0 && saldo > valor) {
            saldo -= valor;
        }
    }

    public void render() {
        saldo += saldo * RENDIMENTO;
    }

}
