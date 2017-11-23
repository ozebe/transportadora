/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportadora;

/**
 *
 * @author Wesley
 */
public class Motorista extends Funcionario {

    private String CNH;
    private double valorDiaria;
    private int diarias;
    boolean emViagem = false;
    public Motorista(String cpf, String nome, String telefone, double Salario, String CNH) {
        super(cpf, nome, telefone, Salario);
    }
    

    public String getCNH() {
        return CNH;
    }

    public void setCNH(String CNH) {
        this.CNH = CNH;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public int getDiarias() {
        return diarias;
    }

    public void setDiarias(int diarias) {
        this.diarias = diarias;
    }

    public boolean isEmViagem() {
        return emViagem;
    }

    public void setEmViagem(boolean emViagem) {
        this.emViagem = emViagem;
    }
    

}
