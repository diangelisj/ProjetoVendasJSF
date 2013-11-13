package br.com.delta.modelo;

/**
 * 
 * @author diangelisj
 * 
*/
public class VendaFormaPagamento {

    private int id_venda_forma_pagamento;
    private String valor_descricao;
    private VendaItem objVendas;
    private FormaPagamento objPagamento;

    public VendaFormaPagamento(int id_venda_forma_pagamento, String valor_descricao, VendaItem objVendas, FormaPagamento objPagamento) {
        this.id_venda_forma_pagamento = id_venda_forma_pagamento;
        this.valor_descricao = valor_descricao;
        this.objVendas = objVendas;
        this.objPagamento = objPagamento;
    }

    public VendaFormaPagamento() {
        this.id_venda_forma_pagamento = 0;
        this.valor_descricao ="";
        this.objVendas =  new VendaItem();
        this.objPagamento = new FormaPagamento();
    }

    public int getId_venda_forma_pagamento() {
        return id_venda_forma_pagamento;
    }

    public void setId_venda_forma_pagamento(int id_venda_forma_pagamento) {
        this.id_venda_forma_pagamento = id_venda_forma_pagamento;
    }

    public String getValor_descricao() {
        return valor_descricao;
    }

    public void setValor_descricao(String valor_descricao) {
        this.valor_descricao = valor_descricao;
    }

    public VendaItem getObjVendas() {
        return objVendas;
    }

    public void setObjVendas(VendaItem objVendas) {
        this.objVendas = objVendas;
    }

    public FormaPagamento getObjPagamento() {
        return objPagamento;
    }

    public void setObjPagamento(FormaPagamento objPagamento) {
        this.objPagamento = objPagamento;
    }
                
}