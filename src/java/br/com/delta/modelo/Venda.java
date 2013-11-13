package br.com.delta.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author diangelisj
 */
public class Venda {
    private int id_venda;
    private String observacao_venda;
    private Date data_venda;
    private Usuarios objUsuarios;
    private Cliente objCliente;
    private VendaFormaPagamento objVendaFormaPagamento;
private List<VendaItem> listaVenda;
private List<VendaFormaPagamento>listaPagamento;

    public Venda(int id_venda, String observacao_venda, Date data_venda, Usuarios objUsuarios, Cliente objCliente, VendaFormaPagamento objVendaFormaPagamento, List<VendaItem> listaVenda, List<VendaFormaPagamento> listaPagamento) {
        this.id_venda = id_venda;
        this.observacao_venda = observacao_venda;
        this.data_venda = data_venda;
        this.objUsuarios = objUsuarios;
        this.objCliente = objCliente;
        this.objVendaFormaPagamento = objVendaFormaPagamento;
        this.listaVenda = listaVenda;
        this.listaPagamento = listaPagamento;
    }
    public Venda() {
        this.id_venda = 0;
        this.observacao_venda = "";
        this.data_venda = new Date ();
        this.objUsuarios = objUsuarios;
        this.objCliente = objCliente;
        this.objVendaFormaPagamento = objVendaFormaPagamento;
        this.listaVenda = listaVenda;
        this.listaPagamento = listaPagamento;
    }

    public int getId_venda() {
        return id_venda;
    }

    public void setId_venda(int id_venda) {
        this.id_venda = id_venda;
    }

    public String getObservacao_venda() {
        return observacao_venda;
    }

    public void setObservacao_venda(String observacao_venda) {
        this.observacao_venda = observacao_venda;
    }

    public Date getData_venda() {
        return data_venda;
    }

    public void setData_venda(Date data_venda) {
        this.data_venda = data_venda;
    }
    public Usuarios getObjUsuarios() {
        return objUsuarios;
    }
    public void setObjUsuarios(Usuarios objUsuarios) {
        this.objUsuarios = objUsuarios;
    }
    public Cliente getObjCliente() {
        return objCliente;
    }
    public void setObjCliente(Cliente objCliente) {
        this.objCliente = objCliente;
    }
    public VendaFormaPagamento getObjVendaFormaPagamento() {
        return objVendaFormaPagamento;
    }
    public void setObjVendaFormaPagamento(VendaFormaPagamento objVendaFormaPagamento) {
        this.objVendaFormaPagamento = objVendaFormaPagamento;
    }
    public List<VendaItem> getListaVenda() {
        return listaVenda;
    }
    public void setListaVenda(List<VendaItem> listaVenda) {
        this.listaVenda = listaVenda;
    }
    public List<VendaFormaPagamento> getListaPagamento() {
        return listaPagamento;
    }
    public void setListaPagamento(List<VendaFormaPagamento> listaPagamento) {
        this.listaPagamento = listaPagamento;
    }


}