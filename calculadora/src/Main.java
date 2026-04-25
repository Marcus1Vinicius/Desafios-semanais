import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        History historico = new History();
        Calculator calculadora = new Calculator(historico);

        int option;
        double n1, n2;
        Scanner leitor = new Scanner(System.in);

        while(true){
            System.out.println("1 - Somar\n" +
                    "2 - Subtrair\n" +
                    "3 - Dividir\n" +
                    "4- Multiplicar\n" +
                    "5 - Ver histórico\n" +
                    "0 - Parar\n" +
                    "Faça sua escolha: ");
            option = leitor.nextInt();
            if(option == 0){
                break;
            }

            switch (option){
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("Digite o primeiro digito: ");
                    n1 = leitor.nextFloat();
                    System.out.println("Digite o segundo digito: ");
                    n2 = leitor.nextFloat();

                    if(option == 1){
                        System.out.println("Resultado: " + calculadora.somando(n1, n2));
                        break;
                    }else if(option == 2){
                        System.out.println("Resultado: " + calculadora.subtraindo(n1, n2));
                        break;
                    }else if(option == 3){
                        try {
                            System.out.println("Resultado: " + calculadora.dividindo(n1,n2));
                        }catch (ArithmeticException erro){
                            System.out.println(erro.getMessage());
                        }
                        break;
                    }

                    System.out.println("Resultado: " + calculadora.multiplicando(n1, n2));
                    break;

                case 5:
                    historico.mostrar();
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente!");
            }
        }
    }
}