import java.util.*;

public class Prog3{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter name:");
		String name = input.nextLine();
		System.out.println("Enter roll:");
		int roll = input.nextInt();
		System.out.println("Enter department:");
		String dept = input.next();
		System.out.println("Name : "+name);
		System.out.println("Roll : "+roll);
		System.out.println("Department : "+dept);
		
	}
}