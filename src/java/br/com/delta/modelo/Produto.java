/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.delta.modelo;

/**
 *
 * @author diangelisj
 */
public class Produto {

    private int id_produto;
    private String desc_produto;
    private double valor_produto;

    public Produto(int id_produto, String desc_produto, double valor_produto) {
        this.id_produto = id_produto;
        this.desc_produto = desc_produto;
        this.valor_produto = valor_produto;
    }

    public Produto() {


        this.id_produto = 0;
        this.desc_produto = "";
        this.valor_produto = 0;
    }

    public String getDesc_produto() {
        return desc_produto;
    }

    public void setDesc_produto(String desc_produto) {
        this.desc_produto = desc_produto;
    }

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public double getValor_produto() {
        return valor_produto;
    }

    public void setValor_produto(double valor_produto) {
        this.valor_produto = valor_produto;
    }
    
      @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produto other = (Produto) obj;
        if (this.id_produto != other.id_produto) {
            return false;
        }
        return true;
    }
}
