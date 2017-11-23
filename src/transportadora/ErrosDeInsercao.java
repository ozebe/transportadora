
package transportadora;

/**
 * Classe responsável pela verificação dos erros
 * Deve se passar a string a ser verificada
 * @author Wesley
 * @version 1.0
 */
public class ErrosDeInsercao {
    public static boolean ErroAoInserirSigla(String sigla){
       //return !sigla.matches("[A-Z]{2}");
       if(sigla.matches("[A-Z]{2}")){
       return false;
       } else{
       return true;
       }
    }
}
