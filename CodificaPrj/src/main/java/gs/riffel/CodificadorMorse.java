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
        return LocalDate.of(2025, 3, 12);
    }

    public int getNivelSeguranca(){
        return 40;
    }

    static {
        morseMap.put('A', ".-");   
        morseMap.put('a', ".-");
        morseMap.put('B', "-..."); 
        morseMap.put('b', "-...");
        morseMap.put('C', "-.-."); 
        morseMap.put('c', "-.-.");
        morseMap.put('D', "-..");  
        morseMap.put('d', "-..");
        morseMap.put('E', ".");    
        morseMap.put('e', ".");
        morseMap.put('F', "..-."); 
        morseMap.put('f', "..-.");
        morseMap.put('G', "--.");  
        morseMap.put('g', "--.");
        morseMap.put('H', "...."); 
        morseMap.put('h', "....");
        morseMap.put('I', "..");   
        morseMap.put('i', "..");
        morseMap.put('J', ".---"); 
        morseMap.put('j', ".---");
        morseMap.put('K', "-.-");  
        morseMap.put('k', "-.-");
        morseMap.put('L', ".-.."); 
        morseMap.put('l', ".-..");
        morseMap.put('M', "--");   
        morseMap.put('m', "--");
        morseMap.put('N', "-.");   
        morseMap.put('n', "-.");
        morseMap.put('O', "---");  
        morseMap.put('o', "---");
        morseMap.put('P', ".--."); 
        morseMap.put('p', ".--.");
        morseMap.put('Q', "--.-"); 
        morseMap.put('q', "--.-");
        morseMap.put('R', ".-."); 
        morseMap.put('r', ".-.");
        morseMap.put('S', "..."); 
        morseMap.put('s', "...");
        morseMap.put('T', "-");    
        morseMap.put('t', "-");
        morseMap.put('U', "..-"); 
        morseMap.put('u', "..-");
        morseMap.put('V', "...-"); 
        morseMap.put('v', "...-");
        morseMap.put('W', ".--");  
        morseMap.put('w', ".--");
        morseMap.put('X', "-..-"); 
        morseMap.put('x', "-..-");
        morseMap.put('Y', "-.--"); 
        morseMap.put('y', "-.--");
        morseMap.put('Z', "--.."); 
        morseMap.put('z', "--..");
        morseMap.put(' ', "/");

        morseMap.put('!', "-.-.--");
        morseMap.put('.', ".-.-.-");
        morseMap.put(',', "--..--");
        morseMap.put('?', "..--..");

        // Preenche o mapa reverso
        for (Map.Entry<Character, String> entry : morseMap.entrySet()) {
            reverseMorseMap.put(entry.getValue(), entry.getKey());
        }
    }

    public String codificar(String texto) {
    StringBuilder morse = new StringBuilder();

    for (char caracter : texto.toCharArray()) {
        if (Character.isLetter(caracter)) {
            char maiuscula = Character.toUpperCase(caracter);
            String code = morseMap.get(maiuscula);
            if (code != null) {
                morse.append(code).append(" ");
            }
        } else {
            String code = morseMap.get(caracter);
            if (code != null) {
                morse.append(code).append(" ");
            }
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
