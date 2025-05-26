/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankbostonpackage;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kevin
 */
public class SistemaClientes {
    List<ListaClientes> listaClientes;
    
    public SistemaClientes (){
      listaClientes = new ArrayList<>();  
    }
    
    public void verDatosUltimoClienteAgregado(){
        if (listaClientes.isEmpty()) {
            System.out.println("No hay clientes registrados.");
            return;
        }
        
        ListaClientes ultimoCliente = listaClientes.get(listaClientes.size() - 1);
        System.out.println("=============== Datos de Nuevo Cliente Ingresado ===============");
        System.out.println("RUT: " + ultimoCliente.getRutCliente());
        System.out.println("Nombre: " + ultimoCliente.getNombreCliente());
        System.out.println("Apellido Paterno: " + ultimoCliente.getApellidoPaternoCliente());
        System.out.println("Apellido Materno: " + ultimoCliente.getApellidoMaternoCliente());
        System.out.println("Dirección: " + ultimoCliente.getCalleDomicilioCliente() + " " + ultimoCliente.getNumeroDomicilioCliente());
        System.out.println("Comuna: " + ultimoCliente.getComunaCliente());
        System.out.println("Teléfono: +56 " + ultimoCliente.getTelefonoCliente());
        System.out.println("N° Cuenta Corriente: " + ultimoCliente.getIdCuentaCorriente());
        System.out.println("Saldo Disponible: " + ultimoCliente.getSaldo());
        System.out.println("================================================================");
        System.out.println(" ");
    }
    public void verDatosClientePorCuenta(int numeroCuenta) {
    boolean encontrado = false;
    
    for (ListaClientes cliente : listaClientes) {
        if (cliente.getIdCuentaCorriente() == numeroCuenta) {
            System.out.println("================== Datos del Cliente ==================");
            System.out.println("RUT: " + cliente.getRutCliente());
            System.out.println("Nombre: " + cliente.getNombreCliente());
            System.out.println("Apellido Paterno: " + cliente.getApellidoPaternoCliente());
            System.out.println("Apellido Materno: " + cliente.getApellidoMaternoCliente());
            System.out.println("Dirección: " + cliente.getCalleDomicilioCliente() + " " + cliente.getNumeroDomicilioCliente());
            System.out.println("Comuna: " + cliente.getComunaCliente());
            System.out.println("Teléfono: +56 " + cliente.getTelefonoCliente());
            System.out.println("N° Cuenta Corriente: " + cliente.getIdCuentaCorriente());
            System.out.println("=======================================================");
            encontrado = true;
            break;
        }
    }
    if (!encontrado) {
        System.out.println("No se encontró un cliente con ese número de cuenta corriente.");
    }
}
    public void agregarCliente(ListaClientes cliente) {
    listaClientes.add(cliente);
}
    public List<ListaClientes> getListaClientes() {
        return listaClientes;
    }
}


