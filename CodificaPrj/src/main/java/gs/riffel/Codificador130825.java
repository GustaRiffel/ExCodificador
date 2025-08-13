package gs.riffel;

import java.time.LocalDate;

public class Codificador130825 implements Codificador{
    public String getNome(){
        return "Codificador em implemtação:Atbash, Invertido ?";
    }

    public LocalDate getDataCriacao(){
        return LocalDate.of(2025, 8, 13);
    }

    public int getNivelSeguranca(){
        return 1;
    }

    public String codifica(String str){
         StringBuilder SB = new StringBuilder();

         return SB.toString();
    }

    public String decodifica(String str){
        StringBuilder SB = new StringBuilder();

        return SB.toString();
    }
}