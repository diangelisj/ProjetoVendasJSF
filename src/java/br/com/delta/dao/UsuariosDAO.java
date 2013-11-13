package br.com.delta.dao;

import br.com.delta.modelo.Usuarios;
import br.com.delta.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author diangelisj
 * 
*/
public class UsuariosDAO {
    private Connection conn;
    
     public UsuariosDAO() throws Exception {
        try {
            this.conn = ConnectionFactory.getConnection();
        } catch (Exception e) {
            throw new Exception("Erro: "
                    + "\n" + e.getMessage());
        }
     }
    
    public boolean loginUsuario(Usuarios usuarios)
            throws Exception {
        PreparedStatement ps = null;
        ResultSet rs = null;
        boolean retornoLogin = false;
        try {
            ps = this.conn.prepareStatement("select * from usuarios where login=? AND senha=?");
            ps.setString(1, usuarios.getLogin_uruario());
            ps.setString(2, usuarios.getSenha_usuario());
            rs = ps.executeQuery();
            if (rs.next()) {
                retornoLogin = true;
            }
            else {
                retornoLogin = false;
            }

            return retornoLogin;

        } catch (SQLException sqle) {
            throw new Exception(sqle);
        } finally {
            ConnectionFactory.closeConnection(this.conn, ps, rs);

        }

}

    public void salvar(Usuarios objUsuarios) throws Exception {
        PreparedStatement ps = null;
        if (objUsuarios == null) {
            throw new Exception("Erro!! não pode passar nulo.");
        }

try {
    
    String SQL = "INSERT INTO usuarios (login, senha) "
            + "values (?,?)";
    ps = this.conn.prepareStatement(SQL);
    ps.setString(1, objUsuarios.getLogin_uruario());
    ps.setString(2, objUsuarios.getSenha_usuario());
    ps.executeUpdate();

} catch (SQLException sqle) {
    throw new Exception("Erro ao inserir dados " + sqle);
} finally {
    ConnectionFactory.closeConnection(this.conn, ps);
}    
 
}
 public void atualizar(Usuarios objUsuarios) throws Exception {
        PreparedStatement ps = null;
        try {
            String SQL = "UPDATE usuarios SET login=?, senha=? "
                    + "where id_usuario=?";
            ps = this.conn.prepareStatement(SQL);
    ps.setString(1, objUsuarios.getLogin_uruario());
    ps.setString(2, objUsuarios.getSenha_usuario());
    ps.setInt(3, objUsuarios.getId_usuario());

            ps.executeUpdate();

        } catch (SQLException sqle) {
            throw new Exception("Erro ao atualizar dados: " + sqle);
        } finally {
            ConnectionFactory.closeConnection(this.conn, ps);

        }
    }  
  
   public List todasUsuaios() throws Exception {
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = this.conn.prepareStatement("select * from usuarios");
            rs = ps.executeQuery();
            List<Usuarios> list = new ArrayList<Usuarios>();
            while (rs.next()) {
                Integer id = rs.getInt(1);
               String login_uruario = rs.getString(2);
               String senha_usuario = rs.getString(3);
                              
               list.add(new Usuarios(id, login_uruario, senha_usuario));
            }
            return list;

        } catch (SQLException sqle) {
            throw new Exception(sqle);
        } finally {
            ConnectionFactory.closeConnection(this.conn, ps, rs);
        }
    }
public void excluir(Usuarios objUsuarios) throws Exception {
        PreparedStatement ps = null;

        if (objUsuarios == null) {
            throw new Exception("O valor passado não pode ser nulo");
        }

        try {
            ps = this.conn.prepareStatement("delete from usuarios where id_usuario=?");
            ps.setInt(1, objUsuarios.getId_usuario());
            ps.executeUpdate();


        } catch (SQLException sqle) {
            throw new Exception("Erro ao excluir dados:" + sqle);

        } finally {
            ConnectionFactory.closeConnection(this.conn, ps);
        }

    }

 public Usuarios procurarUsuarios(Integer id)
            throws Exception {
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = this.conn.prepareStatement("select * from usuraios where id_usuario=?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (!rs.next()) {
                throw new Exception("Não foi encontrado nenhum"
                        + " registro com o ID: " + id);
            }

            String login_uruario = rs.getString(2);
            String senha_usuario = rs.getString(3);
            
            return new Usuarios(id, login_uruario, senha_usuario);

        } catch (SQLException sqle) {
            throw new Exception(sqle);
        } finally {
            ConnectionFactory.closeConnection(this.conn, ps, rs);

        }
    }
}