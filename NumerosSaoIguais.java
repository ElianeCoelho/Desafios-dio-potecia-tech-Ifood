/* Nesse desafio, dados dois números, verifique se eles são iguais.
Caso sejam, retorne "Sao iguais!” Caso contrário, retorne "Nao sao iguais!” sem as aspas.*/
import java.util.Scanner;

public class NumerosSaoIguais {
    public static void main(String[] args) {

        System.out.println("Para comparar se são iguais, favor insira dois números inteiros");
        Scanner leitor = new Scanner(System.in);
        int A = leitor.nextInt();
        int B = leitor.nextInt();

        if(A != B)System.out.println("Nao sao iguais!");
        else  System.out.println("Sao iguais!");


    }

}
