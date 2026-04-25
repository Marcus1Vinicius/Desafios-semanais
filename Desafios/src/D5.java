import java.util.Scanner;

public class D5 {

    public static void main(String[] args){
        int[] numbers = new int[100];
        int contador, num;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Inject the number of more");
        contador = leitor.nextInt();

        for(int i = 0; i < contador; i++){
            Scanner leitor1 = new Scanner(System.in);
            System.out.println("Inject the number {}" + i);
            num = leitor1.nextInt();
            numbers[i] = num;
        }


    }


}
