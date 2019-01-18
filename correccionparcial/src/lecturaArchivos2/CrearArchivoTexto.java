package lecturaArchivos2;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CrearArchivoTexto {

    private Formatter salida;

    public void abrirArchivo() {
        try {

            salida = new Formatter(new FileWriter("data3.txt", true));

        } catch (SecurityException securityException) {
            System.err.println("Acceso denegado al archivo");
            System.exit(1);
        } catch (FileNotFoundException filesNotFoundException) {
            System.err.println("Hubo un error al crear archivo");
            System.exit(1);

        } catch (IOException e) {
            System.err.println("Error al crear archivo");
            System.exit(1);
        }
    }

    public void agregarRegistros(ArrayList<Profesor> lista) {

        for (int i = 1; i < lista.size(); i++) {

            try {

                salida.format("Cedula :%s " + " Nombre: %s " + " Zona: %s " + " Provincia: %s " + " Canton: %s " + " Personalidad: %s " + " Razonamiento: %s " + " Discamen Indoniedad: %s\n",
                        lista.get(i).obtenerCedula(),
                        lista.get(i).obtenerNombres(),
                        lista.get(i).obtenerZona(),
                        lista.get(i).obtenerProvincia(),
                        lista.get(i).obtenerCanton(),
                        lista.get(i).obtenerPersonalidad(),
                        lista.get(i).obtenerRazonamiento(),
                        lista.get(i).obtenerDictamenIdoniedad());

            } catch (NoSuchElementException noSuchElementException) {
                System.out.println("Digite nuevamente");
            }
        }

    }

    public void cerrarArchivo() {
        if (salida != null) {
            salida.close();
        }
    }
}
