package april_long;
import java.util.*;
public class Q1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();
		if(A==B||B==C||A==C) {
			System.out.println("Yes");
		}
		else
			System.out.println("No");
		sc.close();

	}

}
