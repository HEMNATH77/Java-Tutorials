import java.util.Scanner;

class Placedigit {

public static void main(String[] args) {

Scanner Sc = new Scanner(System.in);

System.out.print("Enter a number : ");

int n = Sc.nextInt();

if (n >=100 && n<=999){

int hundreds = n / 100;
int units = n % 10;

System.out.println(" Hundreds : "+hundreds);
System.out.println(" Units : " + units);

}

else {

System.out.print("Enter a valid number");
}

Sc.close();
}
}