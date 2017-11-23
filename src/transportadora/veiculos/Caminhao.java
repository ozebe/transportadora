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
public class Caminhao extends Veiculo{
    private int capPeso;
    private int capVolume;

    public Caminhao(String placa) {
        super(placa);
    }

    public int getCapPeso() {
        return capPeso;
    }

    public void setCapPeso(int capPeso) {
        this.capPeso = capPeso;
    }

    public int getCapVolume() {
        return capVolume;
    }

    public void setCapVolume(int capVolume) {
        this.capVolume = capVolume;
    }
    
}
