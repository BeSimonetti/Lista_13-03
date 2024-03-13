/* Entrada e Saída de Dados: Escreva um programa Java que solicite ao usuário seu
nome e idade e, em seguida, exiba essas informações na tela. */

import java.util.Scanner;
public class Ex01{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira seu nome: ");
        String nome = sc.next();
        System.out.print("Insira sua idade: ");
        int idade = sc.nextInt();

        System.out.println(nome);
        System.out.println(idade);
    }
}