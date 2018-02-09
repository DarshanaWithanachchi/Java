import java.util.*;
public class ABC{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Please enter a character : ");
	char input = sc.next().charAt(0);

	if(input=='a' | input=='b' | input=='c'|input=='A' | input=='B' | input=='C')
		System.out.println(input);
	else
		System.out.println("other");
}	
}