package assignment;
import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test4 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		System.out.print("Enter string:");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String text=br.readLine();
		System.out.println("Your Reverse String:"+text.substring(0,3)+text+text.substring(0,3));
		br.close();

	}

}
