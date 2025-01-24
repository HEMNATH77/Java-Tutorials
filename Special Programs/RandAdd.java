import java.util.Random;

class RandAdd {
public static void main(String[]args) {

Random Rand = new Random();

int a = Rand.nextInt(100)+1;
int b = Rand.nextInt(100)+1;

int c = a + b;

System.out.println("Sum = "+c);

}
}