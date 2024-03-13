/*Estruturas de Repetição: Escreva um programa que solicite ao usuário um número
inteiro positivo e, em seguida, exiba todos os números de 1 até o número inserido
pelo usuário. */

import java.util.Scanner;

public class Ex05{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont; // Contador

        System.out.print("Insira um número inteiro positivo: ");
        int num = sc.nextInt();
        
        for(int i=1; i<=num; i++){
            cont = i;
            System.out.println(cont);
        }
    }
}