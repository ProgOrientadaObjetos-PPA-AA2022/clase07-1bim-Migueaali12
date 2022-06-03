package paquete5;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class LecturaArchivoSecuencial {

    private ObjectInputStream entrada;
    private ArrayList<Hospital> Hospitales;
    private String identificador;
    private String nombreArchivo;
    private Hospital HospitalBuscado;

    public LecturaArchivoSecuencial(String n) {
        nombreArchivo = n;
        File f = new File(nombreArchivo);
        if (f.exists()) {
            try // abre el archivo
            {
                entrada = new ObjectInputStream(
                        new FileInputStream(n));
            } // fin de try
            catch (IOException ioException) {
                System.err.println("Error al abrir el archivo." + ioException);
            } // fin de catch
        }
    }

    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }

    public void establecerHospitales() {
        // 
        Hospitales = new ArrayList<>();
        File f = new File(obtenerNombreArchivo());
        if (f.exists()) {

            while (true) {
                
                try {
                    Hospital registro = (Hospital) entrada.readObject();
                    Hospitales.add(registro);
                } catch (EOFException endOfFileException) {
                    return; // se llegó al fin del archivo
                    // se puede usar el break;
                    // System.err.println("Fin de archivo: " + endOfFileException);

                } catch (IOException ex) {
                    System.err.println("Error al leer el archivo: " + ex);
                } catch (ClassNotFoundException ex) {
                    System.err.println("No se pudo crear el objeto: " + ex);
                } catch (Exception ex) {
                    System.err.println("No hay datos en el archivo: " + ex);

                }
            }
        }
    }
    
    public void establecerIdentificador(String n) {
        identificador = n;
    }
    
    public void establecerHospitalBuscado() {
        // 
        
        File f = new File(obtenerNombreArchivo());
        if (f.exists()) {

            while (true) {
                try {
                    Hospital registro = (Hospital) entrada.readObject();
                    
                    if(registro.obtenerId().equals(identificador)){
                        HospitalBuscado = registro;
                        break;
                    }
                    
                } catch (EOFException endOfFileException) {
                    return; // se llegó al fin del archivo
                    // se puede usar el break;
                    // System.err.println("Fin de archivo: " + endOfFileException);

                } catch (IOException ex) {
                    System.err.println("Error al leer el archivo: " + ex);
                } catch (ClassNotFoundException ex) {
                    System.err.println("No se pudo crear el objeto: " + ex);
                } catch (Exception ex) {
                    System.err.println("No hay datos en el archivo: " + ex);

                }
            }
        }
    }

    public ArrayList<Hospital> obtenerHospitales() {
        return Hospitales;
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }
    
    public String obtenerIdentificador() {
        return identificador;
    }
    
     public Hospital obtenerHospitalBuscado() {
        return HospitalBuscado;
    }

    @Override
    public String toString() {
        String cadena = "Lista de Hospitales\n";
        for (int i = 0; i < obtenerHospitales().size(); i++) {
            Hospital h = obtenerHospitales().get(i);
            cadena = String.format("%s(%d) %s - %s - %d - %.2f\n", cadena,
                    i + 1,
                    h.obtenerNombre(),
                    h.obtenerId(),
                    h.obtenerNumCamas(),
                    h.obtenerPresupuesto());
        }

        return cadena;
    }

    // cierra el archivo y termina la aplicación
    public void cerrarArchivo() {
        try // cierra el archivo y sale
        {
            if (entrada != null) {
                entrada.close();
            }
            System.exit(0);
        } // fin de try
        catch (IOException ioException) {
            System.err.println("Error al cerrar el archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del método cerrarArchivo

}
