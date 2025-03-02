import java.util.Scanner;

class Marks{
public static void main(String []args){

Scanner Sc = new Scanner(System.in);

System.out.print("Enter mark 1 : ");
int a = Sc.nextInt();

System.out.print("Enter mark 2 : ");
int b = Sc.nextInt();

System.out.print("Enter mark 3 : ");
int c = Sc.nextInt();

System.out.print("Enter mark 4 : ");
int d = Sc.nextInt();

System.out.print("Enter mark 5 : ");
int e = Sc.nextInt();


int total = a+b+c+d+e;
System.out.println("Total Marks : "+ total);

double percent = (total * 100)/500;
System.out.println("Percentage : "+percent);
}
}