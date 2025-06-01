package paqueteprincipal.correccionexamen;
import java.util.*;
public class Docente extends persona {
    private int asignatura;
    
    public Docente(String nombre, String correo, int cedula, int asignatura) {
        super(nombre, correo, cedula);
        this.asignatura = asignatura;
    }
    Scanner sc = new Scanner(System.in);

    public void setAsignatura(int asignatura) {
        this.asignatura = asignatura;
    }
    public int getAsignatura() {
        return asignatura;
    }
    // Método para registrar un docente con validación y manejo de excepciones
    public void registro(){
        // --- CÓDIGO INCORRECTO DEL EXAMEN ---
        /*
        System.out.println("nombre:");
        String nombre = sc.nextLine().setnombre();
        System.out.println("correo:");
        String correo = sc.nextLine().setCorreo();
        System.out.println("Cédula:");
        int cedula = sc.nextInt().setCedula();
        System.out.println("Asignatura:");
        int asignatura = sc.nextInt().setAsignatura();
        */
        // --- FIN CÓDIGO INCORRECTO ---
        // Corrección: se debe pedir el dato, luego llamar al setter correspondiente
        System.out.println("nombre:");
        setNombre(sc.nextLine());
        System.out.println("correo:");
        setCorreo(sc.nextLine());
        while (true) {
            try {
                System.out.println("Cédula:");
                setCedula(Integer.parseInt(sc.nextLine()));
                break;
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un número válido para la cédula.");
            }
        }
        while (true) {
            try {
                System.out.println("Asignatura (número):");
                setAsignatura(Integer.parseInt(sc.nextLine()));
                break;
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un número válido para la asignatura.");
            }
        }
    }
// Método para registrar un docente
    @Override
    public void mostrarinfo() {
        System.out.println("nombre docente: " + getNombre());
        System.out.println("Correo: " + getCorreo());
        System.out.println("Cédula: " + getCedula());
        System.out.println("Asignatura: " + getAsignatura());
    }
}
