//4*4�� 2�����迭�� ����� �̰��� 1���� 10���� ������ ������ �����ϰ� �����Ͽ� ���� 16���� �迭�� �����ϰ�, 2�����迭�� ȭ�鿡 ����϶�.
public class Sol9 {

	public static void main(String[] args) {
		int intArray[][] = new int[4][4];
		
		for(int i=0; i<4;i++) {
			for(int k=0;k<4;k++) {
				intArray[i][k] = (int)(Math.random()*10+1);
			}
		}
		
		for(int m=0;m<4;m++) {
			for(int n=0;n<4;n++) {
				System.out.print(intArray[m][n]+"   ");
			}
			System.out.println();
		}

	}

}
