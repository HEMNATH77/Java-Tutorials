import java.util.Scanner;

class Msb{
public static void main(String[] args){

Scanner Sc = new Scanner(System.in);

System.out.print("Enter a : ");
int a = Sc.nextInt();

while(a >= 10){

a /=10;
}
System.out.println("MSB  : "+a);
Sc.close();

}
}