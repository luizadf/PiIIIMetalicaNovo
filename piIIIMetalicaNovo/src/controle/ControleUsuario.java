/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import banco.Conexao;
import banco.UsuarioDao;
import java.sql.SQLException;
import modelo.Usuario;


/**
 *
 * @author yuri.miyazaki
 */
public class ControleUsuario {
    Conexao connect = new Conexao();
    
    String login;
    String senha;
    
    public void setUser(String login, String senha){
        this.login = login;
        this.senha = senha;
    }

    public ControleUsuario(){
    }

    public boolean Autenticar(Usuario usuario) throws SQLException {
        UsuarioDao buscarUserBd = new UsuarioDao();
        return usuario.getSenha().equals(buscarUserBd.getSenha(usuario));
    }
    

}
    
    
    

