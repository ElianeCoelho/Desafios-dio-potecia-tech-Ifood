/* O fatorial de um número inteiro positivo N é o produto de todos os
inteiros positivos menores ou iguais a n. Fazemos um fatorial desajeitado usando
os inteiros em ordem decrescente, trocando as operações de multiplicação por uma
rotação fixa de operações cuja ordem é: multiplicar '*', dividir '/', adicionar '+' e subtrair '-'.
Por exemplo, desajeitado(10) = 10 * 9 / 8 + 7 - 6 * 5 / 4 + 3 - 2 * 1. Lembre-se que no fatorial
desajeitado as operações ainda são aplicadas usando a ordem usual de operações aritméticas.
Além disso, a divisão neste caso sempre resulta em um número inteiro, por exemplo, 90 / 8 = 11.
Dado um inteiro N, retorne o fatorial desajeitado de n.
 */


import java.util.Scanner;

public class FatorialDesajeitado {
    public static void main(String[] args) {

        int n = Integer.parseInt(new Scanner(System.in).nextLine());
        int res = 0;
        int tmp = n;
        int cnt = 1;

        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;

        //Se o número for maior que 3, ele fará um ou mais ciclos. O tmp armazena inicialmente o valor de n;
        //Quando a variável temp for menor que 3, sairá do laço e fará o cálculo restante conforme o seu valor atual
        while (tmp >= 3) {
            if (cnt == 1) {
                cont1 += tmp * (tmp - 1) / (tmp - 2); // cálculo da multiplicação dos 3 primeiros números
                res += (tmp - 3); // somando ao res o número que não foi utilizado na operação
                tmp -= 4; // Como foram usados 4 números, subtraímos o temporário em 4
                cnt++;
            } else if (cnt == 2) {  // Se após subtrair 4, o tmp estiver acima de 3, cairá nesse cnt, só que desta vez, o sinal inicial de tmp é negativo
                cont2 += (-tmp * (tmp - 1)) / (tmp - 2);
                res += (tmp - 3); // somando ao res o número que não foi utilizado na operação
                tmp -= 4; // Como foram usados 4 números, subtraímos o temporário em 4 novamente
            }
        }

        //se o tmp zerar, não cairá nos if abaixo.
        //Se tmp for 1 ou 2, significa que ficou um ou dois números para executar o cálculo, e a depender do cnt, o cálculo difere.

        if (tmp == 1) {
            if (cnt == 1) // Se o cnt for 1, significa que o número n recebido no console foi 1, então não há calculo
                res = 1;
            else // Se o cnt for 2, significa que restou 1 número para calcular, e pela, ordem ele só pode ser negativo.
                cont3 = -tmp;
        }

        if (tmp == 2) {
            if (cnt == 1) // Se o cnt for 1, significa que o número n recebido no console foi 2, logo, o fatorial desajeitado seria: 2 * 1 = 2
                res = tmp;
            else // Se o cnt for 2, significa que restou uma multiplicação para finalizar o fatorial desajeitado, e como está no segundo cnt
                // o 2 se torna negativo: -2 * 1 = 2
                cont3 = (-tmp);
        }

        res = res + cont1 + cont2 + cont3;
        System.out.println(res);
    }
}
