/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportadora;

import static transportadora.AddCidade.estado;

/**
 *
 * @author Wesley
 */
public class BuscarEstadoCidade {

    public static int buscaPorEstado(String nomeEstado) {
        /**
         * Classe responsável pela busca de nome em estado
         * @param nomeEstado nome do estado a ser pesquisado
         * @version 1.0 beta
         * @author Wesley Ozebe
         */
        for (int n = 0; n < AddCidade.estado.size(); n++) {
            if (estado.get(n).getNome().equals(nomeEstado)) {
                return 1;
            }
        }
        return 0;
    }

    public static int buscaPorCidade(String nomeCidade) {
        /**
         * Classe responsável pela busca de uma cidade em um estado
         * esse método deve ser utilizado para a busca geral, pois busca em todos os estados
         * @param nomeCidade nome da cidade a ser pesquisada
         * @version 1.0 beta
         * @author Wesley Ozebe
         */
        for (int n = 0; n < AddCidade.estado.size(); n++) {
            if (estado.get(n).getCidades().get(n).getNome().equals(nomeCidade)) {
                return 1;
            }
        }
        return 0;
    }
}
