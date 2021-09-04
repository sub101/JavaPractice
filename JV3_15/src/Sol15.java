//2개의 정수를 입력 받아 곱을 구하는 Multiply클래스
import java.util.*;
public class Sol15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("곱하고자 하는 두 수 입력>>");
			try{
				int n = scanner.nextInt();
				int m = scanner.nextInt();
				System.out.println(n+"x"+m+"="+n*m);
				break;
			}
			catch(InputMismatchException e) {
				System.out.println("실수는 입력하면 안됩니다.");
				scanner.nextLine(); //scanner에 이미 입력된 키 모두 제거
				
			}
		}
	}

}
