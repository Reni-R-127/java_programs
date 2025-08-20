package first;
import java.util.Scanner;
public class DataTypeCasting {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("The numerical String is ");
		String num=sc.nextLine();
		int i=Integer.parseInt(num);
		float f=i;
		double d=f;
		System.out.println(i);
		System.out.println(f);
		System.out.println(d);
	}
}
