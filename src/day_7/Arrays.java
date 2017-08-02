package day_7;

import java.util.Scanner;

public class Arrays {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] A=new int[N];
		for (int i=0;i<N;i++){
			A[i]=sc.nextInt();
		}
		sc.close();
		for(int j=N-1;j>=0;j--){
			System.out.print(A[j]+" ");
		}
	}
}
