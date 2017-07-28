package day_4;

public class Person {
int age;
Person(int initialAge){
if(initialAge>=0)	age=initialAge;
else {
	System.out.println("Age is not valid, setting age to 0.");
	age=0;
}
}
void yearPasses(){
	age++;
}
void amIOld(){
	if(age<13) System.out.println("You are young.");
	else if(age>=13 && age<18) System.out.println("You are a teenager.");
	else System.out.println("You are old.");
}
}
