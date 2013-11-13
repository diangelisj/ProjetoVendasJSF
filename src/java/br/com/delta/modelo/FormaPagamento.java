package br.com.delta.modelo;

/**
 *
 * @author diangelisj
 */

public class FormaPagamento {
    
    private int id_forma_pagamento;
    private String descricao_pagamento;

    public FormaPagamento(int id_forma_pagamento, String descricao_pagamento) {
        this.id_forma_pagamento = id_forma_pagamento;
        this.descricao_pagamento = descricao_pagamento;
    }

    public FormaPagamento() {
        
        this.id_forma_pagamento = 0;
        this.descricao_pagamento = "";
    }

    public String getDescricao_pagamento() {
        return descricao_pagamento;
    }

    public void setDescricao_pagamento(String descricao_pagamento) {
        this.descricao_pagamento = descricao_pagamento;
    }

    public int getId_forma_pagamento() {
        return id_forma_pagamento;
    }

    public void setId_forma_pagamento(int id_forma_pagamento) {
        this.id_forma_pagamento = id_forma_pagamento;
    }
    
}