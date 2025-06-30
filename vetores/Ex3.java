import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] valores = new int[10];

        System.out.print("Digite o valor 1: ");
        valores[0] = scanner.nextInt();
        int maiorValor = valores[0];
        int menorValor = valores[0];

        for (int i = 1; i < valores.length; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            valores[i] = scanner.nextInt();
                if (valores[i] > maiorValor){
                maiorValor = valores[i];
                } else if (valores[i] < menorValor){
                menorValor = valores[i];
            }
        }

 System.out.println("Maior valor: " + maiorValor + "\nMenor valor: " + menorValor);

        scanner.close();
        }


    }

