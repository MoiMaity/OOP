public class Hierarchical {
    static class Brand{
         String brand(){
            String brand = "Apple";
            return brand;
        }
    }

    static class earphone extends Brand{
        String earphone(){
            String earphone = "Airpods";
            return earphone;
        }
    }

    static class Watch extends Brand{
        String watch(){
            String watch = "Apple Watch";
            return watch;
        }
    }

    public static void main(String[] args) {
        earphone ep = new earphone();
        Watch wt = new Watch();
        System.out.println("Product: "+ep.earphone() + " Brand: " + ep.brand());
        System.out.println("Product: "+wt.watch() + " Brand: " + wt.brand());
    }
}