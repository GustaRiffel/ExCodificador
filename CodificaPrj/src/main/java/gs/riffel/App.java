package gs.riffel;

public class App {
    public static void main(String[] args) throws Exception {
        
        Codificador cod = new CodificadorSimples();

        System.out.println("Codificador: "+cod.getNome());
        System.out.println("Versao: "+cod.getDataCriacao());
        System.out.println("Nivel de segurança: "+cod.getNivelSeguranca());
        
        String texto = "Este e o string a ser codificado";
        String codificado = cod.codificar(texto);
        String decodificado = cod.decodificar(codificado);

        System.out.println("Texto original: "+texto);
        System.out.println("Texto codificado: "+codificado);
        System.out.println("Texto decodificado: "+decodificado);
        
        
        CodificadorMorse codificador = new CodificadorMorse();
        
        System.out.println("Codificador: "+codificador.getNome());
        System.out.println("Versao: "+codificador.getDataCriacao());
        System.out.println("Nivel de segurança: "+codificador.getNivelSeguranca());
        
        String texto2 = "PUC";
        String morse = codificador.codificar(texto2);
        String decodificar = codificador.decodificar(morse);

        System.out.println("Texto original: "+texto2);
        System.out.println("Texto codificado: "+morse);
        System.out.println("Texto decodificado: "+decodificar);

        // Teste da cifra de atbash abaixo

        CodificadorAtbash ca = new CodificadorAtbash();

        System.out.println("Codificador: "+ ca.getNome());
        System.out.println("Versao: "+ ca.getDataCriacao());
        System.out.println("Nivel de segurança: "+ca.getNivelSeguranca());
        
        String textoAtbash = "Voce sabia que onibus";
        String Atbash = ca.codificar(textoAtbash);
        String decodificaAtbash = ca.decodificar(Atbash);

        System.out.println("Texto original: "+textoAtbash);
        System.out.println("Texto codificado: "+Atbash);
        System.out.println("Texto decodificado: "+decodificaAtbash);


    }
}
