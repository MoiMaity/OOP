import java.util.*;

class shape{
	
	static double area;
	static void calcarea(double a, double b,double c){
		double s, areat;
		s = (a + b + c) / 2;
		area = Math.sqrt( s * (s - a) * (s - b) * (s * c));
		shape.display();
	}

	static void calcarea(double a, double b){
		area = a * b;
		shape.display();
    	}
    
	static void calcarea(double r){
        	final double pi = 3.14;
        	area = pi * (r * r);
        	shape.display();
    	}

    	static void display(){
        	System.out.println("Area : "+area);
    	}
}

public class d4p1{
	public static void main(String[] args){
       		Scanner input = new Scanner(System.in);
        	shape s = new shape();
        	System.out.println("For Triangle :--- " );
        	System.out.println("Enter sides : " );
        	double a = input.nextInt();
        	double b = input.nextInt();
        	double c = input.nextInt();
        	s.calcarea(a,b,c);
        	System.out.println();
        	System.out.println("For Rectangle :--- ");
        	System.out.println("Enter length and breadth : " );
        	double len = input.nextInt();
        	double bre = input.nextInt();
        	s.calcarea(len,bre);
        	System.out.println();
        	System.out.println("For Circle :-- ");
        	System.out.println("Enter radius : " );
        	double r = input.nextInt();
        	s.calcarea(r);
    }
}