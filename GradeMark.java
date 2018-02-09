import java.util.*;
public class GradeMark{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	float sub1=sc.nextFloat();
	float sub2=sc.nextFloat();
	float sub3=sc.nextFloat();

	float avg=(sub1+sub2+sub3)/3;

	if(avg>=0.0f & avg<=40.0f)
		System.out.println("Fail");
	else if(avg>40.0f & avg<=50.0f)
		System.out.println("C");
	else if(avg>50.0f & avg<=65.0f)
		System.out.println("B");
	else if(avg>65.0f & avg<=100.0f)
		System.out.println("A");
	else
		System.out.println("Wrong Average");
}
}