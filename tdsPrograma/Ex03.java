/*Estruturas Condicionais: Modifique o programa anterior para verificar se a idade é
maior ou igual a 18 anos. Se for, exiba "Você é maior de idade"; caso contrário, exiba
"Você é menor de idade". */
import java.util.Scanner;

public class Ex03{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira seu nome: ");
        String nome = sc.next();
        System.out.print("Insira sua idade: ");
        int idade = sc.nextInt();

        if(idade>=18){
            System.out.println("Você é maior de idade");
        }   else if(idade>0 && idade<18){
            System.out.println("Você é menor de idade");
        }  else if(idade<0){
            System.out.println("Idade invalida");
        }
    }
}