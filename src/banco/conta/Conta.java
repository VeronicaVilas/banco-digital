package banco.conta;

import java.util.Random;

import banco.cliente.Cliente;

public class Conta {

    private static final Random random = new Random();
    
    protected Cliente cliente;
    protected String agencia;
    protected String numeroDaConta;
    protected double saldo;

    public Conta(Cliente cliente) {
        this.cliente = cliente;
        this.agencia = gerarAgencia();
        this.numeroDaConta = gerarNumeroDaConta();
        this.saldo = 0;
    }

    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Valor sacado: " + valor);
        } else {
            System.out.println("O saque não foi realizado porque o saldo é insuficiente!");
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Deposito realizado com sucesso! Novo saldo: " + valor);
        }
    }

    public void transferir(double valor, Conta contaDestino) {
        if (valor > 0 && saldo >= valor) {
            sacar(valor);
            contaDestino.depositar(valor);
            System.out.println("Transferência de " + valor + " realizada com sucesso!");
            System.out.println("Novo saldo: " + saldo);
        } else {
            System.out.println("A transferência não foi realizada porque o saldo é insuficiente!");
        }
    }

    public void imprimirSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }
    
    public void imprimirAgenciaENumero() {
        System.out.println("Agência: " + agencia);
        System.out.println("Número da Conta: " + numeroDaConta);
    }

    public void imprimirNomeCliente() {
        System.out.println("Nome do Cliente: " + cliente.getNome());
    }

    public static String gerarAgencia() {
        int agencia = random.nextInt(1000);
        return String.format("%04d-0", agencia);
    }

    public static String gerarNumeroDaConta() {
        int numeroDaConta = random.nextInt(1000);
        return String.format("%06d-0", numeroDaConta);
    }

    public void imprimirExtrato() {}

    public void calcularRendimento() {}

    public void exibirLimite() {}

    public void usarLimiteDeCredito(double valor) {}

    public String getAgencia() {
        return agencia;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }
}
