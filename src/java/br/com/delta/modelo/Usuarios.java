package br.com.delta.modelo;

/**
 *
 * @author diangelisj
 */
public class Usuarios {
    private int id_usuario;
    private String login_uruario;
    private String senha_usuario;

    public Usuarios(int id_usuario, String login_uruario, String senha_usuario) {
        this.id_usuario = id_usuario;
        this.login_uruario = login_uruario;
        this.senha_usuario = senha_usuario;
    }

    public Usuarios() {
        this.id_usuario = 0;
        this.login_uruario = "";
        this.senha_usuario = "";
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getLogin_uruario() {
        return login_uruario;
    }

    public void setLogin_uruario(String login_uruario) {
        this.login_uruario = login_uruario;
    }

    public String getSenha_usuario() {
        return senha_usuario;
    }

    public void setSenha_usuario(String senha_usuario) {
        this.senha_usuario = senha_usuario;
    }
    
    
    
}
