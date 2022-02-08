class Vehicle{
    void Type(){
        System.out.println("Type: Exotic");
    }
    public static void main(String[] args) {
        Brand br = new Brand();
        br.Type();
        br.Brand();
    }
}

class Brand extends Vehicle{
    void Brand(){
        System.out.println("Brand: Rolls Royce");
    }

    
}