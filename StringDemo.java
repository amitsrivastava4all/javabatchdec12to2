//import java.lang.*;
import java.math.BigInteger;
class StringDemo{
public static void main(String args[]){
Integer q = 100;
int vv = 100;
float bb = 20.90f;
Float cc = 20.90f;
BigInteger b1  = new BigInteger("10000000000");
BigInteger b2  = new BigInteger("20000000000");
BigInteger b3 = b1.add(b2);
System.out.println("Sum is "+b3);
String name = "Amit".intern();  // Literal
String name2 = new String("Amit").intern();
if(name==name2){
System.out.println("Same Reference");
}
else{
System.out.println("Not Same Reference");
}
}
}