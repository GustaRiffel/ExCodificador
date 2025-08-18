package gs.riffel;

import java.time.LocalDate;

public class CodificadorAtbash implements Codificador{
    
    public String getNome(){
        return "Codificador em implemtação:Atbash";
    }

    public LocalDate getDataCriacao(){
        return LocalDate.of(2025, 8, 13);
    }

    public int getNivelSeguranca(){
        return 50;
    }

    /*Método responsável por realizar a cifra de Atbash*/
    private static String Atbash(String str) {
        if (str == null) {
            return null;
        }
        
        StringBuilder SB = new StringBuilder();

        for (char caracter : str.toCharArray()) {
            if (Character.isLetter(caracter)) {
                if (Character.isUpperCase(caracter)) {
                    char caracterInvertido = (char) ('A' + ('Z' - caracter));
                    SB.append(caracterInvertido);
                } else {
                    char caracterInvertido = (char) ('a' + ('z' - caracter));
                    SB.append(caracterInvertido);
                }
            } else {
                SB.append(caracter);
            }
        }
        return SB.toString();
    }

    public String codificar(String str){
       return Atbash(str);
    }

    public String decodificar(String str){
        return Atbash(str);
    }
}