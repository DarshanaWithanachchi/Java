import java.util.*;
public class ArrayOdd{
public static void main(String arg[]){
Scanner sc=new Scanner(System.in);
	int num[] = new int[4];

	for (int k=0;k<=3;k++){
		System.out.println("Input a no " +(k+1));
			num[k]=sc.nextInt();
	}
	
	for(int k=0;k<4;k++){
	   if(num[k]%2 == 1)
		System.out.println(num[k]);
	} 
}
}