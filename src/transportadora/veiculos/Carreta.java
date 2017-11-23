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
public class Carreta extends Veiculo{
    private int capPeso;
    private int capCarga;
    private int eixos;

    public Carreta(int capPeso, int capCarga, int eixos, String placa) {
        super(placa);
        this.capPeso = capPeso;
        this.capCarga = capCarga;
        this.eixos = eixos;
    }

    

    public int getCapPeso() {
        return capPeso;
    }

    public void setCapPeso(int capPeso) {
        this.capPeso = capPeso;
    }

    public int getCapCarga() {
        return capCarga;
    }

    public void setCapCarga(int capCarga) {
        this.capCarga = capCarga;
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }
    
}
