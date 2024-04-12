import java.util.Arrays;  
    import java.util.Scanner;  
    
public class Anagrama {
		//Atributos
        Scanner input = new Scanner(System.in);   
        String str1, str2;
        char [] charArray1, charArray2;
        boolean result;   
    
        //Metodo sin consola on return boolean
    public boolean CadenasSinConsola() {

    	  if(str1.length() == str2.length()) {  
	          charArray1 = str1.toCharArray();  
	          charArray2 = str2.toCharArray(); 
	          
	          Arrays.sort(charArray1);  
	          Arrays.sort(charArray2); 
	          
	          result = Arrays.equals(charArray1, charArray2);
	          
	          if(result) {
	        	  return true;
	          }
	          else {
	        	  return false;
	          }
    	  }
    	  else {
    		  return false;
    	  }
      }
    
    Anagrama(String str1, String str2){
    	this.str1 = str1;
    	this.str2 = str2;
    }
         
}