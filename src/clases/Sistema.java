 package clases;

import java.io.Serializable;
import java.util.ArrayList;

public class Sistema implements Serializable {
    // private Usuarios usuario;
    // private Clientes cliente;
    // private Creditos credito;
    //private Abonos  abono;

    ArrayList<Usuario> listaUsuarios = new ArrayList();
    ArrayList<Cliente> listaClientes = new ArrayList();
    
    public Sistema() {
    }
    
    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }
    
    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }
    
    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }
    
    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }
    
    public void agregarUsuario(String documento, String nombre, String usuario, String correo, String contraseña) {
        this.listaUsuarios.add(new Usuario(documento, nombre, usuario, correo, contraseña));
    }
    
    public Usuario mostrarUsuario(String documento) {
        int indi = -1;
        Usuario usuario = null;
        for (Usuario objUsu : this.listaUsuarios) {
            if (objUsu.getDocumento().equals(documento)) {
                indi = this.listaUsuarios.indexOf(objUsu);
            }
        }
        
        if (indi >= 0) {
            usuario = this.listaUsuarios.get(indi);
            
        }
        return usuario;
    }

    public void limpiarlistaUsuarios() {
        this.listaUsuarios.clear();
    }

    public boolean quitarUsuario(String documento) {
        boolean f = false;
        int indi = -1;
        for (Usuario objUsu : this.listaUsuarios) {
            if (objUsu.getDocumento().equals(documento)) {
                indi = this.listaUsuarios.indexOf(objUsu);
            }
        }
        
        if (indi >= 0) {
            this.listaUsuarios.remove(indi);
            f = true;
        }
        return f;
    }
    
    public void editarUsuario(String documento, String nombre, String usuario, String correo, String contraseña) {
        int indi = -1;
        for (Usuario objUsu : this.listaUsuarios) {
            if (objUsu.getDocumento().equals(documento)) {
                indi = this.listaUsuarios.indexOf(objUsu);
            }
        }
        
        if (indi >= 0) {
            Usuario objUsuarios = this.listaUsuarios.get(indi);
            objUsuarios.setDocumento(documento);
            objUsuarios.setUsuario(usuario);
            objUsuarios.setNombre(nombre);
            objUsuarios.setCorreo(correo);
            objUsuarios.setContraseña(contraseña);
        }
    }
    
    public void agregarCliente(String id, String nombre) {
        this.listaClientes.add(new Cliente(id, nombre));
    }
    
    public Cliente mostrarCliente(String id) {
        Cliente cliente = null;
        int indi = -1;
        for (Cliente objClientes : this.listaClientes) {
            if (objClientes.getId().equals(id)) {
                indi = this.listaClientes.indexOf(objClientes);
            }
        }
        
        if (indi >= 0) {
            cliente = this.listaClientes.get(indi);
            
        }
        return cliente;
    }
    
    public void editarCliente(String id, String nombre) {
        int indi = -1;
        for (Cliente objClientes : this.listaClientes) {
            if (objClientes.getId().equals(id)) {
                indi = this.listaClientes.indexOf(objClientes);
            }
        }
        
        if (indi >= 0) {
            Cliente objClientes = this.listaClientes.get(indi);
            objClientes.setId(id);
            objClientes.setNombre(nombre);
        }
    }
    
    public boolean quitarCliente(String id) {
        int indi = -1;
        boolean quitado = false;
        for (Cliente objClientes : this.listaClientes) {
            if (objClientes.getId().equals(id)) {
                indi = this.listaClientes.indexOf(objClientes);
            }
        }
        
        if (indi >= 0) {
            this.listaClientes.remove(indi);
            quitado = true;
        }
        return quitado;
    }
    
    public void limpiarListaClientes() {
        this.listaClientes.clear();
    }
    
    public void agregarCreditos(String id, String codigo, String fecha, double valorCredito, int intereses, int numeroCuotas) {
        int indi = -1;
        for (Cliente objClientes : this.listaClientes) {
            if (objClientes.getId().equals(id)) {
                indi = this.listaClientes.indexOf(objClientes);
            }
        }
        if (indi >= 0) {
            Cliente objClientes = this.listaClientes.get(indi);
            double valorAdecuado = valorCredito + ((valorCredito * intereses) / 100);
            double valorCuota = valorAdecuado / numeroCuotas;
            objClientes.listaCC.add(new Credito(codigo, fecha, valorCredito, intereses, valorAdecuado, numeroCuotas, valorCuota));
        }
        
    }
    
    public Credito mostrarCreditos(String id,String codigoC) {
        Credito credito=null;
        int indi = -1;
        for (Cliente objClientes : this.listaClientes) {
            if (objClientes.getId().equals(id)) {
                indi = this.listaClientes.indexOf(objClientes);
            }
        }
        if (indi >= 0) {
            Cliente objClientes = this.listaClientes.get(indi);
            int ind=-1;
             for (Credito objCredito : objClientes.listaCC) {
                if (objCredito.getCodigoC().equals(codigoC)) {
                    ind = objClientes.listaCC.indexOf(objCredito);
                }
                
            }
            if (ind >= 0) {
                credito=objClientes.listaCC.get(ind);
            }
            
        }
        return credito;
    }
    
    public void editarCreditos(String id, String codigoC, String fecha, double valorCredito, int intereses, int numeroCuotas) {
        int indi = -1;
        for (Cliente objClientes : this.listaClientes) {
            if (objClientes.getId().equals(id)) {
                indi = this.listaClientes.indexOf(objClientes);
            }
        }
        if (indi >= 0) {
            int ind = -1;
            Cliente objCliente = this.listaClientes.get(indi);
            
            for (Credito objCredito : objCliente.listaCC) {
                if (objCredito.getCodigoC().equals(codigoC)) {
                    ind = objCliente.listaCC.indexOf(objCredito);
                }
                
            }
            if (ind >= 0) {
                
                Credito objCredito = objCliente.listaCC.get(ind);
                double valorAdecuado = valorCredito + ((valorCredito * intereses) / 100);
                double valorCuota = valorAdecuado / numeroCuotas;
                
                objCredito.setCodigoC(codigoC);
                objCredito.setValorAdecuado(valorAdecuado);
                objCredito.setValorCuota(valorCuota);
                objCredito.setFecha(fecha);
                objCredito.setIntereses(intereses);
                objCredito.setNumeroCuotas(numeroCuotas);
                
            }
        }
        
    }
    
    public boolean quitarCredito(String id, String codigoC) {
        int indi = -1;
        boolean f = false;
        for (Cliente objClientes : this.listaClientes) {
            if (objClientes.getId().equals(id)) {
                indi = this.listaClientes.indexOf(objClientes);
            }
        }
        if (indi >= 0) {
            int ind = -1;
            Cliente objCliente = this.listaClientes.get(indi);
            
            for (Credito objCredito : objCliente.listaCC) {
                if (objCredito.getCodigoC().equals(codigoC)) {
                    ind = objCliente.listaCC.indexOf(objCredito);
                }
                
            }
            if (ind >= 0) {
                
                objCliente.listaCC.remove(ind);
                f = true;
            }
        }
        
        return f;
    }
    
    public void limpiarCreditos() {
        Cliente objCliente = new Cliente();
        objCliente.listaCC.clear();
    }
    
    public void agregarAbono(String id, String codigoC, double abono, String codigoA, String fecha,double saldo) {
        int indi = -1;
        for (Cliente objCliente : this.listaClientes) {
            if (objCliente.getId().equals(id)) {
                indi = this.listaClientes.indexOf(objCliente);
            }
        }
        if (indi >= 0) {
            Cliente objCliente = this.listaClientes.get(indi);
            int ind = -1;
            for (Credito objCredito : objCliente.listaCC) {
                if (objCredito.getCodigoC().equals(codigoC)) {
                    ind = objCliente.listaCC.indexOf(objCredito);
                }
                
            }
            if (ind >= 0) {
                Credito objCredito = objCliente.listaCC.get(ind);
                double saldot = saldo - (abono);
                objCredito.listaAC.add(new Abono(abono, codigoA, fecha, saldot));
            }
        }
    }
    
    public Abono mostrarAbono(String id, String codigoC, String codigoA) {
        Abono abono=null;
        int indi = -1;
        for (Cliente objCliente : this.listaClientes) {
            if (objCliente.getId().equals(id)) {
                indi = this.listaClientes.indexOf(objCliente);
            }
        }
        if (indi >= 0) {
            Cliente objCliente = this.listaClientes.get(indi);
            int ind = -1;
            for (Credito objCredito : objCliente.listaCC) {
                if (objCredito.getCodigoC().equals(codigoC)) {
                    ind = objCliente.listaCC.indexOf(objCredito);
                }
                
            }
            if (ind >= 0) {
                Credito objCredito = objCliente.listaCC.get(ind);
                 int in = -1;
                for (Abono objAbono : objCredito.listaAC) {
                    if (objAbono.getCodigoA().equals(codigoA)) {
                        in = objCredito.listaAC.indexOf(objAbono);
                    }
                }
                if (in >= 0) {
                    abono = objCredito.listaAC.get(in);
                   
                }
                
            }
        }
        return abono;
    }
    
    public boolean quitarAbono(String id, String codigoC, String codigoA) {
        boolean f=false;
        int indi = -1;
        for (Cliente objCliente : this.listaClientes) {
            if (objCliente.getId().equals(id)) {
                indi = this.listaClientes.indexOf(objCliente);
            }
        }
        if (indi >= 0) {
            Cliente objCliente = this.listaClientes.get(indi);
            int ind = -1;
            for (Credito objCredito : objCliente.listaCC) {
                if (objCredito.getCodigoC().equals(codigoC)) {
                    ind = objCliente.listaCC.indexOf(objCredito);
                }
                
            }
            if (ind >= 0) {
                Credito objCredito = objCliente.listaCC.get(ind);
                objCredito.listaAC.remove(ind);
                f=true;
            }
        }
        return f;
    }
    
    public void editarAbono(String id, String codigoC, double abono, String codigoA, String fecha) {
        int indi = -1;
        for (Cliente objCliente : this.listaClientes) {
            if (objCliente.getId().equals(id)) {
                indi = this.listaClientes.indexOf(objCliente);
            }
        }
        if (indi >= 0) {
            Cliente objCliente = this.listaClientes.get(indi);
            int ind = -1;
            for (Credito objCredito : objCliente.listaCC) {
                if (objCredito.getCodigoC().equals(codigoC)) {
                    ind = objCliente.listaCC.indexOf(objCredito);
                }
                
            }
            if (ind >= 0) {
                Credito objCredito = objCliente.listaCC.get(ind);
                int in = -1;
                for (Abono objAbono : objCredito.listaAC) {
                    if (objAbono.getCodigoA().equals(codigoA)) {
                        in = objCredito.listaAC.indexOf(objAbono);
                    }
                }
                if (in >= 0) {
                    Abono objAbono = objCredito.listaAC.get(in);
                    objAbono.setAbono(abono);
                    objAbono.setCodigoA(codigoA);
                    objAbono.setFecha(fecha);
                }
            }
        }
    }
    
    public void limpiarListaAbonos(){
        Credito objCredito=new Credito();
        objCredito.listaAC.clear();
    }
    
}
