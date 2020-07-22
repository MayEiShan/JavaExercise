package assignment;
import java.util.*;
public class Test13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("Enter first number:");
		int num1=in.nextInt();
		System.out.print("Enter second number:");
		int num2=in.nextInt();
		System.out.print("Enter operator:");
		String op=in.next();
		
		switch(op) {
		case("+"):System.out.print("Your sum:"+(num1+num2));break;
		case("-"):System.out.print("Your subtraction:"+(num1-num2));break;
		case("*"):System.out.print("Your multiplication:"+(num1*num2));break;
		case("%"):System.out.print("Your division:"+(num1%num2));break;
		}
		in.close();
	}

}
