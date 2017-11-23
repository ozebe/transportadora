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
public class AddAuxiliar extends Funcionario{
    
    /**
     * Classe para adicionar o auxiliar
     * 
     * @version 1.0 beta
     * @param cpf cpf a ser passado no construtor da classe
     * @param nome nome a ser passado no construttor da classe
     * @param telefone telefone do auxiliar, (passado por string)
     * @param Salario salario fixo a ser passado no construtor, em double
     * @param valorHora valor por hora que o auxiliar recebe
     * @param horasTrabalhadas quantia de horas que o auxiliar autou na carga ou descarga
     * @author Wesley Ozebe
     */
    private double valorHora;
    private double horasTrabalhadas;
    public AddAuxiliar(String cpf, String nome, String telefone, double Salario, double valorHora, double horasTrabalhadas) {
        super(cpf, nome, telefone, Salario);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
   
    
}
