/*����� ������ ¦�� �̷絵�� 2���� �迭�� �ۼ��϶�. �׸��� ���� �̸��� �Է¹޾� ������ ����ϴ� ���α׷��� �ۼ��϶�.
 "�׸�"�� �Է¹����� ����*/
import java.util.Scanner;
public class Sol14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String course [] = {"java","C++","HTML5","��ǻ�ͱ���","�ȵ���̵�"};
		int score [] = {98, 88, 76, 62, 55};
		
		String name;
		
		do {
			System.out.print("�����̸�>>");
			name = scanner.nextLine();
			
			for(int i=0;i<5;i++) {
				if(course[i].equals(name)) {
					System.out.println(course[i]+"�� ������ "+score[i]);
				}
				else {
					continue;
				}
			}
		}while(!name.equals("�׸�"));
		
	}

}