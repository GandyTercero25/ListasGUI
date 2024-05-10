import java.util.concurrent.PriorityBlockingQueue;

public class Persona {
    public  String nombre;
    public int edad;
    public String seguroSocial;

    public Persona siguiente;

    public Persona(String nombre, int edad, String seguroSocial) {
        this.nombre = nombre;
        this.edad = edad;
        this.seguroSocial = seguroSocial;
        this.siguiente = null;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getSeguroSocial() {
        return seguroSocial;
    }

    public Persona getSiguiente() {
        return siguiente;
    }

    @Override
    public String toString (){
        return "Nombre: "+nombre + "Edad: "+edad+ "Seguro: "+seguroSocial;
    }
}
