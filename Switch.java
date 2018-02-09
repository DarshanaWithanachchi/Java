import java.util.*;
public class Switch{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	char ch=sc.next().charAt(0);
	switch(ch){
		case ('A'):System.out.println("A");break;
		case 'B':System.out.println("B");break;
		case 'C':System.out.println("C");break;
		default:
			System.out.println("not a or b or c");
	}
}
}
