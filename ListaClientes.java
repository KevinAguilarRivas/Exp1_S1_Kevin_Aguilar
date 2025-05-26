/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankbostonpackage;

/**
 *
 * @author kevin
 */
public class ListaClientes {
    private String rutCliente;
    private String nombreCliente;
    private String apellidoPaternoCliente;
    private String apellidoMaternoCliente;
    private String calleDomicilioCliente;
    private String numeroDomicilioCliente;
    private String comunaCliente;
    private int telefonoCliente;
    private static int numeroCuentaCorriente = 123456789;
    private int idCuentaCorriente;
    private int saldo = 0;
    
    public ListaClientes (String rutCliente, String nombreCliente, String apellidoPaternoCliente, 
            String apellidoMaternoCliente, String calleDomicilioCliente, String numeroDomicilioCliente, 
            String comunaCliente, int telefonoCliente){
        
        this.rutCliente = rutCliente;
        this.nombreCliente = nombreCliente;
        this.apellidoPaternoCliente = apellidoPaternoCliente;
        this.apellidoMaternoCliente = apellidoMaternoCliente;
        this.calleDomicilioCliente = calleDomicilioCliente;
        this.numeroDomicilioCliente = numeroDomicilioCliente;
        this.comunaCliente = comunaCliente;
        this.telefonoCliente = telefonoCliente;
        this.idCuentaCorriente = numeroCuentaCorriente++;
        this.saldo = saldo;
        
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidoPaternoCliente() {
        return apellidoPaternoCliente;
    }

    public void setApellidoPaternoCliente(String apellidoPaternoCliente) {
        this.apellidoPaternoCliente = apellidoPaternoCliente;
    }

    public String getApellidoMaternoCliente() {
        return apellidoMaternoCliente;
    }

    public void setApellidoMaternoCliente(String apellidoMaternoCliente) {
        this.apellidoMaternoCliente = apellidoMaternoCliente;
    }

    public String getCalleDomicilioCliente() {
        return calleDomicilioCliente;
    }

    public void setCalleDomicilioCliente(String calleDomicilioCliente) {
        this.calleDomicilioCliente = calleDomicilioCliente;
    }

    public String getNumeroDomicilioCliente() {
        return numeroDomicilioCliente;
    }

    public void setNumeroDomicilioCliente(String numeroDomicilioCliente) {
        this.numeroDomicilioCliente = numeroDomicilioCliente;
    }

    public String getComunaCliente() {
        return comunaCliente;
    }

    public void setComunaCliente(String comunaCliente) {
        this.comunaCliente = comunaCliente;
    }

    public int getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(int telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public int getNumeroCuentaCorriente() {
        return numeroCuentaCorriente;
    }

    public void setNumeroCuentaCorriente(int numeroCuentaCorriente) {
        this.numeroCuentaCorriente = numeroCuentaCorriente;
    }

    public int getIdCuentaCorriente() {
        return idCuentaCorriente;
    }

    public void setIdCuentaCorriente(int idCuentaCorriente) {
        this.idCuentaCorriente = idCuentaCorriente;
    }

    public String getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    public void depositarSaldo(int monto) {
    this.saldo += monto;
}
    public void girarSaldo(int monto) {
    this.saldo -= monto;
}
}
