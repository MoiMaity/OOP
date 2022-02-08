abstract class employee{
    String name;
    int emp_id;
    int doj;

    void getinfo(String name, int emp_id, int doj){
        System.out.println("Name: "+name);
        System.out.println("Employee Id: "+emp_id);
        System.out.println("Date of joining: "+doj);
    }

    abstract void getsal(int val);

}

class manager extends  employee{

    void getsal(int val){
        System.out.println("Manager salary: "+ (val + (val * 0.99)));
    }
}

class salesman extends  employee{

    void getsal(int val){
        System.out.println("Salesman salary: "+ (val + (val * 0.85)));
    }
}

public class d7problem1 {
    public static void main(String[] args) {
        employee man = new manager();
        man.getinfo("M. Dubey", 14756, 05042015);
        man.getsal(65000);
        employee sales = new salesman();
        sales.getinfo("Murli", 4534, 23072009);
        sales.getsal(15000);
    }
}