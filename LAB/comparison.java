import java.util.*;

public class comparison{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 3 numbers:");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		int n3 = input.nextInt();
		if(n1<n2 && n1<n3){
			System.out.println(n1+" is the smallest.");
		}
		if(n2<n3 && n2<n1){
			System.out.println(n2+" is the smallest.");
		}
		if(n3<n1 && n3<n2){
			System.out.println(n3+" is the smallest.");
		}
		if(n1>n2 && n1>n3){
			System.out.println(n1+" is the largest.");
		}
		if(n2>n3 && n2>n1){
			System.out.println(n2+" is the largest.");
		}
		if(n3>n1 && n3>n2){
			System.out.println(n3+" is the largest.");
		}
	}
}