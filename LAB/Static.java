class Student
{  
	int roll; 
   	String name;  
   	static String college = "STCET"; 
    
   	Student(int r, String n)
   	{  
      		roll = r;  
      		name = n;  
   	}  
   
   	void display ()
   	{
      		System.out.println(college+" "+roll+" "+name); 
   	}  
}  
public class Static
{  
 	public static void main(String args[])
 	{  
 		Student s1 = new Student(48,"Moitrish");  
 		Student s2 = new Student(21,"Abhinaba");  
 		s1.display();  
 		s2.display();  
 	}  
}