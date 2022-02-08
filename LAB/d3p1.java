public class d3p1{	
	public static class student{
		int ID;
		String name;

		public student(){
			ID = 122;
			name = "STCET student";
        	}
	}

	public static class student_default{
		int ID;
		String name;
    	}

	public static void main(String[] args){
		System.out.println("Custom Constructor: ");
		student s1 = new student();
		System.out.println("ID: " + s1.ID + " Name: " + s1.name);
		student_default s2 = new student_default();
		System.out.println("Default Constructor: ");
		System.out.println("ID: " + s2.ID + " Name: " + s2.name);
    	}
}