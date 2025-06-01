package paqueteprincipal.correccionexamen;
// Faltó en el examen: import java.util.*;
import java.util.*;
public class Estudiante extends persona {
    private int materia;
    private double calificacion;
    public Estudiante(String nombre, String correo, int cedula, int materia, double calificacion) {
        super(nombre, correo, cedula);
        this.materia = materia;
        this.calificacion = calificacion;
    }
    public int getMateria() {
        return materia;
    }
    
    public void setMateria(int materia) {
        this.materia = materia;
    }
    public double getCalificacion() {
        return calificacion;
    }
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
    // Método para registrar un estudiante con validación y manejo de excepciones
    public void registro() {
        Scanner sc = new Scanner(System.in);
        // --- CÓDIGO INCORRECTO DEL EXAMEN ---
        // (No se implementó el registro en el examen)
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
                System.out.println("Materia (número):");
                setMateria(Integer.parseInt(sc.nextLine()));
                break;
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un número válido para la materia.");
            }
        }
        while (true) {
            try {
                System.out.println("Calificación:");
                setCalificacion(Double.parseDouble(sc.nextLine()));
                break;
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un número válido para la calificación.");
            }
        }
    }
    // Método para mostrar la información del estudiante
    @Override  
    public void mostrarinfo() {
        // --- CÓDIGO INCORRECTO DEL EXAMEN ---
        // (No se implementó mostrarinfo en el examen)
        // --- FIN CÓDIGO INCORRECTO ---
        System.out.println("nombre estudiante: " + getNombre());
        System.out.println("Correo: " + getCorreo());
        System.out.println("Cédula: " + getCedula());
        System.out.println("Materia: " + getMateria());
        System.out.println("Calificación: " + getCalificacion());
    }
}
