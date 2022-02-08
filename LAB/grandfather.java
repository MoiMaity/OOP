class grandfather{
    void name_gf(){
        System.out.println("Grandfather's name: Johnathan Joester");
    }
    public static void main(String[] args) {
        son s = new son();
        s.name_s();
        s.name_f();
        s.name_gf();
    }
}

class father extends grandfather{
    void name_f(){
        System.out.println("Father's name: Joseph Joester");
    }
}

class son extends father{
    void name_s(){
        System.out.println("Son's name: Josuke Higashikata");
    }

    
}