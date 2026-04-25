//desafio da sequencia de Fibonacci, a ideia e fazer um algoritmo que solicita ao usuario um numero e o algoritmo vai mostrar a sequencia de Fibonacci
// na quantidade de vezes que o usuario digitou, a sequencia se da pelo numero sucessor ser a soma dos dois anteriores a ele: 0 1 1 2 3 5...
import java.util.Scanner;
public class D1 {

    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        int numero, n1 = 0, n2 = 1;

        System.out.print("Digite o numero: ");

        numero = leitor.nextInt();

        for(int i = 0; i < numero; i++){
            System.out.print(n1+ " ");
            System.out.print(n2+ " ");
            n1 += n2;
            n2 += n1;
        }
    }

}
