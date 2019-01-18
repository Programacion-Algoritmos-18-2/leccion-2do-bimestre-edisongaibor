package lecturaArchivos2;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;

import com.google.gson.Gson;

public class LeerArchivoTexto {

    private Scanner entrada;

    public void abrirArchivo() {
        try {
            entrada = new Scanner(new File("data/data2.txt"));
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Hubo un error buscando el archivo.");
            System.exit(1);
        }
    }

    public ArrayList<Profesor> leerRegistros() {

        OperacionData operacion = new OperacionData();
        ArrayList<Profesor> lista = new ArrayList<>();

        try {
            entrada.nextLine();
            while (entrada.hasNext()) {

                Gson g = new Gson();
                String linea = entrada.nextLine();

                Profesor p = g.fromJson(linea, Profesor.class);
                lista.add(p);

            }

        } catch (NoSuchElementException elementException) {
            System.err.println("Hubo un error leyendo el archivo.");
            entrada.close();
            System.exit(1);
        } catch (IllegalStateException stateException) {
            System.err.println("Hubo un error leyendo el archivo.");
            System.exit(1);
        }
        return lista;
    }

    public void cerrarArchivo() {
        if (entrada != null) {
            entrada.close();
        }
    }
}
