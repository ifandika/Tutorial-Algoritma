/**
 * @Author	Maulana Ifandika
 * 
 * | Selection Sort
 * 
 * - Mengurutkan data dengan membandingkan semua data lalu dilakukan
 *   pertukaran data, nilai yang sudah ditetapkan tidak akan dibandingkan lagi. 
 */
public class MySelectionSort {
	
	public static void main(String[] args) throws Exception {
		int[] myArray = {
			1, 4, 2, 6, 5, 3
		};
		
		selectionShort(myArray);
	}
	
	private static void selectionShort(int[] dataRay) throws Exception {
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
	
	/**
	 * 
	 */
	public static void process(int[] dataRay) throws Exception {
		for(int lop1 = 0; lop1 < dataRay.length; lop1++) {
			int indexArray = lop1;
			for(int lop2 = lop1; lop2 < dataRay.length; lop2++) {
				if(dataRay[indexArray] > dataRay[lop2]) {
					indexArray = lop2;
				}
			}
			int temporaryVal = dataRay[lop1];
			dataRay[lop1] = dataRay[indexArray];
			dataRay[indexArray] = temporaryVal;
		}
	}
	
}