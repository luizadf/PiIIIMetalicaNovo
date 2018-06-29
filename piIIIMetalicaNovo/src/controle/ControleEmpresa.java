/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import banco.Conexao;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import modelo.Empresa;

/**
 *
 * @author yuri.miyazaki
 */
public class ControleEmpresa {
    
    Conexao connect = new Conexao();
    
    public ControleEmpresa(){
        
    }

    public boolean Nova(Empresa novaEmpresa) {
    
        
    if(novaEmpresa.getCodigo() != 0 && !"".equals(novaEmpresa.getOperadora()) && !"".equals(novaEmpresa.getCNPJ()) && !"".equals(novaEmpresa.getEndereco())){
        Cadastrar(novaEmpresa);
        return true;
    }
        return false;
    }
    
    public void Cadastrar(Empresa novaEmpresa){
        try {

        // O parametro é que indica se deve sobrescrever ou continua no
        // arquivo.
        FileWriter fw = new FileWriter(connect.getTabelaOperadora(), true);
            try (BufferedWriter conexao = new BufferedWriter(fw)) {
                conexao.newLine();
                conexao.write(Integer.toString(novaEmpresa.getCodigo()));
                conexao.write(";");
                conexao.write(novaEmpresa.getOperadora());
                conexao.write(";");
                conexao.write(novaEmpresa.getCNPJ());
                conexao.write(";");
                conexao.write(novaEmpresa.getEndereco());
            }
        } catch (IOException e) {
        }
    }

    
    
}
