import java.util.Scanner;

public class D3 {
    public static void main(String[] args){
        int n1;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Inject the number: ");
        n1 = leitor.nextInt();
        if(n1%2 == 0){
            System.out.println("The number is pair!");
        }
        if(n1%2 != 0){
            System.out.println("The number is odd!");
        }
    }
}
