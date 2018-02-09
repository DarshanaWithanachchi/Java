import java.util.Scanner;
public class Therd{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("input an int for radius");
int r=sc.nextInt();
float areaCircle=3.14f*r*r;
System.out.println(areaCircle);
}
}