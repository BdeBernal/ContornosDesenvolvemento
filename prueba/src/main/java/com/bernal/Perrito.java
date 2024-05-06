package com.bernal;
/**
 * Clase perrito
 */
public class Perrito {

     /**
      * String nombre del perro
      * @param nombre
      * String raza del perro
      * @param raza
      * String color del perro
      * @param color
      * Boolean chip del perro
      * @param chip 
      * Int de numero del perro
      * @param numero
      */
     String nombre;
     String raza;
     String color;
     boolean chip;
     int numero;
 
        /**
         * Metodo ladrar, bucle que imprime por pantalla 10 veces un mensaje
         */
     public void ladrar() {
         int i = 0;
         while (i < 10) {
             System.out.println(i);
              System.out.println("Guau, miau");
              i = i + 1;
         }
     }
 
     /**
      * Metodo dormir, imprime por pantalla un mensaje
      */
     public void dormir() {
         System.out.println("Marcho durmir");
     }
 
     /**
      * Metodo pedirComida, bucle que imprime por pantalla 10 veces un mensaje
      */
     public void pedirComida() {
         for (int i = 0; i < 10; i++) {
             System.out.println(i);
             System.out.println("Guau, guau");
         }
     }
 
     /**
      * Metodo getNombre()
      * @return String nombre
      */
 
     public String getNombre() {
         return nombre;
     }
     
     /**
      * Metodo setNombre()
      * @param nombre
      * @return String nombre
      */
     public String setNombre(String nombre) {
         return nombre;
     }
 
     /**
      * Metodo getRaza()
      * @return String raza
      */
     public String getRaza() {
         return raza;
     }
 
     /**
      * Metodo setRaza()
      * @param raza
      * @return String raza
      */
     public String setRaza(String raza) {
         return raza;
     }
 
     /**
      * Metodo getColor()
      * @return color
      */
     public String getColor() {
         return color;
     }
 
     /**
      * Metodo setColor()
      * @param color
      * @return String color
      */
     public String setColor(String color) {
         return color;
     }
 
     /**
      * Metodo getChip()
      * @return boolean chip;
      */
     public boolean getChip() {
         return chip;
     } 
 
     /**
      * Metodo setChip()
      * @return boolean chip
      */
     public boolean setChip() {
         return chip;
     }
 
     /**
      * Metodo getNumero()
      * @return int numero
      */
     public int getNumero() {
         return numero;
     }
 
     /**
      * Metodo setNumero()
      * @return int numero
      */
     public int setNumero() {
         return numero;
     }
}
