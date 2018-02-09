import java.util.*;
public class Temperature{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter temperature");
	float tem = sc.nextFloat();
	System.out.println("If temperature is celcius enter c ,it is faranhite enter f");
	char ch = sc.next().charAt(0);
	float value=0.0f;
	if(ch=='c' | ch=='C'){
		value=(5*(tem-32))/9;
		System.out.println("Temperature is faranhite = "+value);
	}
	else if(ch=='f' | ch=='F'){
		value=((9*tem)/5)-32;
		System.out.println("Temperature is celciuse = "+value);
	}
	else
		System.out.println("Wrong convertor");
}
}