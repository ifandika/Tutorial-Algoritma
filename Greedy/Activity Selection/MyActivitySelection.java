
public class MyActivitySelection {
	
	public static void main(String[] args) {
		
		/**
		 * Mencari nilai Max dari sebuah Array
		 */
		int[] firstArr = {1, 3, 0, 5, 8, 5};
		int[] twoArr = {2, 4, 6, 7, 9, 9};
		
		// Nilai panjang diambil dari Array yang digunakan untuk perulangan.
		printMaxNum(firstArr, twoArr, firstArr.length);
		System.out.println();
	}
	
	public static void printMaxNum(int[] arr1, int[] arr2, int length) {
		int indxArr1 = 1;
		int indxArr2 = 0;
		
		System.out.print(indxArr2 + " ");
		// Array pertama digunakan untuk perulangan
		while(indxArr1 < length) {
			
			if(arr1[indxArr1] >= arr2[indxArr2]) {
				System.out.print(indxArr1 + " ");
				indxArr2 = indxArr1;
			}
			indxArr1++;
		}
	}
	
}