/*������ �� �� �������� Ű����κ��� ������ �Է¹޾�(100���� ���� ����) ���� �迭�� �����ϰ�, �̰����� 1���� 100���� ������ ������ �����ϰ� �����϶�.
�迭���� ���� ���� ������ �ϰ� �迭�� ����϶�*/
import java.util.Scanner;
public class Sol8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���� �?(100���� ���� ��)>> ");
		
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
		
		for(int n=0;n<num;n++) {   //�迭 ���
			System.out.print(intArray[n]+" ");
		}

	}

}
