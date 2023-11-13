package ud1;

public class Perrito {

    // Atributos

    String nombre;
    String raza;
    String color;
    boolean chip;
    int numero;

    // Metodos

    public void ladrar() {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
             System.out.println("Guau, miau");
             i = i + 1;
        }
    }

    public void dormir() {
        System.out.println("Marcho durmir");
    }

    public void pedirComida() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            System.out.println("Guau, guau");
        }
    }

    // Getters & Setters

    public String getNombre() {
        return nombre;
    }
    
    public String setNombre(String nombre) {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public String setRaza(String raza) {
        return raza;
    }

    public String getColor() {
        return color;
    }

    public String setColor(String color) {
        return color;
    }

    public boolean getChip() {
        return chip;
    } 

    public boolean setChip() {
        return chip;
    }

    public int getNumero() {
        return numero;
    }

    public int setNumero() {
        return numero;
    }
}