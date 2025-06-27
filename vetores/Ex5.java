import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] notas = new double[15];
        int soma = 0 ;

        for (int i = 0; i < notas.length; i++) {
        System.out.print("Digite a nota do estudante "+(i+1)+": ");
        notas[i] = scanner.nextDouble();
        soma += notas[i];
        }


        double media = (double) soma / notas.length;
        System.out.println("Média geral dos alunos: "+media);

        scanner.close();
        }


    }

