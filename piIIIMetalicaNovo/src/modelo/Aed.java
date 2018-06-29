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
public class Aed {
    private No primeiroNo;

    public Aed(){
    }
    
    public void InserirReclamacao(ArquivoReclamacao reclamacao){
        if(this.primeiroNo == null){
            primeiroNo = new No();
            primeiroNo.setReclamacao(reclamacao);
        }else{
            primeiroNo.setNovaReclamacao(reclamacao);
        }
    }
    
   
    public void ListaReclamacao() {
        No temporarioNo = new No();
        temporarioNo = this.primeiroNo;
        while(temporarioNo != null){
            System.out.println(temporarioNo.getReclamacao().getServico());
            temporarioNo = temporarioNo.getNovoNo();
        }
    }

    public No getPrimeiroNo() {
        return this.primeiroNo;
    }

    
}
