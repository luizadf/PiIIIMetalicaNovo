/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import banco.Conexao;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import modelo.Aed;
import modelo.ArquivoReclamacao;
import modelo.No;
import modelo.Usuario;

/**
 *
 * @author a_nin
 */
public class ControleArquivoReclamacao {
    
    private Aed lista = new Aed();

    public Aed getLista() {
        return lista;
    }

    public void setLista(Aed lista) {
        this.lista = lista;
    }

    
    
    
    public void Reclamacao(String caminho) throws FileNotFoundException, IOException {
        
        FileInputStream stream = new FileInputStream(caminho);
        InputStreamReader reader = new InputStreamReader(stream);
        BufferedReader br = new BufferedReader(reader);
        String linha = br.readLine();

        int ultRegistro = 1; // Verificar ultimo dados no banco + 1
        while ((linha = br.readLine()) != null) {
            String reclamacao[] = new String[12];
            reclamacao = linha.split(";");

            ArquivoReclamacao novaReclamacao = new ArquivoReclamacao();
            novaReclamacao.setId(ultRegistro);
            novaReclamacao.setDataExtracao(reclamacao[0]);
            novaReclamacao.setAno(Integer.parseInt(reclamacao[1]));
            novaReclamacao.setMes(Integer.parseInt(reclamacao[2]));
            novaReclamacao.setCanalEntrada(reclamacao[3]);
            novaReclamacao.setCondicao(reclamacao[4]);
            novaReclamacao.setGrupoEconNorm(reclamacao[5]);
            novaReclamacao.setTipo(reclamacao[6]);
            novaReclamacao.setServico(reclamacao[7]);
            novaReclamacao.setModalidade(reclamacao[8]);
            novaReclamacao.setMotivo(reclamacao[9]);
            novaReclamacao.setUF(reclamacao[10]);
            novaReclamacao.setQtdeSolic(Integer.parseInt(reclamacao[11]));
            ultRegistro++;

            lista.InserirReclamacao(novaReclamacao);

        }       
        
        
        lista.ListaReclamacao();

    }



    public No getPrimeiroNo() {
        return lista.getPrimeiroNo();
    }


        
    
}
