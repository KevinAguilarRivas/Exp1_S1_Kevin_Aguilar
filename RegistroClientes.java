/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankbostonpackage;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class RegistroClientes {
        public void registrarCliente(SistemaClientes sistema, Scanner scanner){
        String rutCliente;
        String nombreCliente = "";
        String apellidoPaternoCliente = "";
        String apellidoMaternoCliente = "";
        String calleDomicilioCliente = "";
        String numeroDomicilioCliente = "";
        String comunaCliente = "";
        int telefonoCliente;
        
        System.out.println("================================================= ");
        System.out.println("||        Ingrese datos de nuevo cliente       ||");
        System.out.println("================================================= ");
       
        while(true){
            System.out.print("\nIngrese Rut (ej: 12.345.678-9): ");
            rutCliente = scanner.nextLine();
            if (rutCliente.length() >= 11 && rutCliente.length() <= 12){
             break;   
            }else{
                System.out.print("\nRut invalido. Por favor, ingrese un rut con el formato indicado. ");
            }
        }
        
        while(nombreCliente.trim().isEmpty()){
            System.out.print("\nIngrese Nombre: ");
             nombreCliente = scanner.nextLine();
             if (nombreCliente.isEmpty()){
             System.out.print("\nCategoría no puede estar vacia. Por favor, ingrese un nombre. ");
             }
            }
        
        while(apellidoPaternoCliente.trim().isEmpty()){
            System.out.print("\nIngrese Apellido Paterno: ");
             apellidoPaternoCliente = scanner.nextLine();
             if (apellidoPaternoCliente.isEmpty()){
             System.out.print("\nCategoría no puede estar vacia. Por favor, ingrese un apellido paterno. ");
             }
            }
        
        while(apellidoMaternoCliente.trim().isEmpty()){
            System.out.print("\nIngrese Apellido Materno: ");
             apellidoMaternoCliente = scanner.nextLine();
             if (apellidoMaternoCliente.isEmpty()){
             System.out.print("\nCategoría no puede estar vacia. Por favor, ingrese un apellido materno. ");
             }
            }
        
        while(calleDomicilioCliente.trim().isEmpty()){
            System.out.print("\nIngrese Direccion de Domicilio (sin numero): ");
             calleDomicilioCliente = scanner.nextLine();
             if (calleDomicilioCliente.isEmpty()){
             System.out.print("\nCategoría no puede estar vacia. Por favor, ingrese una direccion. ");
             }
            }
        while(numeroDomicilioCliente.trim().isEmpty()){
            System.out.print("\nIngrese Numero de Domicilio: ");
             numeroDomicilioCliente = scanner.nextLine();
             if (numeroDomicilioCliente.isEmpty()){
             System.out.print("\nCategoría no puede estar vacia. Por favor, ingrese un numero de direccion. ");
             }
            }
        while(comunaCliente.trim().isEmpty()){
            System.out.print("\nIngrese Comuna: ");
             comunaCliente = scanner.nextLine();
             if (comunaCliente.isEmpty()){
             System.out.print("\nCategoría no puede estar vacia. Por favor, ingrese una comuna. ");
             }
            }
        while(true){
            System.out.print("\nIngrese Numero de Telefono (+56): ");
             if (scanner.hasNextInt()){
                 telefonoCliente = scanner.nextInt();
                 scanner.nextLine();
                 break;
             }else{
                 System.out.print("\nTelefono invalido. Intente nuevamente. ");
                 scanner.nextLine();
             }
            }
        System.out.println(" ");
        System.out.println("=============== Cliente ingresado exitosamente ===============");
        ListaClientes cliente = new ListaClientes(rutCliente, nombreCliente, apellidoPaternoCliente, apellidoMaternoCliente, calleDomicilioCliente, numeroDomicilioCliente, comunaCliente, telefonoCliente);
        sistema.agregarCliente(cliente); 
        sistema.verDatosUltimoClienteAgregado();
        
    }
}
