public class OddNumber{
public static void main(String arg[]){
	int sum=0;
	for(int x=50;x<=100;x++){
		if (x%2 == 1)
			sum += x;
	}
	System.out.println(sum);		
}
}