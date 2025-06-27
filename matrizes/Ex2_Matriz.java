import java.util.Scanner;

public class Ex2_Matriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[3][5];
        int pares = 0;
        int impares = 0;

        int[] todosOsValores = new int[15];
        int index = 0;

        int[] somaColunas = new int[5]; 
        int[] somaLinhas = new int[5]; 

        // Lê e armazena os valores na matriz
        System.out.println("Digite os valores da matriz 3x5:");

        for (int i = 0; i < 3; i++) { // linhas
            for (int j = 0; j < 5; j++) { // colunas
                System.out.print("Valor na posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();

                // Armazena no vetor auxiliar
                todosOsValores[index] = matriz[i][j];
                index++;

                // Conta pares e ímpares
                if (matriz[i][j] % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }

            }
        }

 // Verifica se tem repetidos
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

        // Resultados
        System.out.println("\nQuantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);
        System.out.println("A matriz possui elementos repetidos? " + (temRepetido ? "Sim" : "Não"));

        scanner.close();
    }
}