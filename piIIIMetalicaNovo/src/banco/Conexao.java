/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

/**
 *
 * @author yuri.miyazaki
 */
public class Conexao {
    private String path;
    private String tabelaUsuario;
    private String tabelaOperadora;
    private String tabelaCidade;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Conexao() {
        this.path = "C:\\Users\\a_nin\\Downloads\\Pi III\\Projeto Java\\PiIIIMetalica\\build\\classes\\banco\\";
        this.tabelaUsuario = (path + "Usuario.CSV");
        this.tabelaOperadora = (path + "Operadora.CSV");
        this.tabelaCidade = (path + "Cidade.CSV");
    }

    public String getTabelaCidade() {
        return tabelaCidade;
    }

    public void setTabelaCidade(String tabelaCidade) {
        this.tabelaCidade = tabelaCidade;
    }

    public String getTabelaUsuario() {
        return tabelaUsuario;
    }

    public void setTabelaUsuario(String tabelaUsuario) {
        this.tabelaUsuario = tabelaUsuario;
    }

    public String getTabelaOperadora() {
        return tabelaOperadora;
    }

    public void setTabelaOperadora(String tabelaOperadora) {
        this.tabelaOperadora = tabelaOperadora;
    }

    public int QtdLinhaOperadora() throws FileNotFoundException, IOException{
        File arquivoLeitura = new File(getTabelaOperadora());
        LineNumberReader linhaLeitura = new LineNumberReader(new FileReader(arquivoLeitura));
        linhaLeitura.skip(arquivoLeitura.length());
        return linhaLeitura.getLineNumber()+1;
    }
    
    
    
}
