/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.modelo.negocio;

/**
 *
 * @author gustavo_monteiro
 */
public class Modelo {
    
    private int id;
    private String descricao;
    private int portencia;
    private Marca marca;
    
    public Modelo() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getPortencia() {
        return portencia;
    }

    public void setPortencia(int portencia) {
        this.portencia = portencia;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
    
}
