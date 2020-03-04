package clases;

import java.io.Serializable;
import java.util.ArrayList;

public class Usuario implements Serializable {

    private String documento;
    private String nombre;
    private String usuario;
    private String correo;
    private String contraseña;

    public Usuario(String documento, String nombre, String usuario, String correo, String contraseña) {
        this.documento = documento;
        this.nombre = nombre;
        this.usuario = usuario;
        this.correo = correo;
        this.contraseña = contraseña;
    }

    public Usuario() {
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Usuario{" + "documento=" + documento + ", nombre=" + nombre + ", usuario=" + usuario + ", correo=" + correo + ", contrase\u00f1a=" + contraseña + '}';
    }

}
