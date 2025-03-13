import java.util.Scanner;
class Smallest{
public static void main(String[] args){

System.out.print("Enter the  number :  ");
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = 9;
int digit = 0;
while(a != 0){
digit = a % 10;
b = (digit < b)? digit : b;
a /= 10;
}
System.out.println("Smallest = "+b);
}
}