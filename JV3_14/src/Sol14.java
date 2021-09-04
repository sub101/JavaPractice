/*과목과 점수가 짝을 이루도록 2개의 배열을 작성하라. 그리고 과목 이름을 입력받아 점수를 출력하는 프로그램을 작성하라.
 "그만"을 입력받으면 종료*/
import java.util.Scanner;
public class Sol14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String course [] = {"java","C++","HTML5","컴퓨터구조","안드로이드"};
		int score [] = {98, 88, 76, 62, 55};
		
		String name;
		
		do {
			System.out.print("과목이름>>");
			name = scanner.nextLine();
			
			for(int i=0;i<5;i++) {
				if(course[i].equals(name)) {
					System.out.println(course[i]+"의 점수는 "+score[i]);
				}
				else {
					continue;
				}
			}
		}while(!name.equals("그만"));
		
	}

}