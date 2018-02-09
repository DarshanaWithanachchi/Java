import java.util.*;
public class Grade{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Please enter First mark:");
	float a=sc.nextInt();
	System.out.println("Please enter Second mark:");
	float b=sc.nextInt();
	System.out.println("Please enter Thired mark:");
	float c=sc.nextInt();

	float avg=(a+b+c)/3;

	if ((100>=avg) && (avg>=75)){
		System.out.println("A");
	}
	else if ((75>avg) && (avg>=65)){
		System.out.println("B");
	}
	else if ((65>avg) && (avg>=55)){
		System.out.println("C");
	}
	else if ((55>avg) && (avg>=45)){
		System.out.println("Pass");
	}
	else if ((45>avg) && (avg>=0)){
		System.out.println("Fail");
	}
	else{
		System.out.println("Invalid mark");
	}
}
}