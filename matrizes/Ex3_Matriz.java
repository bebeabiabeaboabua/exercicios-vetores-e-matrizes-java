import java.util.Scanner;

public class Ex3_Matriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] matriz = new double[4][4];

        System.out.println("Digite os valores da matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Valor na posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextDouble();
            }
        }

        // a) Diagonal principal (i == j)
        System.out.println("\n🔷 Diagonal principal:");
        for (int i = 0; i < 4; i++) {
            System.out.print(matriz[i][i] + " ");
        }

        // b) Diagonal secundária (i + j == 3)
        System.out.println("\n\n🔶 Diagonal secundária:");
        for (int i = 0; i < 4; i++) {
            int j = 3 - i;
            System.out.print(matriz[i][j] + " ");
        }

        // c) Matriz transposta
        System.out.println("\n\n🔁 Matriz transposta:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[j][i] + "\t");
            }
            System.out.println(); // quebra de linha
        }

        scanner.close();
    }
}

