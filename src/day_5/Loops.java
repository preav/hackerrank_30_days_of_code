package day_5;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		for (int i=1;i<=10;i++){
			System.out.println(n+" x "+i+" = "+n*i);
		}
	}

}
