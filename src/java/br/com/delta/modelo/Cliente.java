/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.delta.modelo;

/**
 *
 * @author diangelisj
 */ 
public class Cliente {
    private int id_cliente;
    private String nome;
    private String cpf;
    private String tel_residencial;
    private String tel_celular;
    private String tel_comercial;

    public Cliente(int id_cliente, String nome, String cpf, String tel_residencial, String tel_celular, String tel_comercial) {
        this.id_cliente = id_cliente;
        this.nome = nome;
        this.cpf = cpf;
        this.tel_residencial = tel_residencial;
        this.tel_celular = tel_celular;
        this.tel_comercial = tel_comercial;
    }

    public Cliente() {
    
    
    this.id_cliente = 0;
        this.nome = "";
        this.cpf = "";
        this.tel_residencial = "";
        this.tel_celular = "";
        this.tel_comercial = "";
    
}

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTel_celular() {
        return tel_celular;
    }

    public void setTel_celular(String tel_celular) {
        this.tel_celular = tel_celular;
    }

    public String getTel_comercial() {
        return tel_comercial;
    }

    public void setTel_comercial(String tel_comercial) {
        this.tel_comercial = tel_comercial;
    }

    public String getTel_residencial() {
        return tel_residencial;
    }

    public void setTel_residencial(String tel_residencial) {
        this.tel_residencial = tel_residencial;
    }
    
  @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (this.id_cliente != other.id_cliente) {
            return false;
        }
        return true;
    }
}
