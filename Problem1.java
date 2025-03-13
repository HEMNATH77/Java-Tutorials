class Problem1{
public static void main(String[] args){

int a = 3521;
int b = 2452;
int c = 1552;
int small = 9;
int digit = 0;

int e = a / 1000;
int f = (b / 100) % 10;

System.out.println(" e = "+e);
System.out.println(" f = "+f);

while( c != 0){
digit = c % 10;
small = (digit <small )? digit : small;
c /= 10;
}
System.out.println("Smallest : "+ small);

int key = (e * f) + small;
System.out.println(" key = "+key);

}
}