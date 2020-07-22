package assignment;

import java.io.*;

public class Test7 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		System.out.print("Enter string:");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String text=br.readLine();
		System.out.print("Your string:");
		for(int i=0;i<text.length();i+=2){
			System.out.print(text.substring(i,i+2)+";");
		
		}
		br.close();
		}

}
