/*정수를 몇 개 저장할지 키보드로부터 개수를 입력받아(100보다 작은 개수) 정수 배열을 생성하고, 이곳에서 1에서 100까지 범위의 정수를 랜덤하게 삽입하라.
배열에는 같은 수가 없도록 하고 배열을 출력하라*/
import java.util.Scanner;
public class Sol8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 몇개?(100보다 작은 수)>> ");
		
		int num = scanner.nextInt();
		
		int intArray[] = new int[num];

		for(int i=0;i<num;i++) {
			intArray[i] = (int)(Math.random()*100+1);
			
			for(int k=0;k<i;k++) {
				if(intArray[i] == intArray[k]) {
					do {
						intArray[i] = (int)(Math.random()*100+1);
					}while(intArray[i] != intArray[k]);
				}
			}
			
		}
		
		for(int n=0;n<num;n++) {   //배열 출력
			System.out.print(intArray[n]+" ");
		}

	}

}
