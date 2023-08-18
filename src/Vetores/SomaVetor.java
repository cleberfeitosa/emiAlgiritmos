package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double soma, media;

        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();

        double[] vetor = new double[n];
        //iterando o vetor
        for (int i=0; i<n; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
        }
        //calculando a soma
        soma = 0;
        for (int i=0; i<n; i++) {
           // soma = soma + vetor[i];
            soma += vetor[i];
        }
        //calculando a média
        media = soma / n;
        //imprimindo os valores
        System.out.print("VALORES = ");

        for (int i=0; i<n; i++) {
            System.out.printf("%.1f  ", vetor[i]);
        }

        System.out.printf("\nSOMA = %.2f\n", soma);
        System.out.printf("MEDIA = %.2f\n", media);

        sc.close();
    }
}
