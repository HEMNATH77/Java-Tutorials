import java.util.Scanner;
class Fourdigitsum{
public static void main(String[] args){

Scanner Sc = new Scanner(System.in);

System.out.print("Enter a : ");
int a = Sc.nextInt();

int d1 = a / 1000;
int d2 = (a / 100) % 10;
int d3 = (a / 10) % 10;
int d4 = a % 10;

int sum = d1+d2+d3+d4;
System.out.println("Sum : "+sum);
Sc.close();

}
}