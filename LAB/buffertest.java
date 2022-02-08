//input by inputstreamreader class
import java.io.*;

public class buffertest{
	
	public static void main(String args[])throws IOException{
		int i, n = 0;
		InputStreamReader a = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(a);
		while (n!=1){
			System.out.println("Enter your number or press 0 to escape the program : ");
			n = Integer.parseInt(b.readLine());
			if (n==0)
				break;
			if (n%2==0)
				System.out.println("Number is even.");
			else
				System.out.println("Number is odd.");
		}

	}

}