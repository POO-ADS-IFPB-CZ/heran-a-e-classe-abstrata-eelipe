import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Conta> contas = new ArrayList<>();

        while (true) {
            System.out.println("1 - Criar nova conta");
            System.out.println("2 - Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 2) {
                break;
            } else if (opcao == 1) {
                System.out.println("Escolha o tipo de conta:");
                System.out.println("1 - Conta");
                System.out.println("2 - Conta Especial");
                System.out.println("3 - Conta Poupança");
                int tipoConta = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Número da conta: ");
                String numero = scanner.nextLine();
                System.out.print("Titular: ");
                String titular = scanner.nextLine();
                System.out.print("Saldo inicial: ");
                double saldo = scanner.nextDouble();

                if (tipoConta == 1) {
                    contas.add(new Conta(numero, titular, saldo));
                } else if (tipoConta == 2) {
                    System.out.print("Limite: ");
                    double limite = scanner.nextDouble();
                    contas.add(new ContaEspecial(numero, titular, saldo, limite));
                } else if (tipoConta == 3) {
                    System.out.print("Taxa de juros: ");
                    double taxaJuros = scanner.nextDouble();
                    contas.add(new ContaPoupanca(numero, titular, saldo, taxaJuros));
                }

                System.out.println("Conta criada com sucesso!");
            }
        }
        scanner.close();
    }
}
