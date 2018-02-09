import java.util.*;
public class TwoArray{
public static void main(String arg[]){
Scanner sc=new Scanner(System.in);
	int ar1[] = new int[6];
	int ar2[] = new int[6];

	for(int  k=0;k<=5;k++){
		System.out.println("Input a no"+(k+1));
			ar1[k]=sc.nextInt();
	}
	for(int k=0;k<=5;k++)
		ar2[k] = ar1[k];

	for(int k=0;k<6;k++)
		System.out.println(ar2[k]);
}
}