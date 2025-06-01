package paqueteprincipal.correccionexamen;
public class CorreccionExamen {
    public static void main(String[] args) {
        Docente docente = new Docente(" ", "", 0, 0);
        Estudiante estudiante = new Estudiante(" ", "", 0, 0, 0.0);
        docente.registro();
        docente.mostrarinfo();
        estudiante.registro();
        estudiante.mostrarinfo();   
    }
}
