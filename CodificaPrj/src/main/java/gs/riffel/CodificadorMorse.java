package gs.riffel;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class CodificadorMorse implements Codificador {
    private static final Map<Character, String> morseMap = new HashMap<>();
    private static final Map<String, Character> reverseMorseMap = new HashMap<>();

    public String getNome() {
        return "Codificador Morse";
    }

    public LocalDate getDataCriacao() {
        return LocalDate.of(2025, 03, 12);
    }

    public int getNivelSeguranca(){
        return 2;
    }


    static {
        morseMap.put('A', ".-");
        morseMap.put('B', "-...");
        morseMap.put('C', "-.-.");
        morseMap.put('D', "-..");
        morseMap.put('E', ".");
        morseMap.put('F', "..-.");
        morseMap.put('G', "--.");
        morseMap.put('H', "....");
        morseMap.put('I', "..");
        morseMap.put('J', ".---");
        morseMap.put('K', "-.-");
        morseMap.put('L', ".-..");
        morseMap.put('M', "--");
        morseMap.put('N', "-.");
        morseMap.put('O', "---");
        morseMap.put('P', ".--.");
        morseMap.put('Q', "--.-");
        morseMap.put('R', ".-.");
        morseMap.put('S', "...");
        morseMap.put('T', "-");
        morseMap.put('U', "..-");
        morseMap.put('V', "...-");
        morseMap.put('W', ".--");
        morseMap.put('X', "-..-");
        morseMap.put('Y', "-.--");
        morseMap.put('Z', "--..");
        morseMap.put(' ', "/");

        // Preenche o mapa reverso
        for (Map.Entry<Character, String> entry : morseMap.entrySet()) {
            reverseMorseMap.put(entry.getValue(), entry.getKey());
        }
    }
    

    public String codificar(String texto) {
        StringBuilder morse = new StringBuilder();
        texto = texto.toUpperCase();
        for (char c : texto.toCharArray()) {
            String code = morseMap.get(c);
            if (code != null) {
                morse.append(code).append(" ");
            }
        }
        return morse.toString().trim();
    }

    public String decodificar(String morse) {
        StringBuilder texto = new StringBuilder();
        String[] codes = morse.split(" ");
        for (String code : codes) {
            Character c = reverseMorseMap.get(code);
            if (c != null) {
                texto.append(c);
            }
        }
        return texto.toString();
    }
}

