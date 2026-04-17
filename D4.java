import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D4 {
    public static void main(String[] args){
        String palavra;
        int contador = 0;
        String regex = "[aeiouAEIOU]";
        Scanner leitor = new Scanner(System.in);
        System.out.println("Inject the word: ");
        palavra = leitor.next();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(palavra);

        while(matcher.find()){
            contador++;
        }
        System.out.println("the number of vogals is: " + contador);
    }
}
