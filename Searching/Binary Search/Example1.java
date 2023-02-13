/**
 * @Author	Maulana Ifandika
 * 
 * | Binary Search
 */

import java.util.regex.Pattern;

public class Example1 {
	
	public static void main(String[] args) {
		String data = "Saya menjadi Software Engineering";
		System.out.println(binarySearch(data.split("\\s"), "menjadi"));
	}
	
	public static int binarySearch(String[] data, String key) {
		int begin = 0, end = (data.length -1), mid;
		if(data == null) {
			return -1;
		}
		while(begin <= end) {
			mid = (begin + end) /2;
			// if(key.compareTo(data[mid]) == 0) {
			if(data[mid].equalsIgnoreCase(key)) {
				return mid;
			}
			else if(data[begin].equals(key)) {
				return begin;
			}
			else if(data[end].equals(key)) {
				return end;
			}
			else if(end > 0) {
				begin = mid +1;
			}
			else {
				end = mid -1;
			}
		}
		return -1;
	}
	
}