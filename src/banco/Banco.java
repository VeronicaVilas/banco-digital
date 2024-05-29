package banco;

import banco.cliente.Cliente;
import banco.conta.Conta;
import banco.conta.ContaCorrente;
import banco.conta.ContaPoupanca;

public class Banco {
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente();
        cliente.setNome("Verônica");

        Cliente  clienteDestino = new Cliente();
        clienteDestino.setNome("Vanessa");

        Conta contaCorrente = new ContaCorrente(cliente);
        Conta contaDestino = new ContaCorrente(clienteDestino);
        Conta contaPoupanca = new ContaPoupanca(cliente);
	
		contaCorrente.imprimirExtrato();
        contaCorrente.imprimirNomeCliente();
        contaCorrente.imprimirAgenciaENumero();
        contaCorrente.depositar(100.50);
        contaCorrente.sacar(200);
        contaCorrente.exibirLimite();
        contaCorrente.usarLimiteDeCredito(300);
        contaCorrente.transferir(50, contaDestino);
        contaCorrente.imprimirSaldo();
        contaCorrente.exibirLimite();

        contaPoupanca.imprimirExtrato();
        contaPoupanca.imprimirNomeCliente();
        contaPoupanca.imprimirAgenciaENumero();
        contaPoupanca.depositar(1000);
        contaPoupanca.calcularRendimento();
        contaPoupanca.sacar(200);
        contaPoupanca.imprimirSaldo();
    }
}
