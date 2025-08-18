package gs.riffel;

import java.time.LocalDate;

public class CodificadorSimples implements Codificador {
    public String getNome() {
        return "Codificador Simples";
    }

    public LocalDate getDataCriacao() {
        return LocalDate.of(2025, 03, 13);
    }

    public int getNivelSeguranca(){
        return 10;
    }

    public String codificar(String str) {
        StringBuilder encoded = new StringBuilder();

        for (char c : str.toCharArray()) {
            encoded.append((char) (c + 1));
        }

        return encoded.toString();
    }

    public String decodificar(String str) {
        StringBuilder encoded = new StringBuilder();
        
        for (char c : str.toCharArray()) {
            encoded.append((char) (c - 1));
        }
        
        return encoded.toString();
    }
}