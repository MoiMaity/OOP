class Company{
	void Address(){
        	System.out.println("You have called parent class");
    	}
}

class Amazon extends Company{
	void Address(){
        	System.out.println("CEO of Amazon: Andy Jassy");
        	System.out.println("Address of Amazon: 440 Terry Avenue North Seattle, WA 98109 USA");
    	}
}

class Flipkart extends Company{
    	void Address(){
        	System.out.println("CEO of Flipkart: Kalyan Krishnamurthy");
        	System.out.println("Address of Flipkart: Ozone Manay Tech Park, #56/18 and 55/09, seventh Floor, Bangalore Karnataka");
    	}
}

public class Overriding{
    	public static void main(String[] args){
        	Amazon am = new Amazon();
        	Flipkart fp = new Flipkart();
        	Company cp = new Company();
        	am.Address();
        	fp.Address();
        	cp.Address();
    	}
}