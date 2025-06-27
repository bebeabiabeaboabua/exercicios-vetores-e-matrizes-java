import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] valores = new int[6];

        for (int i = 0; i < valores.length; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            valores[i] = scanner.nextInt(); // Aqui ele armazena o valor digitado
        }

        System.out.println("\nValores digitados:");
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Valor " + (i + 1) + ": " + valores[i]);
        }

        scanner.close();
    }
}
