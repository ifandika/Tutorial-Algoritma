/**
 * @Author	Maulana Ifandika
 * 
 * | Buble Sort
 * 
 * - Mengurutkan data dengan membandingkan data n dengan n+1.
 */
public class BasicBubleSort {
	
	public static void main(String[] args) throws Exception {
		int[] myRay = {
			1, 8, 4, 2, 7, 6, 5, 3
		};
		
		bubleSort(myRay);
	}
	
	public static void bubleSort(int[] dataRay) throws Exception {
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
	
	public static void process(int[] dataRay) throws Exception {
		int tempNumRay;
		for(int firstLop = 0; firstLop < dataRay.length; firstLop++) {
			for(int secondLop = 0; secondLop < (dataRay.length - 1); secondLop++) {
				if(dataRay[secondLop] > dataRay[secondLop + 1]) {
					tempNumRay = dataRay[secondLop];
					dataRay[secondLop] = dataRay[secondLop + 1];
					dataRay[secondLop + 1] = tempNumRay;
				}
			}
		}
	}
	
}