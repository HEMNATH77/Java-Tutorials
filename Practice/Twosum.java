import java.util.Scanner;
class Twosum{
public static void main(String[] args){

Scanner Sc = new Scanner(System.in);

System.out.print("Enter a : ");
int a = Sc.nextInt();

System.out.print("Enter b : ");
int b = Sc.nextInt();

System.out.print("Enter c : ");
int c = Sc.nextInt();

int sum = a+b;
System.out.println("Sum : "+sum);

int multiply = sum * c;
System.out.println("Multiply : "+multiply);

Sc.close();

}
}