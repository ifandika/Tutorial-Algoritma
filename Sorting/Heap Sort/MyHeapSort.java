/**
 * @Author	Maulana Ifandika
 * 
 * | Heap Sort
 * 
 * - 
 */
public class MyHeapSort {
	
	public static void main(String[] args) {
		int[] myArr = {
			100, 99, 28, 27, 15, 55, 38, 5
		};
		
		heapSort(myArr);
	}
	
	public static void heapSort(int[] dataArr) {
		for(int lop = (dataArr.length /2 -1); lop >= 0; lop--) {
			process(dataArr, dataArr.length, lop);
		}
		
		for(int lop = (dataArr.length-1); lop > 0; lop--) {
			int tempNum = dataArr[0];
			dataArr[0] = dataArr[lop];
			dataArr[lop] = tempNum;
			process(dataArr, lop, 0);
		}
		
		for(var e : dataArr) {
			System.out.print(e+", ");
		}
		System.out.println();
	}
	
	public static void process(int[] dataArr, int size, int indx) {
		int largest = indx;
		int left = 2 *indx +1;
		int right = 2 *indx +2;
		
		if(left < size && dataArr[left] > dataArr[largest]) {
			largest = left;
		}
		if(right < size && dataArr[right] > dataArr[largest]) {
			largest = right;
		}
		if(largest != indx) {
			int swap = dataArr[indx];
			dataArr[indx] = dataArr[largest];
			dataArr[largest] = swap;
			
			process(dataArr, size, largest);
		}
	}
	
}