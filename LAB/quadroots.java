import java.util.*;


public class quadroots{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a,b,c:");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int d = (b*b)-(4*a*c);
		Double e = Math.sqrt(d);
		if (e<0){
			System.out.println("Roots are imaginary.");
		}
		if (e==0){
			System.out.println("Roots are equal and opposite.");
			Double r1 = (-b + e)/(2*a);
			Double r2 = (-b - e)/(2*a);
			System.out.println("Roots are : "+r1+" and "+r2);
		}
		if (e>0){
			System.out.println("Roots are different.");
			Double r1 = (-b + e)/(2*a);
			Double r2 = (-b - e)/(2*a);
			System.out.println("Roots are : "+r1+" and "+r2);
		}
	}
}