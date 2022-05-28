
package paquete5;

public class Ejecutor02 {
    
    public static void main(String[] args) {
        
        // nombre del archivo
        String nombreArchivo = "hospitales.txt";
        String id_buscar = "222";
        Hospital hospital_buscar;
        LecturaArchivoSecuencial lectura = 
                new LecturaArchivoSecuencial(nombreArchivo);
        lectura.establecerIdentificador(id_buscar);
        lectura.establecerHospitalBuscado();
        hospital_buscar = lectura.obtenerHospitalBuscado();
        if(hospital_buscar!=null){
            System.out.println(hospital_buscar);
        }else{
            System.out.println("Hospital no encontrado");
        }
        
    }
    
}
