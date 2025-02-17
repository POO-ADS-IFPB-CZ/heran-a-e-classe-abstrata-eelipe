public class Main {
    public static void main(String[] args) {
        ContaPoupanca contaPoupanca = new ContaPoupanca("12345", "João", 1000, 0.05);
        ContaEspecial contaEspecial = new ContaEspecial("67890", "Maria", 500, 1000);

        contaPoupanca.consultarSaldo();
        contaPoupanca.reajustar();
        contaPoupanca.consultarSaldo();

        contaEspecial.consultarSaldo();
        contaEspecial.sacar(1200);
        contaEspecial.consultarSaldo();
    }
}