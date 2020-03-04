package clases;

import java.io.Serializable;
import java.util.ArrayList;

public class Credito implements Serializable{

    private String codigoC;
    private String fecha;
    private double valorCredito;
    private int intereses;
    private double valorAdecuado;
    private int numeroCuotas;
    private double valorCuota;

    public Credito(String codigoC, String fecha, double valorCredito, int intereses, double valorAdecuado, int numeroCuotas, double valorCuota) {
        this.codigoC = codigoC;
        this.fecha = fecha;
        this.valorCredito = valorCredito;
        this.intereses = intereses;
        this.valorAdecuado = valorAdecuado;
        this.numeroCuotas = numeroCuotas;
        this.valorCuota = valorCuota;
    }

    public Credito() {
    }
    

    ArrayList<Abono> listaAC = new ArrayList();

    public ArrayList<Abono> getListaAC() {
        return listaAC;
    }

    public void setListaAC(ArrayList<Abono> listaAC) {
        this.listaAC = listaAC;
    }

    public String getCodigoC() {
        return codigoC;
    }

    public void setCodigoC(String codigoC) {
        this.codigoC = codigoC;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public int getIntereses() {
        return intereses;
    }

    public void setIntereses(int intereses) {
        this.intereses = intereses;
    }

    public double getValorAdecuado() {
        return valorAdecuado;
    }

    public void setValorAdecuado(double valorAdecuado) {
        this.valorAdecuado = valorAdecuado;
    }

    public int getNumeroCuotas() {
        return numeroCuotas;
    }

    public void setNumeroCuotas(int numeroCuotas) {
        this.numeroCuotas = numeroCuotas;
    }

    public double getValorCuota() {
        return valorCuota;
    }

    public void setValorCuota(double valorCuota) {
        this.valorCuota = valorCuota;
    }

    @Override
    public String toString() {
        return "Credito{" + "codigoC=" + codigoC + ", fecha=" + fecha + ", valorCredito=" + valorCredito + ", intereses=" + intereses + ", valorAdecuado=" + valorAdecuado + ", numeroCuotas=" + numeroCuotas + ", valorCuota=" + valorCuota + '}';
    }

}
