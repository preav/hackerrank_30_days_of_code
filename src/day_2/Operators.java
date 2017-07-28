/*Problem statement here:-->
 https://www.hackerrank.com/challenges/30-operators*/
package day_2;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double mealCost=scan.nextDouble();
		int tipPercent=scan.nextInt();
		int taxPercent=scan.nextInt();
		scan.close();
		mealCost=mealCost+(tipPercent*mealCost)/100+(taxPercent*mealCost)/100;
		System.out.println("The total meal cost is "+Math.round(mealCost)+" dollars.");
	}

}
