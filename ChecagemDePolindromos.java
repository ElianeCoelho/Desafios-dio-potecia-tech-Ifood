/* Neste desafio você deverá construir uma função que recebe uma String e identifique se a mesma
 é um palíndromo, ou seja, se a String é igual a ela mesma invertida.
 Dado que temos a String "digital" uma vez invertida temos "latigid" que são diferentes.
Logo, NÃO é um Palíndromo.
Já se recebemos a string "radar" uma vez invertida temos "radar" que são iguais.
 */
import java.util.Scanner;

public class ChecagemDePolindromos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine();
        if(isPolindromo(palavra).equals(palavra)) System.out.println("TRUE");
        else System.out.println("FALSE");

    }
    public static String isPolindromo(String palavra){

        String palavraTemporaria = "";
        for (int i = palavra.length() - 1; i >= 0; i--)
            palavraTemporaria += palavra.charAt(i);
        return palavraTemporaria;



    }
}
