import java.util.Arrays;
import java.util.Scanner;

public class DemoAnagrama {
	//Atributos
	Scanner input = new Scanner(System.in);   
    String str1, str2;
    char [] charArray1, charArray2;
    boolean result; 

    //Método pedir por consola
	public boolean pedirCadenasConsola() {
    	System.out.println("Cadena de caracteres 1: ");
    	str1 = input.nextLine();  
    	System.out.println("Cadena de caracteres 2: ");
    	str2 = input.nextLine();  

    	  if(str1.length() == str2.length()) {  
	          charArray1 = str1.toCharArray();  
	          charArray2 = str2.toCharArray(); 
	          
	          Arrays.sort(charArray1);  
	          Arrays.sort(charArray2); 
	          
	          result = Arrays.equals(charArray1, charArray2);
	          
	          if(result == true) {
	        	  System.out.println("Forman un anagrama");
	        	  return true;
	          }
	          else {
	        	  System.out.println("No forman un anagrama");
	        	  return false;
	          }
    	  }
    	  else {
    		  System.out.println("No forman un anagrama");
    		  return false;
    	  }
      }
	
	public static void main(String[] args) {
		DemoAnagrama da = new DemoAnagrama();
		da.pedirCadenasConsola();
	}
}