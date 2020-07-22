package assignment;
import java.util.*;
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("You entered string:");
	
		String s=in.nextLine();
	
		System.out.print("You entered number:");
	
		int num=in.nextInt();
	
		System.out.println("Your result:"+s.substring(0,num)+s.substring(num+1));
		in.close();
		
		
	}

}
