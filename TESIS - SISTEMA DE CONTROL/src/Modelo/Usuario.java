/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Ezequiel
 */
public class Usuario {

    private long idusuarios;
    private String usuario;
    private String password;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getIdusuarios() {
        return idusuarios;
    }

    public void setIdusuarios(long idusuario) {
        this.idusuarios = idusuario;
    }

    public Usuario() {
    }

    ;
    
    public Usuario(String user, String pass) {
        this.setUsuario(user);
        this.setPassword(pass);

    }
;
}
