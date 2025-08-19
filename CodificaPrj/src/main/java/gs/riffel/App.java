package gs.riffel;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Exemplo de uso da Factory
        Codificador codA = FactoryCod.getCodificador(50);
        Codificador codM = FactoryCod.getCodificador(40);
        Codificador codP = FactoryCod.getCodificador(20);
        Codificador codS = FactoryCod.getCodificador(10);

        // Adição dos codificadores a uma lista para teste
        List<Codificador> codificador = new ArrayList<>();
        codificador.add(codA);
        codificador.add(codM);
        codificador.add(codP);
        codificador.add(codS);

        // Texto a ser testado
        String texto = "Factory testando!";

        for(Codificador codifica : codificador){
            System.out.println("Codificador escolhido pela Factory:");
            System.out.println("Nome: " + codifica.getNome());
            System.out.println("Versão: " + codifica.getDataCriacao());
            System.out.println("Nível de segurança: " + codifica.getNivelSeguranca());
            System.out.println("Texto a ser codificado: " + texto);
            String codificado = codifica.codificar(texto);
            String decodificado = codifica.decodificar(codificado);
            System.out.println("Codificado:" + codificado);
            System.out.println("Texto decodificado: " + decodificado+"\n");
        }    
    }
}