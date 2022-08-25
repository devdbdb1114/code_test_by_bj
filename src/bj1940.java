import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.StringTokenizer;

public class bj1940 {

	public static void main(String[] args) throws IOException {
		Num nnum = new Num();
		
		
		nnum.recordnum();
		nnum.printnum();
		int N = nnum.i();
		
		nnum.printnum();
		int M = nnum.i();
		
		int j = 0;
		int h = 0;
		int count = 0;
		
		int[] A = new int [M]; 
		int[] B = new int [M]; 
		
		nnum.printnum();
		for (int i = 0; i < N; i++) {
			int k = nnum.i();
			if ( k > (int)M/2 ) {
				A[j] = k;
				j++;
			} else {
				B[h] = k;
				h++;
			}
		}
				
		for (int i = 0; i < j; i++) {
			for (int k = 0; k < h; k++) {
				if(A[i] + B[k] == M)
					count++;
			}
		}
		
		System.out.println(count);
		
		
	}

}

class Num {
	
	BufferedReader br;
	StringTokenizer stringTokenizer;

	
	void recordnum() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
	}
	
	void printnum() throws IOException {	
		
	
	stringTokenizer = new StringTokenizer(br.readLine());

	}
	 
	int i() {	return Integer.parseInt(stringTokenizer.nextToken());	}
}
