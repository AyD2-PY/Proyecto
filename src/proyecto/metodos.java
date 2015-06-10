/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author naul
 */
public class metodos {
    
    public  String clasificacion(String tipo){
        String clasificacion = "";
        
        if (tipo.equals("estudiantes")){
            clasificacion = "Estudiante de la FIUSAC u otra Universidad privada";
        }else if (tipo.equals("profesional")){
            clasificacion = "Entrada de Ingenieros con Colegiado Activo y de empresas privadas";
        }else if (tipo.equals("extranjero")){
            clasificacion = "Estudiantes residentes afuera de Guatemala";
        }else {
            clasificacion = "Ups!!! No ingreso ningun clasificador";
        }
        return clasificacion;
    }
    public  double precionacional(double precio){
        double costo, impuesto, ganancia;
        impuesto = precio * 0.12;
        ganancia = precio * 0.25;
        
        costo = precio + impuesto + ganancia;
        
        return costo;
    }
    
    public  double precioeextranjero(double precio){
        double costo, cambio, ganancia;
        cambio = precio * 7.61;  //Cambio actual
        ganancia = precio * 0.25;
        
        costo = precio + cambio + ganancia;
        
        return costo;
    }
    
}
