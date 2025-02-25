import java.util.Scanner;

class Midfour{

public static void main(String []args){

Scanner Sc = new Scanner(System.in);

System.out.print("Enter a number : " );

int n = Sc.nextInt();

if ( n >= 1000 && n <= 9999){

int digits = (n / 10) % 100;

System.out.println("Middle Digits : "+digits);

}
else {

System.out.print("Enter valid number");
}

Sc.close();
}
}