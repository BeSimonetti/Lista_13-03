/*Vetores: Crie um programa que solicite ao usuário que insira 5 números inteiros e
armazene-os em um vetor. Em seguida, exiba os números na ordem inversa em que
foram digitados. */
import java.util.Scanner;

public class Ex06{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        
        for(int i=0; i<array.length; i++){
            System.out.print("Insira os números: ");
            int num = sc.nextInt();
            array[i] = num;
        }
        for(int j=array.length - 1; j>=0; j--){
            System.out.println(array[j]);
        }
    }
}