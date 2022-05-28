/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.io.Serializable;

public class Hospital implements Serializable {

    String nombre;
    int numeroCamas;
    double presupuesto;

    public Hospital(String nom, int numCamas, double prspto) {

        nombre = nom;
        numeroCamas = numCamas;
        presupuesto = prspto;

    }

    public void establecerNombre(String c) {
        nombre = c;
    }

    public void establecerNumCamas(int c) {
        numeroCamas = c;
    }

    public void establecerPresupuesto(double c) {
        presupuesto = c;
    }
    
    public String obtenerNombre() {
        return nombre;
        
    }
    
    public int obtenerNumCamas() {
        return numeroCamas;
        
    }
    
    public double obtenerPresupuesto() {
        return presupuesto;
        
    }

}
