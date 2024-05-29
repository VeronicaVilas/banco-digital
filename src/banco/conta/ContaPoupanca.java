package banco.conta;

import banco.cliente.Cliente;

public class ContaPoupanca extends Conta{

    private double rendimento;

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
        this.rendimento = 0.1;
    }

    public void calcularRendimento() {
        double valorRendimento = getSaldo() * rendimento;
        depositar(valorRendimento);
        System.out.println("Rendimento aplicado: " + valorRendimento);
        System.out.println("Novo saldo após rendimento: " + getSaldo());
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && getSaldo() >= valor) {
            super.sacar(valor);
        } else {
            System.out.println("O saque não foi realizado porque o saldo é insuficiente!");
        }
    }

    public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
	}

    public double getRendimento() {
        return rendimento;
    }
    
}
