package clases;

import java.io.Serializable;
import java.util.ArrayList;

public class Cliente implements Serializable{
    private String id;
    private String nombre;

    public Cliente(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Cliente() {
    }
    

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    ArrayList<Credito> listaCC = new ArrayList();

    public ArrayList<Credito> getListaCC() {
        return listaCC;
    }

    public void setListaCC(ArrayList<Credito> listaCC) {
        this.listaCC = listaCC;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", id=" + id;
    }

}
