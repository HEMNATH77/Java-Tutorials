import java.util.Scanner;

class Float{
public static void main(String[]args){

Scanner Sc = new Scanner(System.in);

System.out.print("Enter 1st no: ");
float a = Sc.nextFloat();
System.out.print("Enter 2nd no: ");
float b = Sc.nextFloat();

int  c = 1000;
int d = (int) (a*c);
int e = (int) (b*c);

System.out.println(d);
System.out.println(e);

if ( d == e)
System.out.print("Equal");
else
System.out.print("Not equal");

Sc.close();
}
}