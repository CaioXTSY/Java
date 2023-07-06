import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        String operacao;
        while (true) {
            System.out.println("---------------------");
            System.out.println("1. Adicao (+)");
            System.out.println("2. Subtracaoo (-)");
            System.out.println("3. Multiplicacao (*)");
            System.out.println("4. Divisao (/)");
            System.out.println("5. Sair");
            System.out.println("---------------------");
            operacao = scanner.nextLine();
            if (operacao.equals("5")) {
                System.out.println("Adios");
                break;
            }
            System.out.println("Digite o primeiro número:");
            num1 = scanner.nextDouble();
            System.out.println("Digite o segundo número:");
            num2 = scanner.nextDouble();
            scanner.nextLine();
            switch (operacao) {
                case "1":
                    System.out.println(num1 + num2);
                    break;
                case "2":
                    System.out.println(num1 - num2);
                    break;
                case "3":
                    System.out.println(num1 * num2);
                    break;
                case "4":
                    if (num2 != 0) {
                        System.out.println(num1/num2);
                    } else {
                        System.out.println("Não é possível dividir por zero!");
                    }
                    break;
                default:
                    System.out.println("Operação inválida! Tente novamente.");
            }
        }
        scanner.close();
    }
}
