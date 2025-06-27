import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[vetorA.length];

        //vetor A
        for (int i = 0; i < vetorA.length; i++) {
        System.out.print("Digite o "+(i+1)+"º valor do vetor A: ");
        vetorA[i] = scanner.nextInt();
        }

        //vetor B
        for (int i = 0; i < vetorB.length; i++) {
        System.out.print("Digite o "+(i+1)+"º valor do vetor B: ");
        vetorB[i] = scanner.nextInt();
        }

            for (int i = 0; i < vetorA.length; i++) {
            vetorC[i] = vetorA[i] - vetorB[i];
        }
        // Mostra o vetorC
        System.out.println("Vetor C (A - B):");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.println("C[" + (i+1) + "] = " + vetorC[i]);
        scanner.close();
        }
    }

    }

