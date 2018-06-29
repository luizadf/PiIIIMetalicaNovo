/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Usuario;

/**
 *
 * @author a_nin
 */
public class UsuarioDao {

    private final Connection connection;

    public UsuarioDao() throws SQLException {
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "METALICA", "123456");
    }

    public String getSenha(Usuario usuario) throws SQLException {
        String query = "SELECT SENHA FROM Usuario WHERE Login = ?";
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setString(1, usuario.getLogin());
        ResultSet resultado = ps.executeQuery();

        String senha = "";
        while (resultado.next()) {
            senha = resultado.getString("senha");
        }
        resultado.close();
        ps.close();
        return senha;

    }
}
