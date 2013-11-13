/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.delta.controller;

import br.com.delta.dao.UsuariosDAO;
//import br.com.delta.modelo.PessoaFisica;
import br.com.delta.modelo.Usuarios;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author diangelisj
 */
@ManagedBean
@SessionScoped
public class LoginController {

    /**
     * Creates a new instance of LoginController
     */
    private Usuarios usuarios;
    public LoginController() {
        this.usuarios = new Usuarios();
    }
    
    public Usuarios getUsuario() {
        return usuarios;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }
    
    
    public String acaoSair() {
        this.usuarios = new Usuarios();
        return "login";
    }
    
    public String acaoLogar() throws Exception {
        UsuariosDAO usuariosDAO = new UsuariosDAO();
        if (usuariosDAO.loginUsuario(getUsuario())) {
            return "index";
        }
        else {
            FacesContext.getCurrentInstance().
                    addMessage(null, new FacesMessage("Usuario ou Senha Invalido(s)"));
            return "login";
        }
    }
}
