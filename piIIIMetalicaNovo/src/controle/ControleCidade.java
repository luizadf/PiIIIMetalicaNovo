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
import modelo.Cidade;
import modelo.Empresa;

/**
 *
 * @author yuri.miyazaki
 */
public class ControleCidade {
    Conexao connect = new Conexao();
    public ControleCidade(){
        
    }

    public boolean Cadastrar(Cidade novaCidade) {
        
        if(!"".equals(novaCidade.getRegiao()) && !"".equals(novaCidade.getEstado()) && novaCidade.getCodigo() != 0 && !"".equals(novaCidade.getCidade())){
            CadastrarCidade(novaCidade);
            return true;
        }
        
        return false;
    }
    
    
    public void CadastrarCidade(Cidade novaCidade){
        try {

        // O parametro é que indica se deve sobrescrever ou continua no
        // arquivo.
        FileWriter fw = new FileWriter(connect.getTabelaCidade(), true);
            try (BufferedWriter conexao = new BufferedWriter(fw)) {
                conexao.newLine();
                conexao.write(novaCidade.getRegiao());
                conexao.write(";");
                conexao.write(novaCidade.getEstado());
                conexao.write(";");
                conexao.write(Integer.toString(novaCidade.getCodigo()));
                conexao.write(";");
                conexao.write(novaCidade.getCidade());
            }
        } catch (IOException e) {
        }
    }
    
    
    
}
