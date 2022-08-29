import java.io.IOException;
import java.util.Arrays;

public class bj11003 {

	public static void main(String[] args) throws IOException {
		Num nnum = new Num();

		nnum.recordnum();
		nnum.printnum();

		int N, L, K = 0;
		N = nnum.i();
		L = nnum.i();

		int[] A = new int[N];
		int[] Min = new int[N];

		nnum.printnum();
		for (int i = 0; i < N; i++) {
			A[i] = nnum.i();
		}

		Min[0] = A[0];

		for (int i = 1; i < L; i++) {
			if (A[i] <= Min[i - 1]) {
				Min[i] = A[i];
				K = i;
			} else {
				Min[i] = Min[i - 1];
			}
		} // Min[L] 담음.

		for (int i = L; i < N - L; i++) {

			if (Min[i - 1] >= A[i]) {
			
				Min[i] = A[i];
				
				K = i;
			
			} else if (Min[L - i] < A[i]) {
				
				Min[i] = Min[L - i];
				
			} else if (K <= i - L) {

				for (int j = i-L; j < i; j++) {
					
					if(Min[i-L]>=A[j-1]) {
						Min[i-L] = A[j-1];
					}
				}
			}

		}

		System.out.println(Arrays.toString(Min));

	}

}
