import java.io.IOException;
import java.util.Stack;

public class bj1874_2 {

	public static void main(String[] args) throws IOException {
		Num nnum = new Num();

		nnum.recordnum();
		nnum.printnum();

		int N = nnum.i();
		int k = 0;

		int[] A = new int[N];

		for (int i = 0; i < N; i++) {
			nnum.printnum();
			A[i] = nnum.i();
		}

		Stack<Integer> stack = new Stack<>();
		Stack<Character> PNM = new Stack<>();

		int i = 1;

		while (i <= N) {

			stack.add(i);
			PNM.add('+');
			while (stack.peek() == A[k]) {
				stack.pop();
				PNM.add('-');
				k++;
				if(stack.empty() == true)break;
			}
			i++;
		}
		
		char C [] = new char[N*2];
		
		for (int j = 0; PNM.empty() == false ; j++) {
			C[j] = PNM.peek();
			PNM.pop();
		}
		
		if (stack.empty() == true) {
			for (int j = N*2-1; j >= 0; j--) {
				System.out.println(C[j]);
			}
		} else {
			System.out.println("NO");
		}
	}

}
