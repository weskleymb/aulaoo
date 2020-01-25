package modelos;

public class ContaCorrente extends Conta {

    private final Double TAXA = 0.01;

    public ContaCorrente(String titular, Integer agencia, Integer conta, Double saldo) {
        super(titular, agencia, conta, saldo);
    }

    @Override
    public void sacar(Double valor) {
        Double valorSaque = valor + valor * TAXA;
        super.sacar(valorSaque);
    }
}
