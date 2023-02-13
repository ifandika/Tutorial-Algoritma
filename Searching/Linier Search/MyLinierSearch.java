/**
 * @Author	Maulana Ifandika
 * 
 * | Linier Search
 * 
 * - Mencari sebuah data dengan membandingkan per data dengan key
 *   dari awal hingga data habis.
 */
public class MyLinierSearch {
	
	public static void main(String[] args) {
		int key = 5;
		int[] data = {
			10, 8, 2, 6, 4, 9, 7, 3, 1, 5
		};
		
		System.out.println(linierSearch(key, data));
	}
	
	public static boolean linierSearch(int key, int[] data) {
		if(data.length <= 1) {
			return false;
		}
		for(int lop = 0; lop < data.length; lop++) {
			if(key == data[lop]) {
				return true;
			}
		}
		return false;
	}
	
}