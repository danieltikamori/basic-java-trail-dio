package cc.tkmr;

import java.util.Locale;
import java.util.Scanner;

public class AboutMeExceptions {

    public static void main(String[] args) {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        String nome = getNome(scanner);
        String sobrenome = getSobrenome(scanner);
        int idade = getIdade(scanner);
        double altura = getAltura(scanner);


        scanner.close();

        //imprimindo os dados obtidos pelo usuario
        System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "m ");
    }

        private static String getNome(Scanner scanner) {
            String nome = "Seu nome";

        do {
            try {
                System.out.println("Digite seu nome:");
                nome = scanner.next();
                if (nome.length() < 3) {
                    throw new IllegalArgumentException("Nome inválido. O nome deve ter pelo menos 3 caracteres.");
                }
            } catch (Exception e)  {
                System.out.println("Nome inválido. O nome deve ter pelo menos 3 caracteres.");
                scanner.nextLine();
            }
        } while (nome.length() < 3);

        return nome;
        }

        private static String getSobrenome(Scanner scanner) {
            String sobrenome = "Seu sobrenome";

            do {
                try {
                    System.out.println("Digite seu sobrenome:");
                    sobrenome = scanner.next();
                    if (sobrenome.length() < 3) {
                        throw new IllegalArgumentException("Sobrenome inválido. O sobrenome deve ter pelo menos 3 caracteres.");
                    }
                } catch (Exception e) {
                    System.out.println("Sobrenome inválido. O sobrenome deve ter pelo menos 3 caracteres.");
                    scanner.nextLine();
                }
            } while (sobrenome.length() < 3);

            return sobrenome;
        }

        private static int getIdade(Scanner scanner) {
            int idade = 0;

            do {
                try {
                    System.out.println("Digite sua idade:");
                    idade = scanner.nextInt();
                    if (idade < 10 || idade > 150) {
                        throw new IllegalArgumentException("Idade inválida. A idade deve estar entre 0 e 150 anos.");
                    }
                } catch (Exception e) {
                    System.out.println("Idade inválida. A idade deve estar entre 10 e 150 anos.");
                    scanner.nextLine();
                }
            } while (idade < 10 || idade > 150);

            return idade;
        }

        private static double getAltura(Scanner scanner) {
            double altura = 0;

            do {
                try {
                    System.out.println("Digite sua altura:");
                    altura = scanner.nextDouble();
                    if (altura < 0 || altura > 3.0) {
                        throw new IllegalArgumentException("Altura inválida. A altura deve estar entre 0 e 3 metros.");
                    }
                } catch (Exception e) {
                    System.out.println("Altura inválida. A altura deve estar entre 0 e 3 metros.");
                    scanner.nextLine();
                }
            } while (altura < 0 || altura > 3.0);

            return altura;
        }
}
