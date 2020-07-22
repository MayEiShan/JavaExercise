package assignment;

import java.util.*;
import java.util.Arrays;

public class Test9 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("Enter array length:");
		int len=in.nextInt();
		int arr[]=new int[len];
		System.out.print("Enter array value:");
		for(int i=0;i<len;i++) {
			
			arr[i]=in.nextInt();
		}
		float sum=0f;
		float avg=0f;
		for(int i=0;i<arr.length;i++) {
			 sum += arr[i];
			 
		}
		avg =sum/len;
		System.out.println("Your average number is:"+avg);
		Arrays.sort(arr);
		System.out.println("First Max:"+arr[arr.length-2]+"\tSecond Max:"+arr[arr.length-1]);
		System.out.println("First Min:"+arr[0]+"\tSecond Max:"+arr[1]);	
		in.close();
	}

}
