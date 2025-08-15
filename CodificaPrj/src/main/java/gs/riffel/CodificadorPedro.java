package gs.riffel;
import java.time.LocalDate;

public class CodificadorPedro implements Codificador{
    public String getNome(){
        return "Codificador Do Pedro";
    }

    // Retorna a data de imlementação do codificador (pode ser usado como versao)
    public LocalDate getDataCriacao(){
        return LocalDate.of(2025, 8, 12);
    }

    // Retorna o nivel de segurança do codificador (1 = muito baixo, 100 = muito alto)
    public int getNivelSeguranca(){
        return 20;
    }

    // Recebe um string e retorna o correspondente codificado
    public String codificar(String str) {
        StringBuilder resultado = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                c = Character.toUpperCase(c);
                int numero = 26 - (c - 'A');
                resultado.append(numero).append(" ");
            } else if (c == ' ') {
                resultado.append("/ "); // separador para espaços
            }
        }
        return resultado.toString().trim();
    }
    
    // Recebe um string codificado e retorna o correspondente decodificado
    public String decodificar(String str) {
        StringBuilder resultado = new StringBuilder();

        // Quebra por espaço
        String[] partes = str.trim().split("\\s+");

        for (String parte : partes) {
            if (parte.equals("/")) { 
                resultado.append(" "); // espaço original
            } else {
                int num = Integer.parseInt(parte);
                char letra = (char) ('A' + (26 - num));
                resultado.append(letra);
            }
        }
        return resultado.toString();
    }
}