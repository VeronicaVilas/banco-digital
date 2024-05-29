package banco.conta;

import banco.cliente.Cliente;

public class ContaCorrente extends Conta {

    private double limite;

    public ContaCorrente(Cliente cliente) {
        super(cliente);
        this.limite = 500;
    }

    public void usarLimiteDeCredito(double valor) {
        if (valor > 0 && limite >= valor) {
            limite -= valor;
            System.out.println("Novo limite de crédito disponível: " + limite);
        } else {
            System.out.println("O saque não foi realizado porque o saldo é insuficiente!");
        }
    }
    
    public void exibirLimite() {
        System.out.println("Limite de crédito: " + limite);
    }
    
    public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
	}

    public double getLimite() {
        return limite;
    }
}
