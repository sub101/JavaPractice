//2���� ������ �Է� �޾� ���� ���ϴ� MultiplyŬ����
import java.util.*;
public class Sol15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("���ϰ��� �ϴ� �� �� �Է�>>");
			try{
				int n = scanner.nextInt();
				int m = scanner.nextInt();
				System.out.println(n+"x"+m+"="+n*m);
				break;
			}
			catch(InputMismatchException e) {
				System.out.println("�Ǽ��� �Է��ϸ� �ȵ˴ϴ�.");
				scanner.nextLine(); //scanner�� �̹� �Էµ� Ű ��� ����
				
			}
		}
	}

}
