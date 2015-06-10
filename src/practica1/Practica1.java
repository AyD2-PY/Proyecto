/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Scanner;

/**
 *
 * @author naul
 */

public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pago_Entrada();
    }
    
    public static void Pago_Entrada(){
        Scanner in = new Scanner(System.in);
        String nombre,publico,clasificacion;
        double precio,total;
        System.out.println("Clasificador de Entradas");
        System.out.println("Ingrese el tipo de Entrada");
        nombre = in.next();
        System.out.println("Ingrese quien pago la entrada: estudiantes, profesional, extranjero");
        publico = in.next();
        System.out.println("Ingrese el precio de la entrada");
        precio = in.nextDouble();
        metodos met = new metodos();
        clasificacion = met.clasificacion(publico);
        
        if(publico.contentEquals("extranjero")){
            total = met.precioeextranjero(precio);
        }else{
            total = met.precionacional(precio);
        }
        
        System.out.println();
        System.out.println("");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("Los datos de su Pago de la Entrada son:");
        
        System.out.println("titulo: "+nombre);
        System.out.println("clasificacion: "+clasificacion);
        System.out.println("precio total: "+total);
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        
    }
    
}
