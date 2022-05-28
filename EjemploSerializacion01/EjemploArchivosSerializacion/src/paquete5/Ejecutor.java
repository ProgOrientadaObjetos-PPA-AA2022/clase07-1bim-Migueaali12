package paquete5;

public class Ejecutor {

    public static void main(String[] args) {

        String nombreArchivo = "Hospitales.txt";

        Hospital h1 = new Hospital("Sana Sana", 300, 15000);
        Hospital h2 = new Hospital("San Agustin", 500, 28000);
        Hospital h3 = new Hospital("San Sebastian", 700, 39000);

        EscrituraArchivoSecuencial archivo
                = new EscrituraArchivoSecuencial(nombreArchivo);

        archivo.establecerRegistroHospital(h1);
        archivo.establecerSalida();
        archivo.establecerRegistroHospital(h2);
        archivo.establecerSalida();
        archivo.establecerRegistroHospital(h3);
        archivo.establecerSalida();
        archivo.cerrarArchivo();

        LecturaArchivoSecuencial lectura
                = new LecturaArchivoSecuencial(nombreArchivo);
        lectura.establecerHospitales();
        System.out.println(lectura);

    }

}
