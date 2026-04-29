package Model;

public class Cep {
    String cepDigits;

    protected Cep(){}

    public String validateCep(String cepInput){

        if(!formatCheck(cepInput)){
            throw new IllegalArgumentException("CEP errado!");
        }

        return cepDigits;
    }

    public boolean formatCheck(String cepDigits){

        if(cepDigits == null){
            throw new IllegalArgumentException("CEP nulo!");
        }

        String cepClean = cepDigits.replaceAll("[^a-zA-Z0-9\\s]", "");

        if(!cepDigits.matches("^\\\\d+$")){
            throw new IllegalArgumentException("O cep deve conter apenas números!");
        }

        if(!cepClean.matches("\\d{8}")){
            throw new IllegalArgumentException("CEP deve conter exatamente 8 números.");
        };

        return cepDigits.matches("^\\d{5}\\d{8}$");
    }
}
