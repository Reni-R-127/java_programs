package first;
import java.util.Scanner;
public class MyfirstProgram {
	
	public static void main(String[] args) {
		// String Concatenation
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first string(str1)");
		String str1=sc.nextLine();
		
		System.out.println("Enter the first string(str2)");
		String str2=sc.nextLine();
		
		System.out.println("The word is "+ str1+" " + str2);
		
		//Arithmetic Operator
		int a,b,sum;
		System.out.println("Enter number a ");
		a=sc.nextInt();
		System.out.println("Enter number b ");
		b=sc.nextInt();
		sum= a+b;
		System.out.println("Sum of a+b is "+sum);
		
		double x,y,add,sub,mul,div,mod;
		System.out.println("Enter number x ");
		x=sc.nextDouble();
		System.out.println("Enter number y ");
		y=sc.nextDouble();
		add= x+y;
		sub= x-y;
		mul= x*y;
		div= x/y;
		mod=x%y;
		System.out.println("Additon: "+add);
		System.out.println("Subtraction: "+sub);
		System.out.println("Multiplication: "+mul);
		System.out.println("Division: "+div);
		System.out.println("Modulo: "+mod);
		
		float a1,b1,add1,sub1,mul1,div1,mod1;
		System.out.println("Enter number a1 ");
		a1=sc.nextFloat();
		System.out.println("Enter number b1 ");
		b1=sc.nextFloat();
		add1= a1+b1;
		sub1= a1-b1;
		mul1= a1*b1;
		div1= a1/b1;
		mod1=a1%b1;
		System.out.println("Additon: "+add1);
		System.out.println("Subtraction: "+sub1);
		System.out.println("Multiplication: "+mul1);
		System.out.println("Division: "+div1);
		System.out.println("Modulo: "+mod1);
	}
}
