import java.util.*;
public class InputCharacter{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	char ch = sc.next().charAt(0);

	if (ch>='0' & ch<='9')
		System.out.println("This is a number");
	
	else if (ch>='A' & ch<='Z')
		System.out.println("Upper case character");
	
	else if (ch>='a' & ch<='z')
		System.out.println("Lower case character");
	
	else 
		System.out.println("Others");
}
}