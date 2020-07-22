package assignment;
import java.io.*;
public class test1 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		System.out.print("Enter string:");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String text=br.readLine();
		
		char sign=text.charAt(text.length()-1);
		System.out.println(sign+text+sign);
		br.close();
	}

}
