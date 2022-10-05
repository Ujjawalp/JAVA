import java.util.Scanner; //imports only the scanner portion
class Main{
public static void main(String[] args)
{
Scanner input = new Scanner(System.in); 
int x; //first number input by user
int y; //second number input by user
int z; //third number input by user
int result;  //product of integers
System.out.print("Enter first integer: "); 
x = input.nextInt(); //scans the first input
System.out.print("Enter second integer: ");
y = input.nextInt(); //scans the second input
System.out.print("Enter third integer: "); 
z = input.nextInt(); //scans the third input
result = x * y * z; //calculates the result
System.out.printf("Product is %d%n", result); //prints the result
} 
}