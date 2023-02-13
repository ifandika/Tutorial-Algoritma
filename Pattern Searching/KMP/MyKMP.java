
public class MyKMP {
	
	public static void main(String[] args) {
		
		String data = "ABCBABAAABC";
		
		kmp(data, "BA");
	}
	
	public static void kmp(String data, String key) {
		int M = key.length() -1;
        int N = data.length() -1;
        int lps[] = new int[key.length()];
        int j = 0; // index for pat[]
 
        // Preprocess the pattern (calculate lps[]
        // array)
        process(key, M, lps);
 
        int i = 0; // index for txt[]
        while (i < N) {
            if (key.charAt(j) == data.charAt(i)) {
                j++;
                i++;
            }
            if (j == M) {
                System.out.println("Found pattern " + "at index " + (i - j));
                j = lps[j - 1];
            }
 
            // mismatch after j matches
            else if (i < N && key.charAt(j) != data.charAt(i)) {
                // Do not match lps[0..lps[j-1]] characters,
                // they will match anyway
                if (j != 0)
                    j = lps[j - 1];
                else
                    i = i + 1;
            }
        }
	}
	
	public static void process(String key, int dataLength, int lps[]) {
		int len = 0;
        int i = 1;
        lps[0] = 0;
        while (i < dataLength) {
            if (key.charAt(i) == key.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            }
            else {
                // This is tricky. Consider the example.
                // AAACAAAA and i = 7. The idea is similar
                // to search step.
                if (len != 0) {
                    len = lps[len - 1];
 
                    // Also, note that we do not increment
                    // i here
                }
                else {
                    lps[i] = len;
                    i++;
                }
            }
        }
	}
}