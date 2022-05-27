/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.util.ArrayList;
import paquete1.Calificacion;
import paquete1.Profesor;

/**
 *
 * @author reroes
 */
public class ManejoArrayList3 {
    public static void main(String[] args) {
        
        Calificacion c1 = new Calificacion(10, "Base de datos");
        Calificacion c2 = new Calificacion(7.3, "Matematica");
        Calificacion c3 = new Calificacion(8.2, "Matematica");
        
        Profesor prof1 = new Profesor("Joseph Jimenez", "facturado");
        Profesor prof2 = new Profesor("David Jones", "nombramiento");
        Profesor prof3 = new Profesor("Norman Munoz", "contrato");
        
        c1.establecerProfesor(prof1);
        c2.establecerProfesor(prof2);
        c3.establecerProfesor(prof3);
        
        // Arreglo
        Profesor [] profesores = new Profesor[2];
        profesores[0] = prof1;
        profesores[1] = prof2;
        
        for (int i = 0; i < profesores.length; i++) {
            System.out.printf("%s - %s\n", profesores[i].obtenerNombre(),
                    profesores[i].obtenerTipo());
        }
        
        System.out.println("-----------------------------");
        
        // ArrayList
        ArrayList <Calificacion> cal = new ArrayList<>();
        cal.add(c1);
        cal.add(c2);
        cal.add(c3);
        
        for (int i = 0; i < cal.size(); i++) {
            System.out.printf("%s - %s - %.2f\n", 
                    cal.get(i).obtenerProfesor().obtenerNombre(),
                    cal.get(i).obtenerNombreMateria(),
                    cal.get(i).obtenerNota());
        }
        
        System.out.println("-----------------------------");
        
        
       
        
        
    }
}
