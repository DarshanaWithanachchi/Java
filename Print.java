import java.util.*;
public class Print{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Input num1");
	int num1=sc.nextInt();
	switch(num1){
		case 1 : System.out.println("One");break;
		case 2 : System.out.println("two");break;
		case 3 : System.out.println("Three");break;
		default: System.out.println("not 1 or 2 or 3");
	}
}
}
