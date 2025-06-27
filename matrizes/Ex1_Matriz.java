import java.util.Scanner;

public class Ex1_Matriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[5][5];
        int somaImpares = 0;

        int[] somaColunas = new int[5];
        int[] somaLinhas = new int[5]; 

        // Lê e armazena os valores na matriz
        System.out.println("Digite os valores da matriz 5x5:");

        for (int i = 0; i < 5; i++) { // linhas
            for (int j = 0; j < 5; j++) { // colunas
                System.out.print("Valor na posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();

                // a) soma dos ímpares
                if (matriz[i][j] % 2 != 0) {
                    somaImpares += matriz[i][j];
                }

                // b) soma da coluna j
                somaColunas[j] += matriz[i][j];

                // c) soma da linha i
                somaLinhas[i] += matriz[i][j];
            }
        }

        System.out.println("\nSoma dos números ímpares: " + somaImpares);

        System.out.println("\nSoma de cada coluna:");
        for (int j = 0; j < 5; j++) {
            System.out.println("Coluna " + j + ": " + somaColunas[j]);
        }

        System.out.println("\nSoma de cada linha:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Linha " + i + ": " + somaLinhas[i]);
        }

        scanner.close();
    }
}
