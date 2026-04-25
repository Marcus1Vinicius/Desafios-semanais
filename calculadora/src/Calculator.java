public class Calculator {

    private History historico = new History();
    public Calculator(History historico){
        this.historico = historico;
    }
    public String somando(double n1, double n2){
        historico.armazenar(n1 + " + " + n2 + " = " + (n1 + n2));
        return String.format("%.2f", n1 + n2);
    }
    public String dividindo(double n1, double n2){
        if(n2 == 0){
            throw new ArithmeticException("O divisor precisa ser diferente de zero, tente novamente!");
        }
        historico.armazenar(n1 + " / " + n2 + " = " + (n1 / n2));
        return String.format("%.2f", n1 / n2);
    }
    public String multiplicando(double n1, double n2){
        historico.armazenar(n1 + " * " + n2 + " = " + (n1 * n2));
        return String.format("%.2f", n1 * n2);
    }
    public String subtraindo(double n1, double n2){
        historico.armazenar(n1 + " - " + n2 + " = " + (n1 - n2));
        return String.format("%.2f", n1 - n2);
    }
}
