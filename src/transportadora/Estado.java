/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportadora;

import java.util.ArrayList;

/**
 *
 * @author Wesley
 */
public class Estado {

    private String sigla;
    private String nome;
    private ArrayList<Cidade> cidades;
 
    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estado() {
        this.cidades = new ArrayList<Cidade>();
        sigla = "";
        nome = "";
        
    }

    public Estado(String sigla, String nome) {
        this.cidades = new ArrayList<Cidade>();
        this.sigla = sigla;
        this.nome = nome;

    }

    public void setCidades(ArrayList<Cidade> cidades) {
        this.cidades = cidades;
    }

    public void incluirCidade(Cidade cidade) {
        if (cidade == null) {
            return;
        }
        cidades.add(cidade);
    }

    public ArrayList<Cidade> getCidades() {
        return cidades;
    }

    public int tamanhoCidades() {
        return cidades.size();
    }

}
