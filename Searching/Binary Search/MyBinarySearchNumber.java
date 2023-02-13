/**
 * @Author	Maulana Ifandika
 * 
 * | Binary Search
 * 
 * - Mencari sebuah data dengan membagi 2 dari banyak data hingga
 *   data yang dicari ditemukan.
 */
public class MyBinarySearchNumber {
	
	public static void main(String[] args) {
		
		int[] myArr = {
			2, 4, 6, 7, 1, 8, 100, 20, 27, 19, 99, 277, 1000, 588, 230
		};
		
		System.out.println(binarySearch(myArr, 2));
	}
	
	public static boolean binarySearch(int[] dataArr, int key) {
		int mid, 
		    begin = 0, 
		    end = (dataArr.length -1);
		while(begin <= end) {
			mid = (begin + end) /2;
			// jika key pada val mid/begin/and
			if(dataArr[mid] == key || dataArr[begin] == key || dataArr[end] == key) {
				return true;
			}
			// karena data acak maka key bisa saja ada di bagin 
			// kanan/kiri
			if(key > dataArr[mid] || key < dataArr[mid]) {
				begin = mid + 1;
			}
			else {
				end = mid - 1;
			}
		}
		return false;
	}
}