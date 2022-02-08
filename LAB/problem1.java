class student{
    String name;
    int s_id;
    static String college_name = "STCET";

    student(String name, int s_id){
      this.name = name;
      this.s_id = s_id;
    }
    
    static void show(){
        System.out.println("College : "+college_name);
    }
    static void display(){
        System.out.println("Name : "+this.name);
        System.out.println("Student ID: "+this.s_id);
    }
    
}

public class problem1{
    public static void main(String args[]){
      student s1=new student("Joseph Johnson",45);
      System.out.println("Calling by Object name:\n ");

      s1.show();
      s1.display();
      student s2=new student("Rajat Biswas",29);

      System.out.println("\nCalling by Class name:\n ");

      student.show();
      s2.display();
      student s3=new student("Hrisik Das",85);

      student.college_name = "IIEST";
      System.out.println("\nCollege name changed to: "+student.college_name);

      s3.show();
      s3.display();
      
      System.out.println("\nNow all the students study is:\n ");

      System.out.println(s1.name+" "+s1.college_name);
      System.out.println(s2.name+" "+s2.college_name);
      System.out.println(s3.name+" "+s3.college_name);
    }
}