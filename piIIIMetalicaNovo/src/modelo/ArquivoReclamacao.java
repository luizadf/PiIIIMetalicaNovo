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
public class ArquivoReclamacao {
    private int Id;
    private String dataExtracao;
    private int ano;
    private int mes;
    private String canalEntrada;
    private String condicao;
    private String grupoEconNorm;
    private String tipo;
    private String servico;
    private String modalidade;
    private String motivo;
    private String UF;
    private int qtdeSolic;
    //12 colunas
    public ArquivoReclamacao(){
        this.Id = 0;
        this.dataExtracao = "";
        this.ano = 0;
        this.mes = 0;
        this.canalEntrada = "";
        this.condicao = "";
        this.grupoEconNorm = "";
        this.tipo = "";
        this.servico = "";
        this.modalidade = "";
        this.motivo = "";
        this.UF = "";
        this.qtdeSolic = 0;
    }

    public String getDataExtracao() {
        return dataExtracao;
    }

    public void setDataExtracao(String dataExtracao) {
        this.dataExtracao = dataExtracao;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public String getCanalEntrada() {
        return canalEntrada;
    }

    public void setCanalEntrada(String canalEntrada) {
        this.canalEntrada = canalEntrada;
    }

    public String getCondicao() {
        return condicao;
    }

    public void setCondicao(String condicao) {
        this.condicao = condicao;
    }

    public String getGrupoEconNorm() {
        return grupoEconNorm;
    }

    public void setGrupoEconNorm(String grupoEconNorm) {
        this.grupoEconNorm = grupoEconNorm;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public int getQtdeSolic() {
        return qtdeSolic;
    }

    public void setQtdeSolic(int qtdeSolic) {
        this.qtdeSolic = qtdeSolic;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }
    
    
    
    
}
