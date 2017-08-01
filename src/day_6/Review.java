package day_6;

import java.util.Scanner;

public class Review {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while (T>0){
			String S=sc.next();
			char[] arr=S.toCharArray();
			int len=arr.length;
			String even="";
			String odd="";
			for(int i=0;i<len;i++){
				if (i%2==0){
					even=even+arr[i];
				}
				else{
					odd=odd+arr[i];
				}
			}
			System.out.println(even+" "+odd);
		}
		sc.close();
	}

}
