/*Input Format
The first line contains an integer that you must sum with i.
The second line contains a double that you must sum with d.
The third line contains a string that you must concatenate with s.

Output Format
Print the sum of both integers on the first line, 
the sum of both doubles (scaled to decimal place) on the second line, 
and then the two concatenated strings on the third line.*/
package day_1;

import java.util.Scanner;

public class DataTypes {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=Integer.parseInt(sc.nextLine());
		double num2=Double.parseDouble(sc.nextLine());
		String str=sc.nextLine();
		sc.close();
		int i=4;
		double d=4.0;
		String s="Hackerrank ";
		System.out.println(i+num);
		System.out.println(d+num2);
		System.out.println(s.concat(str));
	}

}
