import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;

public class bj11003_2 {

	public static void main(String[] args) throws IOException {
		Num nnum = new Num();
		
		nnum.recordnum();
		nnum.printnum();
		
		int N = nnum.i();
		int L = nnum.i();
		
		int [] A = new int[N+1];
		int [] B = new int[N+1];
		int [] C = new int[N+1];
		int [] D = new int[N+1];
		
		nnum.printnum();
		for (int i = 1; i <= N; i++) {
			A[i] = nnum.i();
			B[i] = A[i];
		}
		
		Arrays.sort(A);
		
		for (int i = 1; i <= N; i++) {
			C[i] = Arrays.binarySearch(B,A[i]);
			A[i] = 110;
		}
		
		System.out.println(Arrays.toString(C));
		
//		for (int i = N; i>=1; i--) {
//			for (int j = C[i]; j< C[i]+L && j<=N; j++) {
//				if(C[i] == C[i+1]) {
//					D[j] = C[i];
//					break;
//				}
//				D[j] = B[C[i]];
//			}
//		}
//		System.out.println(Arrays.toString(D));
	}

}
