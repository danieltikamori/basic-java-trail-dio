package cc.tkmr;

import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = getAccountNumber(scanner);
        String agencia = getAgency(scanner);
        String nomeCliente = getClientName(scanner);
        BigDecimal saldo = getBalance(scanner);

        // Print account details
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }

    private static int getAccountNumber(Scanner scanner) {
        int numero = 0;

        do {
            try {
                System.out.println("Digite o número da conta:");
                numero = scanner.nextInt();
                if (numero <= 0) {
                    System.out.println("O número da conta deve ser maior que zero.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Valor inválido. Digite um número inteiro.");
                scanner.nextLine(); // Clear invalid input
            }
        } while (numero <= 0);

        return numero;
    }

    private static String getAgency(Scanner scanner) {
        String agencia = "";

        do {
            try {
                System.out.println("Digite a agência:");
                agencia = scanner.next();
                if (agencia == null || agencia.isEmpty()) {
                    System.out.println("A agência não pode ser vazia.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Valor inválido. Tente novamente.");
                scanner.nextLine(); // Clear invalid input
            }
        } while (agencia == null || agencia.isEmpty());

        return agencia;
    }

    private static String getClientName(Scanner scanner) {
        String nomeCliente = "";

        do {
            try {
                System.out.println("Digite o nome do cliente:");
                nomeCliente = scanner.next();
                if (nomeCliente == null || nomeCliente.isEmpty()) {
                    System.out.println("Nome do cliente não pode ser vazio.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Valor inválido. Tente novamente.");
                scanner.nextLine(); // Clear invalid input
            }
        } while (nomeCliente == null || nomeCliente.isEmpty());

        return nomeCliente;
    }

    private static BigDecimal getBalance(Scanner scanner) {
        BigDecimal saldo = BigDecimal.ZERO;

        do {
            System.out.println("Digite o saldo:");
            if (scanner.hasNextBigDecimal()) {
                try {
                    saldo = scanner.nextBigDecimal();
                    if (saldo.compareTo(BigDecimal.ZERO) < 0) {
                        System.out.println("O saldo não pode ser negativo.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Valor inválido. Digite um número decimal.");
                }
            } else {
                System.out.println("Valor inválido. Digite um número decimal.");
            }
            scanner.nextLine(); // Clear invalid input after handling
        } while (saldo.compareTo(BigDecimal.ZERO) <= 0);

        return saldo;
    }
}
