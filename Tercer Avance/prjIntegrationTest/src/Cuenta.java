/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Administrador
 */
public interface Cuenta {
    int numCuenta=0;
    double cantidadDinero=0;
    String tipo="";

    public abstract int getNumCuenta();
    public abstract void setNumCuenta(int numCuenta);
    public abstract double getCantidadDinero();
    public abstract void setCantidadDinero(double cantidadDinero);
    public abstract String getTipo();
    public abstract void setTipo(String tipo);
    public abstract void retirar(double monto);
    public abstract void depositar(double monto);    
    public abstract double liquidar();    
}
