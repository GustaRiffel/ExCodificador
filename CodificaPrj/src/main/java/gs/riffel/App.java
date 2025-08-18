package gs.riffel;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Exemplo de uso da Factory
        Codificador cod = FactoryCod.getCodificador(50);

        System.out.println("Codificador escolhido pela Factory:");
        System.out.println("Nome: " + cod.getNome());
        System.out.println("Versão: " + cod.getDataCriacao());
        System.out.println("Nível de segurança: " + cod.getNivelSeguranca());

        String texto = "Factory testando!";
        String codificado = cod.codificar(texto);
        String decodificado = cod.decodificar(codificado);
    
        System.out.println("Texto a ser codificado: " + texto);
        System.out.println("Codificado:" + codificado);
        System.out.println("Texto decodificado: " + decodificado);

    }
}