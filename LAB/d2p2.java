public class d2p2{
	public static class student{
		int id, year;
		String name, dept;
		
		public void takeinfo(int i, String n, String d, int y){
            		id = i;
			name = n;
			dept = d;
			year = y;
        	}
	
        	public void displayinfo(){
            		System.out.println("Student ID: "+id);
            		System.out.println("Student name: "+name);
            		System.out.println("Student department: "+dept);
            		System.out.println("Student year: "+year);
        	}
    	}

	public static void main(String[] args){
		student s1 = new student();
		s1.takeinfo(13, "Lara Croft", "ECE", 2);
		s1.displayinfo();
	}
}