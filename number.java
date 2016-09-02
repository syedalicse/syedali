public class S {
 
public static void main(String args[]) {
int a1 = 89, b1 = 90;
System.out.println("Before swapping:");
 
System.out.println("A=" + a1);
System.out.println("B=" + b1);
 
a1 = a1 ^ b1; 
b1 = a1 ^ b1;
a1 = a1 ^ b1; 
 
System.out.println("After swapping:");
System.out.println("A=" + a1);
System.out.println("B=" + b1);
}
}
