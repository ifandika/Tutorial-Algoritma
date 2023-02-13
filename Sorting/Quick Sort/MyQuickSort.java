/**
 * @Author Maulana Ifandika
 * 
 * | Quick Sort
 * 
 * - Mengurutkan data dengan membagi data menjadi partisi². Dari seluruh data
 *   dipilihl salah satu data yang berada di Awal/Tengah/Akhir disebut Pivot,
 *   yang digunakan sebagai pembanding. Data yang lebih kecil dari Pivot akan
 *   ditempatkan di bagain Kiri, sedangkan yang lebih besar ditempatkan di kanan.
 */
public class MyQuickSort {
	
	public static void main(String[] args) throws Exception {
		int[] value = {
			3, 2, 5, 4, 1, 7, 6
		};
		
		mySort(value);
	}
	
	private static void mySort(<T extends Number>[] dataRay) throws Exception {
		System.out.println("== BEFORE ==");
		for(var data : dataRay) {
			System.out.print(data + ", ");
		}
		
		process(dataRay, 0, (dataRay.length - 1));
		
		System.out.println("\n== AFTER ==");
		for(var data : dataRay) {
			System.out.print(data + ", ");
		}
	}
	
	private static void process(int[] dataRay, int firstIndexRay, int lastIndexRay) throws Exception {
		int pivot = dataRay[firstIndexRay];
		int firstIndex = firstIndexRay;
		int lastIndex = lastIndexRay;
		int tempVal;
		
		while(firstIndex <= lastIndex) {
			while(dataRay[firstIndex] < pivot) {
				firstIndex++;
			}
			while(dataRay[lastIndex] > pivot) {
				lastIndex--;
			}
			if(firstIndex <= lastIndex) {
				tempVal = dataRay[firstIndex];
				dataRay[firstIndex] = dataRay[lastIndex];
				dataRay[lastIndex] = tempVal;
				firstIndex++;
				lastIndex--;
			}
		}
		// Cek kembali data dengan Rekursif
		if(firstIndexRay < lastIndex) {
			process(dataRay, firstIndexRay, lastIndex);
		}
		if(firstIndex < lastIndexRay) {
			process(dataRay, firstIndex, lastIndexRay);
		}
	}
	
}