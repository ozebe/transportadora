/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportadora;

import java.util.Date;

/**
 *
 * @author Wesley
 */
public class Viagem {

    private Date saida;
    private Date chegada;
    private double peso;
    private double volume;
    Motorista motorista;
    
    public Date getSaida() {
        return saida;
    }

    public void setSaida(Date saida) {
        this.saida = saida;
    }

    public Date getChegada() {
        return chegada;
    }

    public void setChegada(Date chegada) {
        this.chegada = chegada;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public Viagem(Date saida, double peso, double volume, Motorista motorista) {
        this.saida = saida;
        this.motorista = motorista;
        this.peso = peso;
        this.volume = volume;
    }
    
    
}
