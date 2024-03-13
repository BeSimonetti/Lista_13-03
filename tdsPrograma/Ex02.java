/*Escreva um programa que solicite ao usuário que insira dois números inteiros e
realize a soma desses números. Em seguida, exiba o resultado da soma. */

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     
    System.out.print("Insira o primeiro número: ");
    double num1 = sc.nextDouble();
    System.out.print("Insira o segundo número: ");
    double num2 = sc.nextDouble();
    
    double result = num1 + num2;

    System.out.println("O resultado da soma é "+ result);

    }
}