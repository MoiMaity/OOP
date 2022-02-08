import java.util.*;

public class d2p3{
	public static class vehicle{
		int speed, wheelno;
		Double mileage, dist, fuel;
		String wheeltype;
		
		public void calspeed(){
			Scanner input = new Scanner(System.in);
			System.out.println("Enter speed : ");	
			speed = input.nextInt();
			System.out.println("Enter number of wheels : ");
			wheelno = input.nextInt();
			System.out.println("Enter wheel type (gear/automatic): ");
			wheeltype = input.next();
			System.out.println("Enter distance travelled : ");
			dist = input.nextDouble();
			System.out.println("Enter fuel consumed : ");
			fuel = input.nextDouble();
			mileage = dist/fuel;
		}
		
		public void displayinfo(){
			System.out.println("Vehicle Speed : "+speed);
			System.out.println("Vehicle wheels : "+wheelno);
			System.out.println("Vehicle wheel type : "+wheeltype);
			System.out.println("Vehicle mileage : "+mileage);
		}
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		vehicle v = new vehicle();
		v.calspeed();
		v.displayinfo();
	}
}
			