import java.util.Scanner;

public class d4p2{
    	public static class sum{
        	int num1;
        	int num2;
        	int num3;

        	public sum(int num1, int num2){
            		this.num1 = num1;
            		this.num2 = num2;
        	}

        	public sum(int num1, int num2, int num3){
            		this.num1 = num1;
            		this.num2 = num2;
            		this.num3 = num3;
        	}

        	public sum(){

        	}

        	public void calSum(int num1, int num2){
            		int result = num1+ num2;
            		//return result;
            		display(result);
        	}

        	public void calSum(int num1, int num2, int num3){
            		int result = num1 + num2 + num3;
            		display(result);
        	}

        	public void display(int result){
            		System.out.println("sum: "+ result);
        	}

        	public void display2(){
            		if((this.num1 == 0 && this.num2 == 0 && this.num3 == 0)){
                		System.out.println("Bucket is empty");
            		}
            		else{
                		System.out.println("Bucket is non-empty");
            		}

        	}
   	}

    	public static void main(String[] args) {
        	Scanner input = new Scanner(System.in);
        	System.out.println("Enter num1, num2 and num3: ");
        	int num1 = input.nextInt();
        	int num2 = input.nextInt();
        	int num3 = input.nextInt();
        	sum sum1 = new sum(num1,num2);
        	sum sum2 = new sum(num1,num2,num3);
        	sum sum3 = new sum();
        	System.out.println("For sum1: ");
        	sum1.calSum(num1,num2);
        	sum1.display2();
        	System.out.println("For sum2: ");
        	sum2.calSum(num1,num2,num3);
        	sum2.display2();
        	System.out.println("For sum3: ");sum3.display2();
    	}
}