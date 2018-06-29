/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author yuri.miyazaki
 */
public class Cidade {
    private String regiao;
    private String estado;
    private int codigo;
    private String cidade;

    public Cidade(){
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void Inserir(String regiao, String estado, int codigo, String cidade) {
        this.regiao = regiao;
        this.estado = estado;
        this.codigo = codigo;
        this.cidade = cidade;
    }
    
    
    
    
}
