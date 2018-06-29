/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author a_nin
 */
public class No {
    private No novoNo;
    private ArquivoReclamacao reclamacao;

    public No getNovoNo() {
        return novoNo;
    }

    public void setNovoNo(No novoNo) {
        this.novoNo = novoNo;
    }

    public ArquivoReclamacao getReclamacao() {
        return reclamacao;
    }

    public void setReclamacao(ArquivoReclamacao reclamacao) {
        this.reclamacao = reclamacao;
    }

    void setNovaReclamacao(ArquivoReclamacao reclamacao) {
            if(this.novoNo == null){
            novoNo = new No();
            novoNo.setReclamacao(reclamacao);
        }else{
            novoNo.setNovaReclamacao(reclamacao);
        }
    }


    
    
    
    
}
