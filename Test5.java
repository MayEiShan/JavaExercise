package assignment;
import java.util.*;
public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner in=new Scanner(System.in);
	System.out.println("Enter a string:");
	String lower=in.nextLine();
	char ch[]=lower.toCharArray();
	
	for(int i=0;i<lower.length();i++) {
	if(i==0 && ch[i]!=' ' || ch[i]!=' ' && ch[i-1]==' ') {
		if(ch[i]>='a' && ch[i]<='z') {
			ch[i]=(char)(ch[i]-'a'+'A');
		}
		else if(ch[i]>='A' && ch[i]<='Z') {
			ch[i]=(char)(ch[i]+'a'-'A');
		}
	}
	
	}
	String st=new String(ch);
	System.out.println("The first word is uppercase:"+st);
	in.close();
	}

}
