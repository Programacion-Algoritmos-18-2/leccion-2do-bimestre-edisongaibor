package lecturaArchivos2;

import java.util.ArrayList;
import java.util.Scanner;

public class PruebaLeerArchivoTexto {

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        LeerArchivoTexto app = new LeerArchivoTexto();
        LeerArchivoTexto2 app2 = new LeerArchivoTexto2();
        CrearArchivoTexto a = new CrearArchivoTexto();
        OperacionData operacion = new OperacionData();

        int opcion;

        app.abrirArchivo();
        app2.abrirArchivo();

        a.abrirArchivo();
        ArrayList<Profesor> lista = app.leerRegistros();
        ArrayList<Profesor> lista_2 = app2.leerRegistros2();
        for (int i = 0; i < lista_2.size(); i++) {
            lista.add(lista_2.get(i));
        }

        System.out.println("******Menu****** ");
        System.out.println("Ingrese 1 para ordenar por canton");
        System.out.println("Ingrese 2 para ordenar por nombre");
        System.out.println("Ingrese 3 para ordenar por personalidad");
        System.out.println("Ingrese 4 para ordenar por idoniedad");
        opcion = entrada.nextInt();

        operacion.agregarInformacion(lista);
        a.agregarRegistros(lista);

        switch (opcion) {
            case 1:
                operacion.ordenarCanton();
                break;
            case 2:
                ArrayList<Profesor> lista2 = operacion.ordenarNombres();
                System.out.println(lista2);
                break;
            case 3:
                operacion.descripcionProfesor(lista);
                System.out.println(operacion.descripcionProfesor(lista));
                operacion.obtener_paticipantes(lista);
                break;
            case 4:
                System.out.println(operacion.obtener_paticipantes(lista));

                app.cerrarArchivo();
                app2.cerrarArchivo();
                a.cerrarArchivo();
        }
    }
}
