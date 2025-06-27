import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] valores = new int[6];
        int qntImpares = 0;
        int somaPares = 0;

        for (int i = 0; i < valores.length; i++) {
        System.out.print("Digite o valor "+(i+1)+": ");
        valores[i] = scanner.nextInt();

        }

        System.out.println("\nnumeros pares digitados:");

        for (int i = 0; i < valores.length; i++) {
            if(valores[i] %2 == 0){
                System.out.print(valores[i] + " ");
                somaPares += valores[i];
            }
        }

        System.out.println("\n---------------"); 
        System.out.println("numeros impares digitados:");

        for (int i = 0; i < valores.length; i++) {
            if(valores[i] %2 != 0){
                System.out.print(valores[i] + " ");
                qntImpares++;
            }
        }
        scanner.close();
        
        }
    }

