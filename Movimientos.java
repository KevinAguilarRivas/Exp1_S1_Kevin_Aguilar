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
public class Movimientos {
    public void depositar(SistemaClientes sistema, Scanner scanner, int numeroCuenta){
        boolean encontrado = false;
        
         for (ListaClientes cliente : sistema.getListaClientes()) {
             if (cliente.getIdCuentaCorriente() == numeroCuenta) {
                System.out.println("============================================");
                 System.out.println("Ingrese monto a depositar: ");
                System.out.println("============================================");
                 while(!scanner.hasNextInt()){
                     System.out.println("Monto invalido. Ingrese un numero valido: ");
                 }
                 int montoDeposito = scanner.nextInt();
                 scanner.nextLine();
                
                     cliente.depositarSaldo(montoDeposito);
                System.out.println("============================================");
                     System.out.println("Se ha depositado $" + montoDeposito + " en la cuenta " + numeroCuenta);
                     System.out.println("Nuevo saldo: $" + cliente.getSaldo());
                System.out.println("============================================");
                     encontrado = true;
                     break;
                 }
         }
             if (!encontrado) {
                System.out.println("No se encontró un cliente con ese número de cuenta.");
                }    
             
         }
    public void girarSaldo(SistemaClientes sistema, Scanner scanner, int numeroCuenta){
        boolean encontrado = false;
        for (ListaClientes cliente : sistema.getListaClientes()) {
            if (cliente.getIdCuentaCorriente() == numeroCuenta) {
                System.out.println("============================================");
                System.out.println("Ingrese monto a girar: ");
                System.out.println("============================================");
                while(!scanner.hasNextInt()){
                     System.out.println("Monto invalido. Ingrese un numero valido: ");
                 }
                 int montoGiro = scanner.nextInt();
                 scanner.nextLine();
                 if(montoGiro > cliente.getSaldo()){
                     System.out.println("Fondos insuficientes para realizar el giro. ");
                 }else{
                 cliente.girarSaldo(montoGiro);
                System.out.println("============================================");
                 System.out.println("Se ha girado $" + montoGiro + " en la cuenta " + numeroCuenta);
                 System.out.println("Nuevo saldo: $" + cliente.getSaldo());
                System.out.println("============================================");
                 }
                 encontrado = true;
                 break;
            }
            
        }
        if (!encontrado){
            System.out.println("No se encontró un cliente con ese numero de cuenta. ");
        }
        }
    public void consultarSaldo(SistemaClientes sistema, Scanner scanner, int numeroCuenta){
        boolean encontrado = false;
        
        for(ListaClientes cliente : sistema.getListaClientes()){
            if (cliente.getIdCuentaCorriente() == numeroCuenta){
                System.out.println("============================================");
                System.out.println("Nombre del cliente: " + cliente.getNombreCliente() + " " + cliente.getApellidoPaternoCliente() + " " + cliente.getApellidoMaternoCliente());
                System.out.println("Saldo disponible: $" + cliente.getSaldo());
                System.out.println("============================================");
                encontrado = true;
                break;
            }
        }
        if (!encontrado){
            System.out.println("No se encontró un cliente con ese numero de cuenta. ");
        }
    }
    }

