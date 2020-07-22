package assignment;

public class Test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(result+"\t");
				result++;
			}
			System.out.println();
		}
	}

}
