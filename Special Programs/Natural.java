import java.util.Scanner;

class Natural {
public static void main(String[]args) {

Scanner Sc = new Scanner(System.in);

int n = Sc.nextInt();
for(int i=1;i<=n;i++) {

System.out.print(i);
} 

int c = n *(n+1)/2;

System.out.println("\n Sum of Natural Numbers:"+c);

Sc.close();
}
}