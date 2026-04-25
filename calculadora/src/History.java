import java.util.ArrayList;

public class History {
    private static ArrayList<String> historico = new ArrayList<>();

    public void armazenar(String m){
        historico.add(m);
    }
    public static void mostrar(){
        for(String item: historico){
            System.out.println(item);
        }
    }
}
