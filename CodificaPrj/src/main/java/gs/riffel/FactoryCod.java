package gs.riffel;

import java.util.ArrayList;
import java.util.List;

public class FactoryCod {

    private static final List<Codificador> codificadores = new ArrayList<>();

    // Bloco estático para registrar todos os codificadores disponíveis
    static {
        codificadores.add(new CodificadorSimples());
        codificadores.add(new CodificadorMorse());
        codificadores.add(new CodificadorAtbash());
        codificadores.add(new CodificadorPedro());
        // Se criar novos codificadores, basta registrar aqui
    }

    /**
     * Retorna a instância de Codificador com nível de segurança mais próximo ao solicitado
     *
     * @param nivelDesejado nível de segurança desejado (1 a 100)
     * @return Codificador escolhido
     */
    public static Codificador getCodificador(int nivelDesejado) {
        Codificador escolhido = null;
        int menorDiferenca = Integer.MAX_VALUE;

        for (Codificador cod : codificadores) {
            int diferenca = Math.abs(cod.getNivelSeguranca() - nivelDesejado);
            if (diferenca < menorDiferenca) {
                menorDiferenca = diferenca;
                escolhido = cod;
            }
        }

        return escolhido;
    }
}
