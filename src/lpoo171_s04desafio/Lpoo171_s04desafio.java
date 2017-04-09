/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lpoo171_s04desafio;

import java.util.Scanner;

/**
 *
 * @author franconoel
 */
public class Lpoo171_s04desafio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      System.out.println("BIENVENIDO A LA APLICACION DE PRODUCTOS");
      System.out.println();
      
      Scanner tem = new Scanner (System.in);
      
      String nombre1,nombre2,nombre3;
      int cantidad1,cantidad2,cantidad3;
      double subtotal, precio1,precio2,precio3;
      
      System.out.print("INGRESE NOMBRE DEL PRODUCTO1:     ");
       nombre1 = tem.next();
      System.out.print("NGRESE CANTIDAD DEL PRODUCTO1:    ");
      cantidad1 = tem.nextInt();
      System.out.print("NGRESE PRECIO DEL PRODUCTO1:      ");
      precio1 = tem.nextFloat();
      System.out.print("INGRESE NOMBRE DEL PRODUCTO2:     ");
       nombre2 = tem.next();
      System.out.print("NGRESE CANTIDAD DEL PRODUCTO2:    ");
      cantidad2 = tem.nextInt();
      System.out.print("NGRESE PRECIO DEL PRODUCTO2:      ");
      precio2 = tem.nextFloat();
      System.out.print("INGRESE NOMBRE DEL PRODUCTO3:     ");
       nombre3 = tem.next();
      System.out.print("NGRESE CANTIDAD DEL PRODUCTO3:    ");
      cantidad3 = tem.nextInt();
      System.out.print("NGRESE PRECIO DEL PRODUCTO3:      ");
      precio3 = tem.nextFloat();
      
      subtotal = precio1*cantidad1+precio2*cantidad2+precio3*cantidad3;
      double impuesto = subtotal * 0.10;
      double total = subtotal + impuesto;
      
        String mensaje0 = "EL SUBTOTAL ES:   " + subtotal + "\n";
        String mensaje1 = "EL IMPUESTO ES:   " + impuesto + "\n";
        String mensaje2 = "total Factura:     " + total + "\n" ;
       
        System.out.println(mensaje0);
        System.out.println(mensaje1);  
        System.out.println(mensaje2);
    }            
}
