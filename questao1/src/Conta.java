class Conta {
    protected String numero;
    protected String titular;
    protected double saldo;

    public Conta(String numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("O valor do depósito deve ser positivo.");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }
}

class ContaPoupanca extends Conta {
    private double taxaJuros;

    public ContaPoupanca(String numero, String titular, double saldo, double taxaJuros) {
        super(numero, titular, saldo);
        this.taxaJuros = taxaJuros;
    }

    public void reajustar() {
        saldo += saldo * taxaJuros;
        System.out.println("Reajuste aplicado! Novo saldo: R$" + saldo);
    }
}

class ContaEspecial extends Conta {
    private double limite;

    public ContaEspecial(String numero, String titular, double saldo, double limite) {
        super(numero, titular, saldo);
        this.limite = limite;
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo + limite) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }
}
