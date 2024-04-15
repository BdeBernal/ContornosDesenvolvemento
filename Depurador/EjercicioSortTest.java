import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.Test;

public class bubblesortTest {

	@Test
	public void todosIguales() {
		bubblesort ob = new bubblesort(); 
		int arr[] = {5, 5, 5, 5};
		int esperado[] = {5, 5, 5, 5};
		//Compruebo si el array que espero es el que sale
		assertArrayEquals(esperado, ob.bubbleSort(arr));
	}
	
	@Test
	public void positivosYNegativos() {
		bubblesort ob = new bubblesort(); 
		int arr[] = {2, 1, 0, -1, -2};
		int esperado[] = {-2, -1, 0, 1, 2};
		
		assertArrayEquals(esperado, ob.bubbleSort(arr));
	}
	
	@Test
	public void sinNumeros() {
		bubblesort ob = new bubblesort(); 
		int arr[] = {};
		int esperado[] = {};
		
		assertArrayEquals(esperado, ob.bubbleSort(arr));
	}
	
	@Test
	public void soloUnNumero() {
		bubblesort ob = new bubblesort(); 
		int arr[] = {4};
		int esperado[] = {4};
		
		assertArrayEquals(esperado, ob.bubbleSort(arr));
	}
	
	@Test
	public void valorMaximo() {
		bubblesort ob = new bubblesort(); 
		int arr[] = {2147483647, 0, -2147483647};
		int esperado[] = {-2147483647, 0, 2147483647};
		
		assertArrayEquals(esperado, ob.bubbleSort(arr));
	}
}
