abstract class bank{

    String name;
    String br_name;
    int ifsc;

    bank(String name, String br_name, int ifsc){
        this.name = name;
        this.br_name = br_name;
        this.ifsc = ifsc;
    }

    void display(){
        System.out.println("Name of bank: "+this.name);
        System.out.println("Name of Branch: "+this.br_name);
        System.out.println("IFSC Code: "+this.ifsc);
    }

    abstract int getroi();
}

class SBI extends bank{

    SBI(String name, String br_name, int ifsc){
        super(name, br_name,ifsc);
    }

    int getroi(){
        return 6;
    }

}

class PNB extends bank{

    PNB(String name, String br_name, int ifsc) {
        super(name, br_name, ifsc);
    }

    int getroi(){
        return 7;
    }

}

class AXIS extends bank{

    AXIS(String name, String br_name, int ifsc) {
        super(name, br_name, ifsc);
    }

    int getroi(){
        return 8;
    }

}

class HDFC extends bank{

    HDFC(String name, String br_name, int ifsc) {
        super(name, br_name, ifsc);
    }

    int getroi(){
        return 9;
    }

}

public class d7problem2 {
    public static void main(String[] args) {
        bank sbi = new SBI("STATE BANK OF INDIA", "Dhakuria", 300984);
        bank pnb = new PNB("PUNJAB NATIONAL BANK", "Dhakuria", 456827);
        bank axis = new AXIS("AXIS BANK", "Dhakuria", 456382);
        bank hdfc = new HDFC("HDFC Bank", "Dhakuria", 133425);

        sbi.display();
        System.out.println("SBI interest: "+sbi.getroi()+" %");
        System.out.println("\n");
        pnb.display();
        System.out.println("PNB Interest: "+pnb.getroi()+" %");
        System.out.println("\n");
        axis.display();
        System.out.println("AXIS Interest: "+axis.getroi()+" %");
        System.out.println("\n");
        hdfc.display();
        System.out.println("HDFC Interest: "+hdfc.getroi()+" %");

        System.out.println("\n");

        if(sbi.getroi() > pnb.getroi() && sbi.getroi() > axis.getroi() && sbi.getroi() > hdfc.getroi()){
            System.out.println("Best choice is to go with "+sbi.name+" with interest rate: "+sbi.getroi());
        }
        else if (pnb.getroi() > axis.getroi() && pnb.getroi() > hdfc.getroi()){
            System.out.println("Best choice is to go with "+pnb.name+" with interest rate: "+pnb.getroi());
        }
        else if (axis.getroi() > hdfc.getroi()){
            System.out.println("Best choice is to go with "+axis.name+" with interest rate: "+axis.getroi());
        }
        else{
            System.out.println("Best choice is to go with "+hdfc.name+" with interest rate: "+hdfc.getroi());
        }
    }
}