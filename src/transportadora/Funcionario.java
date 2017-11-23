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
public abstract class Funcionario {

    private String cpf;
    private String nome;
    private String telefone;
    private double Salario;

    public void calcularSalario() {

    }

    public Funcionario(String cpf, String nome, String telefone, double Salario) {
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.Salario = Salario;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public double getSalario() {
        return Salario;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }

}
