/**
 * @Author	Maulana Ifandika
 * 
 * | Merge Sort
 * 
 * - Mengurutkan data dengan cara memecah data hingga data menjadi satuan.
 *	 Lalu data di urutkan dengan cara dibandingkan data dengan data yang lain,
 *   proses pengurutan dilakukan secara bersamaan saat penggabungan data.
 */
public class MyMergeSort {
	
	public static void main(String[] args) throws Exception {
		int[] myArray = {
			1, 10, 2, 9, 5, 7, 4, 3, 8, 6, 11,
			16, 12, 13, 17, 14, 19, 18, 20, 22,
			25, 23, 21, 24, 29, 26, 27, 28, 30
		};
		
		mergeSort(myArray);
	}
	
	private static void mergeSort(int[] dataRay) throws Exception {
		System.out.println("[ BEFORE ]");
		for(var data : dataRay) {
			System.out.print(data + ", ");
		}
		
		dataRay = process(dataRay);
		
		System.out.println("\n[ AFTER ]");
		for(var data : dataRay) {
			System.out.print(data + ", ");
		}
		System.out.println();
	}
	
	public static int[] process(int[] dataRay) throws Exception {
		int[] leftRayData, rightRayData, finalResult;
		int supportIndex = 0;
		
		if(dataRay.length <= 1) {
			return dataRay;
		}
		leftRayData = new int[dataRay.length / 2];
		if(dataRay.length %2 == 0) {
			rightRayData = new int[dataRay.length / 2];
		}
		else {
			rightRayData = new int[(dataRay.length /2) +1];
		}
		for(int lop = 0; lop < dataRay.length; lop++) {
			if(lop < leftRayData.length) {
				leftRayData[lop] = dataRay[lop];
			}
			else {
				rightRayData[supportIndex] = dataRay[lop];
				supportIndex++;
			}
		}
		leftRayData = process(leftRayData);
		rightRayData = process(rightRayData);
		
		dataRay = processShort(leftRayData, rightRayData);
		
		return dataRay;
	}
	
	public static int[] processShort(int[] leftRayData, int[] rightRayData) throws Exception {
		int leftIndex = 0, rightIndex = 0, resultIndex = 0;
		int[] result = new int[leftRayData.length + rightRayData.length];
		
		while(leftIndex < leftRayData.length || rightIndex < rightRayData.length) {
			if(leftIndex < leftRayData.length && rightIndex < rightRayData.length) {
				if(leftRayData[leftIndex] < rightRayData[rightIndex]) {
					result[resultIndex] = leftRayData[leftIndex];
					leftIndex++;
				}
				else {
					result[resultIndex] = rightRayData[rightIndex];
					rightIndex++;
				}
			}
			else if(leftIndex < leftRayData.length) {
				result[resultIndex] = leftRayData[leftIndex];
				leftIndex++;
			}
			else if(rightIndex < rightRayData.length) {
				result[resultIndex] = rightRayData[rightIndex];
				rightIndex++;
			}
			resultIndex++;
		}
		return result;
	}
	
}