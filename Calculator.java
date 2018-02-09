import java.util.*;
public class Calculator{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.print("Please enter first number :");
	float num1 = sc.nextFloat();
	
	System.out.print("Please enter first operator :");
	char op = sc.next().charAt(0);
	
	System.out.print("Please enter second number :");
	float num2 = sc.nextFloat();

	switch(op){
		case '+':System.out.println(num1+num2);break;
		case '-':System.out.println(num1-num2);break;
		case '*':System.out.println(num1*num2);break;
		case '/':if(num2 != 0){
				System.out.println(num1/num2);
			 }
		        	else{
				System.out.println("Div by zero");
				}
		default:System.out.println("wrong operator");
	}
}
}