package assignment;

import java.util.*;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("Enter string:");
		String str=in.nextLine();
		char first=str.charAt(0);
		char end=str.charAt(str.length()-1);
		System.out.print("Your inverse string:"+end);
		int i=1;
		while(i!=str.length()-1) {
			System.out.print(str.charAt(i));
			i++;
		}
		System.out.print(first);
		in.close();
	}

}
