/*Modifique o programa anterior para permitir que o usuário insira os nomes em uma
matriz 2x3. Após inserir os nomes, exiba a matriz na tela. */

import java.util.Arrays;
import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] mat = new String[2][3];

        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
                System.out.print("Linha " + (i+1) + " Coluna " + (j+1)+ " : ");
                String num = sc.next();
                mat[i][j] = num;
            }
        }
        System.out.print(Arrays.deepToString(mat));
    }
}