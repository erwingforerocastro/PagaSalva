package clases;

import java.io.Serializable;

public class Abono  implements Serializable{

    private double abono;
    private String codigoA;
    private String fecha;
    private double saldo;

    public Abono(double abono, String codigoA, String fecha, double saldo) {
        this.abono = abono;
        this.codigoA = codigoA;
        this.fecha = fecha;
        this.saldo = saldo;
    }

    public Abono() {
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getAbono() {
        return abono;
    }

    public void setAbono(double abono) {
        this.abono = abono;
    }

    public String getCodigoA() {
        return codigoA;
    }

    public void setCodigoA(String codigoA) {
        this.codigoA = codigoA;
    }

    @Override
    public String toString() {
        return "Abono{" + "abono=" + abono + ", codigoA=" + codigoA + ", fecha=" + fecha + ", saldo=" + saldo + '}';
    }

   

}
