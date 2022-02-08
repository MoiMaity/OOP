class parent{
    static void display1(){
        System.out.println("display 1 of parent class");
    }

}

class child extends parent{
    static void display1(){
        System.out.println("display 1 of child class");
    }

}


public class d9p2 {
    public static void main(String[] args) {
        parent pt1 = new parent();
        parent pt2 = new child();

        pt1.display1();

        pt2.display1();


    }
}