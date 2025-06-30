import java.util.Scanner;

public class Ex5_Matriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        System.out.println("Digite os valores da matriz 3x3:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Valor [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        int somaMagica = matriz[0][0] + matriz[0][1] + matriz[0][2];
        boolean ehMagico = true;

        for (int i = 1; i < 3; i++) {
            int somaLinha = 0;
            for (int j = 0; j < 3; j++) {
                somaLinha += matriz[i][j];
            }
            if (somaLinha != somaMagica) {
                ehMagico = false;
                break;
            }
        }

        if (ehMagico) {
            for (int j = 0; j < 3; j++) {
                int somaColuna = 0;
                for (int i = 0; i < 3; i++) {
                    somaColuna += matriz[i][j];
                }
                if (somaColuna != somaMagica) {
                    ehMagico = false;
                    break;
                }
            }
        }

        if (ehMagico) {
            int somaDiagonalPrincipal = matriz[0][0] + matriz[1][1] + matriz[2][2];
            if (somaDiagonalPrincipal != somaMagica) {
                ehMagico = false;
            }
        }

        if (ehMagico) {
            int somaDiagonalSecundaria = matriz[0][2] + matriz[1][1] + matriz[2][0];
            if (somaDiagonalSecundaria != somaMagica) {
                ehMagico = false;
            }
        }

        if (ehMagico) {
            System.out.println("\n A matriz é um QUADRADO MGICO! ");
        } else {
            System.out.println("\n A matriz NÃO é um quadrado mágico.");
        }

        scanner.close();
    }
}
