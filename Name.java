import java.util.*;
public class Name{
	public static void main(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Input your card");
		String var=sc.next();
		
		swith(var){
			case "koka":System.out.println("Amila");break;
			case "tipa":System.out.println("Nimal");break;
			case "beka":System.out.println("perara");break;	
			case "saka":System.out.println("Gihan");break;
			default:System.out.println("Not Card");
		}
}
}