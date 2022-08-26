import java.io.IOException;
import java.util.Iterator;

public class bj12891_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Num nnum = new Num();
		
		nnum.recordnum();
		nnum.printnum();
		
		int S = Math.abs(nnum.i());
		int P = Math.abs(nnum.i());
		
		char[] ars = new char[S];
		
		nnum.printnum();
		
		String str = nnum.s();
		
		for (int i = 0; i < S; i++) {
			ars[i] = str.charAt(i);
		}
		
		nnum.printnum();
		int A = nnum.i();
		int C = nnum.i();
		int G = nnum.i();
		int T = nnum.i();
		
		int Acnt = 0;
		int Ccnt = 0;
		int Gcnt = 0;
		int Tcnt = 0;
		int count = 0;
		
		for (int i = 0; i < P; i++) {
			switch (ars[i]) {
			
			case 'A': Acnt++; break;
			
			case 'C': Ccnt++; break;
			
			case 'G': Gcnt++; break;
			
			case 'T': Tcnt++; break;
			}
		}
		
		if(Acnt >= A && Ccnt >= C && Gcnt >= G && Tcnt >= T) {
			count++;
		}
		
		for(int i = 0; i<S-P ;i++) {
			
			switch (ars[i]) {
			
			case 'A': Acnt--; break;
			
			case 'C': Ccnt--; break;
			
			case 'G': Gcnt--; break;
			
			case 'T': Tcnt--; break;
			}
			
			switch (ars[i+P]) {
			
			case 'A': Acnt++; break;
			
			case 'C': Ccnt++; break;
			
			case 'G': Gcnt++; break;
			
			case 'T': Tcnt++; break;
			}
			
			if(Acnt >= A && Ccnt >= C && Gcnt >= G && Tcnt >= T) {
				count++;
			}
			
		}
		System.out.println(count);
		nnum.bfclose();
	}

}
