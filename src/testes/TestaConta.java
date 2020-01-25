package testes;

import modelos.Conta;
import modelos.ContaCorrente;
import modelos.ContaPoupanca;

public class TestaConta  {

    public static void main(String[] args) {

        ContaCorrente contaZe = new ContaCorrente(
                "Ze",
                123,
                123,
                100.0);

        ContaPoupanca contaChico = new ContaPoupanca(
                "Chico",
                234,
                111,
                1000.0);

        contaZe.transferir(10.0, contaChico);

        System.out.println(contaZe);

        System.out.println(contaChico);



    }

}
