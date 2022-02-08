import java.util.*;

public class d3p3{
	public static class Student{
		String name;
		int id;
        
        	public Student(int id, String name){
            		this.id = id;
            		this.name = name;  
        	}

        	public void display(){
            		System.out.println("Student id : " + id);
			System.out.println("Student name is : " + name);
			System.out.println("");
        	}
    	}

	public static void main(String args[]){
        	Student std[] = new Student[5];
        	Scanner input= new Scanner(System.in);

        	for (int i = 0; i < 5; i++){
        		System.out.print("Enter Student name: ");
        		String name = input.nextLine();
        		System.out.print("Enter Student id: ");
        		int id = input.nextInt();
        		input.nextLine();
        		std[i] = new Student(id, name);
			System.out.println("");
        	}
        	input.close();
        	for (int i = 0; i < 5; i++){
            		std[i].display();
        	}
    	}   
}