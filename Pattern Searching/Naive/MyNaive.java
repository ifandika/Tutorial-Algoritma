
public class MyNaive {
	
	public static void main(String[] args) {
		
		String data = "Indonesia";
		
		System.out.println(naive(data, "zdone"));
	}
	
	public static int naive(String data, String key) {
		int indxKey = 0;
		
		for(int lop = 0; lop < data.length()-1; lop++) {
			if((int)data.charAt(lop) == (int)key.charAt(indxKey)) {
				// lanjut cek data key selanjutnya
				indxKey++;
			}
			if(indxKey == (key.length()-1)) {
				return lop - (key.length()-1) +1;
			}
		}
		return -1;
	}
}