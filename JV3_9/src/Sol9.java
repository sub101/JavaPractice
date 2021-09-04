//4*4의 2차원배열을 만들고 이곳에 1에서 10까지 범위의 정수를 랜덤하게 생성하여 정수 16개를 배열에 저장하고, 2차원배열을 화면에 출력하라.
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
