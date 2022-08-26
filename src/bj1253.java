import java.io.IOException;
import java.util.Arrays;

public class bj1253 {

	public static void main(String[] args) throws IOException {
		//Num클래스로 생성한 인스턴스는BufferReader와 StringTokenizer를 클래스로 묶어서
		//수를 입력받거나 할 때 쓰는 제가 만든 클래스입니다. bj1940 풀이코드를 보시면, 있습니다!
		Num nnum = new Num(); 
		
		int count = 0; // 최종으로 출력하고싶은 변수.
		
		nnum.recordnum();
													
		nnum.printnum();
		int N = nnum.i();
		int[] A = new int [N];

		nnum.printnum();
		for(int i = 0; i < N;i++) {
			A[i] = nnum.i();
		}
		
		Arrays.sort(A); //배열을 작은 수부터 정렬
		//투포인터 개념을 이용하여 모든 인덱스를 체크한다.
		
		// 내 방식보다는 startPoint와 endPoint가 같은지 확인하는 과정을 
		// 두 합이 A[i]와 같을 때 해당 if문 안에서 해준다면, 내 것보다 더 좋은 코드를 쓸 수 있다.
		// 아쉬운 점: 
		// 만일의 경우를 대비한 조건문이나 반복문은 한번에 처리하려고 하지말고, 
		// 꼭 해야하는 상황에 할 수 있도록 하자.
		// 예를 들어 이 코드에서는 두 수를 더한 값이 같을 때만 비교를 해주면 되었는데
		// 이 경우를 생각하지 않고 하나의 경우 때문에 여러번의 검사를 하는 실수를 범했다.
		for(int i = 0; i < N; i++) {//i의 역할은 우리가 비교해야하는 당인덱스
			int startPoint = 0; 	//첫번째 수부터 더해야 하므로 startPoint를 0으로 지정 
			int endPoint = N-1; 	//우리가 길이가 N인 배열을 생성했으니 마지막 인덱스값은 N-1
			while(startPoint != endPoint ) {// startPoint와 endPoint가 같다면 비교가 끝난것으
				if(endPoint == i ) {		// 간주함. 따라서 두 변수가 다른 동안만 반복문 시행. 
					endPoint -= 1;			
				} else if(startPoint == i) { //endPoint 혹은 startPoint가 i와 같아지면 건너뛰어야 한다.
					startPoint += 1;
				} else if(A[startPoint]+A[endPoint] == A[i]) {
					count++;
					break;
				} else if(A[startPoint]+A[endPoint]>A[i]) {
					endPoint--;
				} else {
					startPoint++;
				}
			}
		}
		
		System.out.println(count);
		nnum.bfclose();
		
	}

}

