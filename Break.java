public class Break{
public static void main(String args[]){
	for(int x=0;x<5;x++){
		if(x==2){
			System.out.println(x);
			break;
			//continue;
		}
		else{
			System.out.println(x);
		}
	}
}
}