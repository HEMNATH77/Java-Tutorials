class Magic {

public static void main(String[] args) {

int a = 50113;
int r = 0;
int sum = 0;
int b = 0;
int c = 0; 

while(a !=0){
r = a % 10;
sum += r;
a /= 10;

}

while( sum != 0){

b = sum % 10;
c += b;
sum /= 10;

}

if ( c == 1){
System.out.println("Magic number");
}
else{
System.out.println("Normal Number");
}


}
}