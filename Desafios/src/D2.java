import java.util.Scanner;

public class D2 {

    public static void main(String[] args) {

        int n1, n2, opcao;
        Scanner leitor = new Scanner(System.in);

        while(true){

            System.out.print("Digite 1 para somar " +
                    "\nDigite 2 para subtrair " +
                    "\nDigite 3 para dividir " +
                    "\nDigite 4 para multiplicar \n" +
                    "digite 0 para parar a calculadora\nvalor: ");

            opcao = leitor.nextInt();
            if(opcao == 0){
                break;
            }

            System.out.print("Digite o primeiro numero: ");
            n1 = leitor.nextInt();

            System.out.print("Digite o segundo numero: ");
            n2 = leitor.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("A soma resulta em: " + somar(n1, n2));
                    break;
                case 2:
                    System.out.println("O resultado: " + subtrair(n1, n2));
                    break;
                case 3:
                    try{
                        System.out.println("A divisao: " + dividir(n1, n2));
                    }catch (ArithmeticException e){
                        System.out.println(e.getMessage());
                    }break;

                case 4:
                    System.out.println("A multiplicacao: " + multiplicar(n1, n2));
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        }

    }

    public static int somar(int a, int b) {
        return a + b;
    }
    public static int dividir (int a, int b) {
        if(b == 0){
            throw new ArithmeticException("O divisor precisa ser diferente de zero!");
        }
        return a / b;
    }
    public static int subtrair (int a, int b) {
        return a - b;
    }

    public static int multiplicar (int a, int b) {
        return a * b;
    }
}