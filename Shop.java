import java.util.*;
public class Shop{
public static void main(String arg[]){
	String Bread,Sugar,Rice;
	int price,pb = 50,ps = 100, pr = 80;
	Scanner sc = new Scanner(System.in); 
	System.out.println("Item");
	System.out.println("01-Bread ");
		char a=sc.next().CharAt;
	System.out.println("02-Sugar");
		char b=sc.next().CharAt;
	System.out.println("03-Rice");
		char c=sc.next().CharAt;

	System.out.println("Please choose item : ");
		char d = a|b|c;
	switch(d){
		case 'a':System.out.println("Your price is : "+pb);
		case 'b':System.out.println("Your price is : "+ps);
		case 'c':System.out.println("Your price is : "+pr);
		case 'a' & 'b':System.out.println("Your price is : "+(pb+ps));
		case 'a'&'c':System.out.println("Your price is : "+(pb+pr));
		case 'b'&'c':System.out.println("Your price is : "+(pr+ps));
		case ('a'&'b'&'c'):System.out.println("Your price is : "+(pb+pr+ps));
		default:System.out.println("hgfjhfhfhj");
	}		
}
}