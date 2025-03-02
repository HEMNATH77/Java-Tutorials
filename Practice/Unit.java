import java.util.Scanner;
class Unit{
public static void main(String []args){

Scanner Sc = new Scanner(System.in);
System.out.print("Enter a number : ");

int a = Sc.nextInt();

int unit = a % 10;

System.out.println("Unit Digit : "+unit);
Sc.close();
}
}