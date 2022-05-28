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
    String idH;

    public Hospital(String nom, String id, int numCamas, double prspto) {

        nombre = nom;
        idH = id;
        numeroCamas = numCamas;
        presupuesto = prspto;

    }

    public void establecerNombre(String c) {
        nombre = c;
    }
    
    public void establecerIdh(String c) {
        idH = c;
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
    
    public String obtenerId() {
        return idH;
    }
    
    public int obtenerNumCamas() {
        return numeroCamas;
        
    }
    
    public double obtenerPresupuesto() {
        return presupuesto;
        
    }
    
    @Override
    public String toString(){
        String valor = String.format("%s - %s - %d -%.2f\n",  
                obtenerNombre(),
                obtenerId(),
                obtenerNumCamas(),
                obtenerPresupuesto());
        return valor;
    }

}
