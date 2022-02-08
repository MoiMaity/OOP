class staticDemo{
   static int a,b;

    void member(int num){
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println(num);
    }

    static{
        System.out.println("a is initialized");
         a = 5;
    }

    static{
        System.out.println("b is initialized");
         b = 4 * a;
    }


}


public class d9p1a {
    public static void main(String[] args) {
        staticDemo st = new staticDemo();
        st.member(4);
    }
}
