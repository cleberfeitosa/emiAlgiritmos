package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class MediaPares {
    public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
 System.out.print("Quantos elementos vai ter o vetor? ");
    int n = sc.nextInt();
    int[] vetor = new int[n];
    //iterando o vetor
	    for (int i=0; i<n; i++) {
        System.out.print("Digite um numero: ");
        vetor[i] = sc.nextInt();
    }

        //Calculando a soma e a quantidade de pares
        int somapares = 0;
        int npares = 0;
	    for (int i=0; i<n; i++) {
            if (vetor[i] % 2  ==0) {
                somapares += vetor[i];
                npares++;
            }
    }
     double mediapares = 0;
	    if (npares == 0) {
        System.out.println("NENHUM NUMERO PAR");
    }
	    else {
        mediapares = (double)somapares / npares;

        System.out.printf("MEDIA DOS PARES = %.1f\n", mediapares);
    }

		sc.close();
}
}
