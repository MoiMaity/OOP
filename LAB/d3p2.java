public class d3p2{
	public static class Employee{
		int EID;
		String Ename;
		String Dept;

		public Employee(int EID, String Ename, String Dept){
			this.EID = EID;
			this.Ename = Ename;
			this.Dept = Dept;
		}

		public void display(){
			System.out.println("EID: " + this.EID);
			System.out.println("Ename: " + this.Ename);
			System.out.println("Department: " + this.Dept);
			System.out.println("");	
		}
	}

	public static void main(String[] args){
		Employee e1 = new Employee(122 , "Rick" , "Sales");
		Employee e2 = new Employee(143 , "John" , "IT");
		Employee e3 = new Employee(158 , "Jason" , "Accounts");
		Employee e4 = new Employee(190 , "Joseph" , "HR");
		Employee e5 = new Employee(188 , "Mike" , "IT");

		e1.display();
		e2.display();
		e3.display();
		e4.display();
		e5.display();
	}
}