import java.util.Scanner;

public class D2 {

    public static void main(String[] args){

        int n1, n2, quebra, opcao;
        Scanner leitor = new Scanner(System.in);

        while(true){

            System.out.print("Digite 1 para somar \nDigite 2 para subtrair \nDigite 3 para dividir \nDigite 4 para multiplicar \n");
            opcao = leitor.nextInt();

            System.out.print("Digite o primeiro numero: ");
            n1 = leitor.nextInt();

            System.out.print("Digite o segundo numero: ");
            n2 = leitor.nextInt();

            if(opcao == 1){
                int soma = n1 + n2;
                System.out.println("Resultado: " + soma);
                opcao = 0;

                System.out.print("Digite 0 para parar ou 5 para continuar: ");
                quebra = leitor.nextInt();
                if(quebra == 0){
                    break;
                }
                if(quebra == 5){
                    continue;
                }
            }

            if(opcao == 2){
                int subtracao = n1 - n2;
                System.out.println("Resultado: " + subtracao);
                opcao = 0;

                System.out.print("Digite 0 para parar ou 5 para continuar: ");
                quebra = leitor.nextInt();
                if(quebra == 0){
                    break;
                }
                if(quebra == 5){
                    continue;
                }
            }

            if(opcao == 3){
                int divisao = n1 / n2;
                System.out.println("Resultado: " + divisao);
                opcao = 0;

                System.out.print("Digite 0 para parar ou 5 para continuar: ");
                quebra = leitor.nextInt();
                if(quebra == 0){
                    break;
                }
                if(quebra == 5){
                    continue;
                }
            }

            if(opcao == 4){
                int multiplicacao = n1 * n2;
                System.out.println("Resultado: " + multiplicacao);
                opcao = 0;

                System.out.print("Digite 0 para parar ou 5 para continuar: ");
                quebra = leitor.nextInt();
                if(quebra == 0){
                    break;
                }
                if(quebra == 5){
                    continue;
                }
            }

        }

    }
}
