import java.util.*;
public class Factorial{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int num = sc.nextInt();
	int fact = 1;
	for(int k=num;k>0;k--)
	fact=fact*k;
	System.out.print(fact);
}
}