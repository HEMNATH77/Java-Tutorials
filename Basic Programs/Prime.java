import java.util.Scanner;

class Prime{
public static void main (String[]args) {

Scanner Sc = new Scanner(System.in);

System.out.print("Enter n : ");
int n = Sc.nextInt();

int a = 0;

for (int i=1;i<n;i++) {
if(n % i == 0)
a = 1;
}

if (a == 1)

System.out.println("Prime Number");

else 

System.out.println("Not a prime");

}

}