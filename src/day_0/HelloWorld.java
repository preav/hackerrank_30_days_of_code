/*Input Format
A single line of text denoting (the variable whose contents must be printed).

Output Format
Print Hello, World. on the first line, and the contents of on the second line.*/
package day_0;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		sc.close();
		System.out.println("Hello! World.");
		System.out.println(str);
	}

}
