package lecturaArchivos2;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;

public class LeerArchivoTexto2 {

    private Scanner entrada;

    public void abrirArchivo() {
        try {
            entrada = new Scanner(new File("data/data1.csv"));
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Existe un error buscando el archivo.");
            System.exit(1);
        }
    }

    public ArrayList<Profesor> leerRegistros2() {

        OperacionData operacion = new OperacionData();
        ArrayList<Profesor> lista = new ArrayList<>();

        try {
            entrada.nextLine();
            while (entrada.hasNext()) {
                String linea = entrada.nextLine();
                ArrayList<String> registro = new ArrayList<>(Arrays.asList(linea.split(",")));
                Profesor p = new Profesor();
                p.agregarCedula(registro.get(0));
                p.agregarNombres(registro.get(1));
                p.agregarZona(registro.get(2));
                p.agregarProvincia(registro.get(3));
                p.agregarCanton(registro.get(4));
                p.agregarPersonalidad(registro.get(5));
                p.agregarRazonamiento(registro.get(6));
                p.agregarDictamenIdoniedad(registro.get(7));
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
