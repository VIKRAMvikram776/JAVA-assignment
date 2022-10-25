/*example program for pre_post increment*/


package sample1;

public class Prepost {

	public static void main(String[] args) 
{ 
int a=11,b=10, c=13, d=10;
a=++a + a++;
System.out.println(a); //24
b=b++ + ++b;
System.out.println(b);//22
c=++c + ++c;
System.out.println(c); //29
d=d++ + d++;
System.out.println(d); //21

	}

}
/*OUTPUT
24
22
29
21
-VIKRAM R*/