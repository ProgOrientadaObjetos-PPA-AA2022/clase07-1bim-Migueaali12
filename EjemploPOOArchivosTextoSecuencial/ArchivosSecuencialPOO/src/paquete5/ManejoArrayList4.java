/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.util.ArrayList;
import paquete1.Calificacion;
import paquete1.Empresa;
import paquete1.Profesor;

/**
 *
 * @author reroes
 */
public class ManejoArrayList4 {

    public static void main(String[] args) {

        Empresa emp1 = new Empresa("SodaBar", "Loja");
        Empresa emp2 = new Empresa("Samsung", "Cuenca");
        Empresa emp3 = new Empresa("Facebook", "California");
        Empresa emp4 = new Empresa("Apple", "California");

        // ArrayList
        ArrayList<Empresa> ArrayEmpresa = new ArrayList<>();
        ArrayEmpresa.add(emp1);
        ArrayEmpresa.add(emp2);
        ArrayEmpresa.add(emp3);
        ArrayEmpresa.add(emp4);

        for (int i = 0; i < ArrayEmpresa.size(); i++) {
            System.out.printf("%s - %s\n",
                    ArrayEmpresa.get(i).obtenerNombre(),
                    ArrayEmpresa.get(i).obtenerCiudad());

        }

        System.out.println("-----------------------------");

    }
}
