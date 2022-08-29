import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

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
	
	String s() { return stringTokenizer.nextToken(); }
	
	void bfclose() throws IOException{
		br.close();
	}
}
