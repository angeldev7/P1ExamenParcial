package paqueteprincipal.correccionexamen;
public abstract class persona {
 protected String nombre,correo;
 protected int cedula;
 public persona(String nombre, String correo, int cedula) {
  this.nombre = nombre;
  this.correo = correo;
  this.cedula = cedula;
 }
 public abstract void mostrarinfo();   
 public String getNombre() {
    return nombre;
    }
    public String getCorreo() {
    return correo;
    } 
    public int getCedula() {
    return cedula; }
     public void setNombre(String nombre) {
    this.nombre = nombre;}

    public void setCedula(int cedula) {
    this.cedula = cedula;  }

    public void setCorreo(String correo) {
    this.correo = correo; 
    }

}
