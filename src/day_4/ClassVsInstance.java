/*Check Hackerrank 30 days of code- day 4 for the problem statement*/
package day_4;

import java.util.Scanner;

public class ClassVsInstance {
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int T=sc.nextInt();
	while (T>0){
		int age=sc.nextInt();
		Person per=new Person(age);
		per.amIOld();
		for (int i=0;i<3;i++){
			per.yearPasses();
		}
		per.amIOld();
	}
	sc.close();
}
}
