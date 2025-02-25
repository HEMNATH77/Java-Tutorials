import java.util.Scanner;

class Fracsum{

public static void main(String []args){

Scanner Sc = new Scanner(System.in);

System.out.print("Enter the 1st value (double) : ");

double n1 = Sc.nextDouble();

System.out.print("Enter the 2nd value (double) : ");

double n2 = Sc.nextDouble();


double frac1 = n1 - (int) n1;
double frac2 = n2 - (int) n2;

double sum = frac1 + frac2;

System.out.println("Final Sum : "+sum);

Sc.close();

}
}