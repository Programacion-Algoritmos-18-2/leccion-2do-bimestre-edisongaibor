package lecturaArchivos2;

public class Profesor {

    private String cedula;
    private String nombres;
    private String zona;
    private String provincia;
    private String canton;
    private String personalidad;
    private String razonamiento;
    private String dictamenIdoniedad;

    public Profesor() {
        this(" ", " ", " ", " ", " ", " ", " ", "");

    }

    public Profesor(String ced, String nom, String zon, String prov, String cant, String perso, String razona, String dict) {
        agregarCedula(ced);
        agregarNombres(nom);
        agregarZona(zon);
        agregarProvincia(prov);
        agregarCanton(cant);
        agregarPersonalidad(perso);
        agregarRazonamiento(razona);
        agregarDictamenIdoniedad(dict);
    }

    public void agregarCedula(String ced) {
        cedula = ced;
    }

    public void agregarNombres(String nom) {
        nombres = nom;
    }

    public void agregarZona(String zon) {
        zona = zon;
    }

    public void agregarProvincia(String prov) {
        provincia = prov;
    }

    public void agregarCanton(String cant) {
        canton = cant;
    }

    public void agregarPersonalidad(String perso) {
        personalidad = perso;
    }

    public void agregarRazonamiento(String razona) {
        razonamiento = razona;
    }

    public void agregarDictamenIdoniedad(String dict) {
        dictamenIdoniedad = dict;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public String obtenerNombres() {
        return nombres;
    }

    public String obtenerZona() {
        return zona;
    }

    public String obtenerProvincia() {
        return provincia;
    }

    public String obtenerCanton() {
        return canton;
    }

    public String obtenerPersonalidad() {
        return personalidad;
    }

    public String obtenerRazonamiento() {
        return razonamiento;
    }

    public String obtenerDictamenIdoniedad() {
        return dictamenIdoniedad;
    }

    public String toString() {
        return String.format("%s - %s - %s - %s - %s - %s - %s - %s \n", obtenerCedula(), obtenerNombres(), obtenerZona(), obtenerProvincia(), obtenerCanton(), obtenerPersonalidad(),
                obtenerRazonamiento(), obtenerDictamenIdoniedad());
    }
}
