import java.util.*;

public class d2p1{
	public static class student{
		int id, year;
		String fname, lname, dept;
		
		public void insertinfo(){
			Scanner input = new Scanner(System.in);
			System.out.println("Enter ID : ");	
			id = input.nextInt();
			System.out.println("Enter name : ");
			fname = input.next();
			lname = input.next();
			System.out.println("Enter department : ");
			dept = input.next();
			System.out.println("Enter year : ");
			year = input.nextInt();
		}
		
		public void displayinfo(){
			System.out.println("Student ID : "+id);
			System.out.println("Student name : "+fname+" "+lname);
			System.out.println("Student department : "+dept);
			System.out.println("Student year : "+year);
		}
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		student s1 = new student();
		s1.insertinfo();
		s1.displayinfo();
	}
}
			