/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Date;

/**
 *
 * @author maria
 */
public abstract class Clientes {
    private String nome;
    private String endereco;
    
    public Clientes(){
        
    }
    
    public abstract String getCPFcnpj();
    public abstract String getCNH();
    public abstract Date getDtNasc();
    public abstract double getDesconto();
    public abstract String getDtNascPJ();
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
