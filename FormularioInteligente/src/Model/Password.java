package Model;

public class Password {
    String password;

    public String checkPassword(String passwordInput){

        if(!validatePassword(passwordInput)){
            throw new IllegalArgumentException("Senha inválida! A senha precisa de 8 caracteres(letras maiusculas e minuscula, digitos numericos e caracteres especiais '@#$%' ");
        }

        this.password = passwordInput;

        return password;
    }

    public boolean validatePassword(String password){

        if(password == null){
            throw new IllegalArgumentException("The password cannot null!");
        };

        if(password.length() < 8){
            throw new IllegalArgumentException("A senha precisar ter no minimo 8 caracteres");
        };

        return password.matches("^(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).+$");

    }

}
