public class Gato extends Animal implements Imprimible{

    public void animalSound(){
    System.out.println("Miau, miau");
   }

   public void sleep() {
    super.sleep();
    System.out.println("RrrRrrRrrRrr");
    }

    public String toString() {
        return "Soy un gato";
    }

    public void print() {
        System.out.println("Imprimiendo gato...");
    }    
}
