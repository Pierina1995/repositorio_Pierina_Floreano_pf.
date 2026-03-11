/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinaldataops;

import java.util.Scanner;

/**
 *
 * @author Pierina
 */
public class proyectofinaldata {
public static void main(String [] args){ 
    String cliente;   
    double compra1,compra2,compra3,totalc,promedioc,resta;
    Scanner lectura=new Scanner(System.in);
    System.out.print("Ingrese el nombre del cliente:");
    cliente=lectura.next();
    System.out.print("Ingrese el monto de la primera compra:");
    compra1=lectura.nextDouble();
    System.out.print("Ingrese el monto de la segunda compra:");
    compra2=lectura.nextDouble();
    System.out.print("Ingrese el monto de la tercera compra:");
    compra3=lectura.nextDouble();
    // proceso de datos
    totalc=compra1+compra2+compra3;
    promedioc=totalc/3;
    resta=compra2-compra1;
    //salida de datos
    System.out.println("El total de compras es:" +totalc);
    System.out.println("La resta es:" +resta);
    System.out.println("El promedio de compras es:" +promedioc);
  
}
}
