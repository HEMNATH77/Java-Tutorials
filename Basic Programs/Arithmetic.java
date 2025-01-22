import java.util.Scanner;

class Arithmetic {
public static void main(String[]args) {

Scanner Sc = new Scanner(System.in);

System.out.print("Enter a : ");
int a = Sc.nextInt();
System.out.print("Enter b : ");
int b = Sc.nextInt();

int c = a+b;
int d = a-b;
int e = a*b;
int f = a/b;
int g = a%b;

System.out.println(c);
System.out.println(d);
System.out.println(e);
System.out.println(f);
System.out.println(g);

Sc.close();
}
}