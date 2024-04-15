public class bubblesort { 
	
	public int[] bubbleSort(int arr[]) { 
		int n = arr.length; 
		for (int i = 0; i < n; i++) {
			
				//Mostrar por pantalla cada modificación del array
				for(int z = 0; z < arr.length; z++) {
					System.out.print(arr[z]);
				}
					System.out.println("\n");
					
			for (int j = 0; j < n - 1; j++) {
				if (arr[j] > arr[j + 1]) { 
					// swap temp and arr[i] 
					int temp = arr[j]; 
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;  
				} 
			}
		}
		return arr;
	} 
	// Driver method to test above 
		public static void main(String args[]) { 
			bubblesort ob = new bubblesort(); 
			int arr[] = {5, 2, -1, 9, 10, 5, -4}; 
			ob.bubbleSort(arr); 
			System.out.println("Sorted array");
		}
}
	