import java.util.*;
public class SumArray{
public static void main(String arg[]){
Scanner sc = new Scanner(System.in);
	int ar[] = new int[3];
	int sum=0;
	
	for(int k=0;k<=2;k++){
		System.out.println("Enter number "+ (k+1));
		ar[k] = sc.nextInt();
		sum += ar[k];
	}
	System.out.println(sum);
	
}
}