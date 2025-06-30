import java.util.Scanner;

public class Ex2_Matriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[3][5];
        int pares = 0;
        int impares = 0;

        int[] todosOsValores = new int[15];
        int index = 0;

        System.out.println("Digite os valores da matriz 3x5:");

        for (int i = 0; i < 3; i++) { 
            for (int j = 0; j < 5; j++) { 
                System.out.print("Valor na posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();


                todosOsValores[index] = matriz[i][j];
                index++;

                if (matriz[i][j] % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }

            }
        }


        boolean temRepetido = false;
        for (int i = 0; i < todosOsValores.length; i++) {
            for (int j = i + 1; j < todosOsValores.length; j++) {
                if (todosOsValores[i] == todosOsValores[j]) {
                    temRepetido = true;
                    break;
                }
            }
            if (temRepetido) break;
        }


        System.out.println("\nQuantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);
        System.out.println("A matriz possui elementos repetidos? " + (temRepetido ? "Sim" : "Não"));

        scanner.close();
    }
}
