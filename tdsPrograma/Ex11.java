/* Escreva uma função que receba um vetor de inteiros como parâmetro e retorne o
maior elemento do vetor. Em seguida, utilize essa função para encontrar e exibir o
maior elemento do vetor inserido pelo usuário. */

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = sc.nextInt();
        
        int[] vet = new int[tamanho];

        for(int i = 0; i < vet.length; i++){
            System.out.print("Digite o elemento " + (i+1) + ": ");
            vet[i] = sc.nextInt();
        }
        
        int maior = encontrarMaior(vet);
        System.out.println("O maior elemento do vetor é: " + maior);
    }
    
    public static int encontrarMaior(int[] vetor) {
        int maior = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        return maior;
    }
}
