/*Program for logical operators */


package sample1;
import java.util.Scanner;
public class sample {
public static void main(String[] args) {
		int value;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value:");
		value=sc.nextInt();
		if((value>=10)&&(value%2==0))
{
	System.out.print("value >10 and even");
}
else 
	{
	System.out.println("Condition not met");
	
}
		
}
	}
/* OUTPUT
  enter a value:
9
Condition not met 
-VIKRAM R*/
