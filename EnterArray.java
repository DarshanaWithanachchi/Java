import java.util.*;
public class EnterArray{
public static void main(String arg[]){
Scanner sc=new Scanner(System.in);
	int ar[] = new int[4];
	for(int  k=0;k<=3;k++){
	System.out.println("Input a no"+(k+1));
		ar[k]=sc.nextInt();
	}
	for(int k=0;k<=3;k++)
		System.out.println(ar[k]);
}
}