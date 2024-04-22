/**
 * Ejercicio para aprender a documentar
 * @author Xulio 
 * @version %I%, %G%
 */
public class Persona {

    private String nombre;
    private int edad;
    /**
     * Constructor Persona para crear objetos a partir de los atributos declarados
     * @param nombre length > 0
     * @param edad int > 0
     */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    /**
     * Asignado en el constructor
     * o mediante el método setNombre(String)
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Nombre que recibe el método para asignar
     * @param nombre length > 0
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Asignada en el constructor
     * o mediante el método setEdad(int edad)
     * @return edad
     */
    public int getEdad() {
        return edad;
    }
    /**
     * Edad que recibe el método para asignar
     * @param edad int > 0
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    /**
     * Imprime por pantalla la edad y nombres asignados
     */
    public void imprimirDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}