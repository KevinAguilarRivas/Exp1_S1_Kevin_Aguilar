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
public class Main {
    static SistemaClientes sistema = new SistemaClientes();
    public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
    
    
    int opcionMenu;
    System.out.println("================================================ ");
    System.out.println("||           Bienvenido a Bank Boston!!       ||");
    System.out.println("================================================ ");
    
    do{
        menuBank();
        opcionMenu = leerInputCliente(scanner);
        
        switch (opcionMenu){
            case 1 -> {
                RegistroClientes registro = new RegistroClientes();
                registro.registrarCliente(sistema, scanner);
            }
            case 2 -> {
                System.out.print("Ingrese número de cuenta corriente: ");
                int numeroCuenta = scanner.nextInt();
                scanner.nextLine();
                sistema.verDatosClientePorCuenta(numeroCuenta);
            }
            case 3 -> {
                Movimientos movimientos = new Movimientos();
                System.out.print("Ingrese el numero de cuenta donde desea depositar: ");
                int numeroCuenta = scanner.nextInt();
                scanner.nextLine();
                movimientos.depositar(sistema, scanner, numeroCuenta);
            }
            case 4 -> girarDinero(scanner);
            case 5 -> consultarDinero(scanner);
            case 6 -> {
                System.out.println("Gracias por visitar Ban Boston! Hasta pronto!");
                opcionMenu = 6;
            }
            default -> caracterInvalido();
        }
        
        }while(opcionMenu != 6);
    
    }    
    public static void menuBank(){
        System.out.println("===================== MENU ===================== ");
        System.out.println("1. Registrar cliente. ");
        System.out.println("2. Ver datos de cliente. ");
        System.out.println("3. Depositar.");
        System.out.println("4. Girar. ");
        System.out.println("5. Consultar saldo. ");
        System.out.println("6. Salir. ");
        System.out.println("Seleccione en base al numero de la opcion: ");
        System.out.println("================================================ ");
    }
    public static int leerInputCliente(Scanner scanner){
        while(!scanner.hasNextInt()){
         caracterInvalido();
         scanner.nextLine();
        }
        int inputValido = scanner.nextInt();
        scanner.nextLine();
        return inputValido;
 }
    public static void caracterInvalido(){
        System.out.println("La opcion ingresada no es correcta. Volver a intentar.");
 }
    public static void verDatosUltimoClienteAgregado() {
        sistema.verDatosUltimoClienteAgregado();
}

    public static void girarDinero(Scanner scanner){
        Movimientos movimientos = new Movimientos ();
        System.out.println("Ingrese el numero de cuenta desde donde desea girar: ");
        while(!scanner.hasNextInt()){
            System.out.println("Numero de cuenta invalido. Intente nuevamente: ");
            scanner.nextLine();
        }
        int numeroCuenta = scanner.nextInt();
        scanner.nextLine();
        movimientos.girarSaldo(sistema, scanner, numeroCuenta);
        
    }
    public static void consultarDinero(Scanner scanner){
        Movimientos movimientos = new Movimientos();
        System.out.println("Ingrese el numero de cuenta para consultar el saldo: ");
        while(!scanner.hasNextInt()){
            System.out.println("Numero de cuenta invalido. Intente nuevamente: ");
            scanner.nextLine();
        }
        int numeroCuenta = scanner.nextInt();
        scanner.nextLine();
        movimientos.consultarSaldo(sistema, scanner, numeroCuenta);
        }
}

