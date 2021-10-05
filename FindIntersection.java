package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		int[] array1 = {3,2,11,4,6,7};
		int[] array2 = {1,2,8,4,9,7};
		System.out.println("Array1");
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
			
		}
		System.out.println("Array2");
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
		
		System.out.println("Printing values in array1 that matches array2");
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if(array1[i]==array2[j]) {
					
					System.out.println(array1[i]);
				}
				
			}
			
		}
	}

}
