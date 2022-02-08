class employer{

        int salary;
        int age;

        employer(int salary, int age){
            this.salary = salary;
            this.age = age;
        }

        void show(){
            System.out.println("Salary: "+this.salary);
            System.out.println("Age: "+this.age);
        }
    }
    class employee extends employer{
        int id;

        employee(int salary, int age, int id){
            super(salary, age);
            this.id = id;
        }

        void show(){
            System.out.println("Salary: "+this.salary);
            System.out.println("Age: "+this.age);
            System.out.println("ID: "+this.id);
        }
    }

public class d5p1{
    public static void main(String[] args) {
        employer Ep = new employer(180000, 36);
        employee ep = new employee(40000, 28, 465);
        System.out.println("Parent: ");
        Ep.show();
        ep.show();
    }
}