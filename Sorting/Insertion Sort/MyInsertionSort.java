/**
 * @Author	Maulana Ifandika
 * 
 * | Insertion Sort
 * 
 * - Mengurutkan data dengan cara membandingkan data n dengan n-1.
 */
public class MyInsertionSort {
	
	public static void main(String[] args) {
		int[] myArray = {
			2, 5, 1, 4, 3
		};
		
		insertionSort(myArray);
	}
	
	public static void insertionSort(int[] dataRay) {
		System.out.println("[ BEFORE ]");
		for(var data : dataRay) {
			System.out.print(data + ", ");
		}
		
		process(dataRay);
		
		System.out.println("\n[ AFTER ]");
		for(var data : dataRay) {
			System.out.print(data + ", ");
		}
		System.out.println();
	}
	
	public static void process(int[] dataRay) {
		for(int lop1 = 0; lop1 < dataRay.length; lop1++) {
			int num = lop1;
			while(num > 0) {
				if(dataRay[num] < dataRay[num-1]) {
					int tempNum = dataRay[num];
					dataRay[num] = dataRay[num-1];
					dataRay[num-1] = tempNum;
				}
				num--;
			}
		}
	}
	
}