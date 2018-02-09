public class Num{
public static void main(String arg[]){
	int ar1[] = new int[5]; 
	int ar2[] = new int[5];

	 ar1[0] = 3;
	 ar1[1] = 4;
	 ar1[2] = 7;
	 ar1[3] = 8;
	ar1[4] = 9; 

	for (int k=0;k<=4;k++){
		ar2[k] = ar1[4-k];
	}

	
	for (int k=0;k<=4;k++){
		System.out.println(ar2[k]);
	}

		
}
}