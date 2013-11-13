package br.com.delta.controller;


import br.com.delta.dao.UsuariosDAO;

import br.com.delta.modelo.Usuarios;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

/**
 * @author diangelisj
*/
@ManagedBean
@SessionScoped
public class UsuariosControlle {

     private Usuarios objUsuarios;
    private DataModel model;
   
    /**
     * Creates a new instance of UsuariosControlle
     */
    public UsuariosControlle() {
        
        this.objUsuarios = new Usuarios();
        
    }
    
    public String novaUsuarios( ) {
        this.objUsuarios= new Usuarios();
        return "/fromUsuario";
    }
public Usuarios getobjUsuarios() {
        return objUsuarios;
    }

public void setObjUsuarios(Usuarios objUsuarios) {
        this.objUsuarios = objUsuarios;
    }

     
     public String limpar() {
        this.objUsuarios = new Usuarios();
        return "fromUsuario";
    }
     
     
     public DataModel getTodos( ) throws Exception {
        UsuariosDAO dao = new UsuariosDAO( );
        model = new ListDataModel(dao.todasUsuaios());
        return model;

    }
    public Usuarios getUsuariosFromEditOrDelete( ) {
        objUsuarios = (Usuarios) model.getRowData( );
        return objUsuarios;
    }
    public String editar( ){
        objUsuarios = getUsuariosFromEditOrDelete();
        return "/fromUsuario";
    }  
    
 public String excluir( )
    throws Exception {
        UsuariosDAO dao = new UsuariosDAO( );
        objUsuarios = getUsuariosFromEditOrDelete( );
        dao.excluir(objUsuarios);
        return "/mostrarUsuarios";

    }
public String salvar( )
    throws Exception {
        UsuariosDAO dao = new UsuariosDAO( );
        if(objUsuarios.getId_usuario()==0)
            dao.salvar(objUsuarios);
        else
            dao.atualizar(objUsuarios);
        return "/mostrarUsuarios";
    }
    
}


