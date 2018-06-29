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
public class Empresa {
    private int Codigo;
    private String Operadora;
    private String CNPJ;
    private String Endereco;

    public Empresa() {
        this.Codigo = 0;
        this.Operadora = "";
        this.CNPJ = "";
        this.Endereco = "";
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getOperadora() {
        return Operadora;
    }

    public void setOperadora(String Operadora) {
        this.Operadora = Operadora;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public void NovaEmpresa(int Codigo, String Operadora, String CNPJ, String Endereco) {
        this.Codigo = Codigo;
        this.Operadora = Operadora;
        this.CNPJ = CNPJ;
        this.Endereco = Endereco;
    }
    
    
    
    
    
}
