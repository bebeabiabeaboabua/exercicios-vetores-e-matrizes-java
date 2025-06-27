import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] valores = new int[6];

        for (int i = 0; i < valores.length; i++) {
        System.out.print("Digite o valor "+(i+1)+": ");
        valores[i] = scanner.nextInt();

        }
        System.out.println("Valores em ordem inversa: ");

        for (int i = valores.length - 1; i >= 0; i--) {
            System.out.println(valores[i]);

        }

        scanner.close();
        }


    }

