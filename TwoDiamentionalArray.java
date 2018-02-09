import java.util.*;
public class TwoDiamentionalArray{
public static void main(String arg[]){
Scanner sc=new Scanner(System.in);
	int ar[][]=new int[3][5];

	for(int row=0;row<=2;row++)
		for(int col=0;col<=4;col++)
			ar[row][col]=row;

	for(int row=0;row<=2;row++){
		for(int col=0;col<=4;col++)
			System.out.print(ar[row][col]);
			System.out.println();
	}
}	
}

