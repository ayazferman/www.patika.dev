import java.util.Scanner;
public class UcgenAlan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    		        
		Scanner scan = new Scanner(System.in);
		        
		double kenar1,kenar2,kenar3;
		double u;
		double alan;
		        
		System.out.print("1. Kenar� giriniz: ");
	    kenar1 = scan.nextDouble();
		System.out.print("2. Kenar� giriniz: ");
		kenar2 = scan.nextDouble();
		System.out.print("3. Kenar� giriniz: ");
	    kenar3 = scan.nextDouble();
		        
	    u = (kenar1 + kenar2 + kenar3) / 2;
		alan =(double) Math.sqrt(u * (u - kenar1) * (u - kenar2) * (u - kenar3));
		System.out.println("��genin alan� = " + alan);  
		System.out.println("��genin �evresi = " + u);  

	}

}
