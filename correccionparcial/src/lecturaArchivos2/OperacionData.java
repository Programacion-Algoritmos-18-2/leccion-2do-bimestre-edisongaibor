package lecturaArchivos2;

import java.util.ArrayList;
import java.util.Collections;

public class OperacionData {

    ArrayList<Profesor> informacion = new ArrayList<>();

    public void agregarInformacion(ArrayList<Profesor> info) {
        informacion = info;
    }

    public ArrayList<Profesor> obtenerInformacion() {
        return informacion;
    }

    public double obtenerPromedioCapacidad() {
        double suma = 0;
        return suma;
    }

    public void ordenarCanton() {
        ArrayList<Profesor> dataPorCantones = new ArrayList<>();
        dataPorCantones.addAll(informacion);
        Collections.sort(dataPorCantones,
                (o1, o2) -> o1.obtenerCanton().compareTo(o2.obtenerCanton()));
        for (int i = 0; i < dataPorCantones.size(); i++) {
            System.out.println(dataPorCantones.get(i));
        }
    }

    public ArrayList<Profesor> ordenarNombres() {
        ArrayList<Profesor> dataPorNombres = new ArrayList<>();
        dataPorNombres.addAll(informacion);
        Collections.sort(dataPorNombres,
                (o1, o2) -> o1.obtenerNombres().compareTo(o2.obtenerNombres()));
        return dataPorNombres;

    }

    public String descripcionProfesor(ArrayList<Profesor> listado) {
        int adec = 0;
        int porC = 0;
        String cadena = "";
        for (int i = 0; i < listado.size(); i++) {
            if (listado.get(i).obtenerPersonalidad().equals("ADECUADO")) {
                adec = adec + 1;
            }
            if (listado.get(i).obtenerPersonalidad().equals("POR CONVOCAR")) {
                porC = porC + 1;
            }

            cadena = String.format("Adecuador: %d - Por convocar: %d\n", adec, porC);
        }
        return cadena;
    }

    public String obtener_paticipantes(ArrayList<Profesor> listado) {
        int idone = 0;
        int no_idone = 0;
        String cadena = "";
        for (int i = 0; i < listado.size(); i++) {
            if (listado.get(i).obtenerDictamenIdoniedad().equals("IDONEO")) {
                idone = idone + 1;
            }
            if (listado.get(i).obtenerDictamenIdoniedad().equals("NO IDONEO")) {
                no_idone = no_idone + 1;
            }

            cadena = String.format("IDONEO: %d - NO IDONEO: %d\n", idone, no_idone);
        }
        return cadena;
    }

    public void lecturaData() {

        for (int i = 0; i < obtenerInformacion().size(); i++) {
            System.out.println(obtenerInformacion().get(i));

        }

    }

}
