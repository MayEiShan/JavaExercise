package assignment;

import java.util.*;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("Enter number:");
		int num=in.nextInt();
		int result=1;
		for(int i=1;i<=num;i++) {
			result*=i;
		}
		System.out.println("Your factorial numbers:"+result);
		in.close();
	}

}
