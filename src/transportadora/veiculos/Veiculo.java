/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportadora.veiculos;

/**
 *
 * @author Wesley
 */
public abstract class Veiculo {
    private String placa;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Veiculo(String placa) {
        this.placa = placa;
    }
    
    
    
}
