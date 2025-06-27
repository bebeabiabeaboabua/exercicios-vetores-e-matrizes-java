import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] valores = new int[10];
        int contadorPar = 0;
        int contadorImpar = 0;

        for (int i = 0; i < valores.length; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            valores[i] = scanner.nextInt(); // Aqui ele armazena o valor digitado
                if (valores[i] % 2 == 0){
                    contadorPar++;
                }else{
                    contadorImpar++;
                }
        }
 System.out.println("Valores pares " + contadorPar + "\nValores impares: " + contadorImpar);

        scanner.close();
        }


    }

