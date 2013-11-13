package br.com.delta.modelo;

/**
 *
 * @author diangelisj 
 * 
*/

public class VendaItem {
    private int id_item;
    private double quantidade;
    private Produto objProduto;
    private Venda objVenda;

    public VendaItem(int id_item, Produto objProduto, double quantidade, Venda objVenda) {
        this.id_item = id_item;
        this.objProduto = objProduto;
        this.quantidade = quantidade;
        this.objVenda = objVenda;
    }

    public VendaItem() {        
        this.id_item = 0;
        this.objProduto = new Produto();
        this.quantidade = 0;
        this.objVenda = new Venda();
    
    }

    public int getId_item() {
        return id_item;
    }

    public void setId_item(int id_item) {
        this.id_item = id_item;
    }

    public Produto getObjProduto() {
        return objProduto;
    }

    public void setObjProduto(Produto objProduto) {
        this.objProduto = objProduto;
    }

    public Venda getObjVenda() {
        return objVenda;
    }

    public void setObjVenda(Venda objVenda) {
        this.objVenda = objVenda;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }
    
    
    
    
    
}
