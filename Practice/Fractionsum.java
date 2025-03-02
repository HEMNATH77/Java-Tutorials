import java.util.Scanner;
class Fractionsum{
public static void main(String[] args){

Scanner Sc = new Scanner(System.in);

System.out.print("Enter a : ");
double a = Sc.nextDouble();

System.out.print("Enter b : ");
double b = Sc.nextDouble();

double Frac1 = a - (int)a;
double Frac2 = b - (int)b;

double Fracsum = Frac1 + Frac2;
System.out.println("Sum = "+Fracsum);
Sc.close();
}
}