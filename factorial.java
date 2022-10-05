import java.util.Scanner;
class Factorial
{
public static void main(String args[])
{
int i,fact=1;
Scanner sc = new Scanner(System.in);

System.out.print("Enter a Number: ");
int c = sc.nextInt();

for(i=1;i<=c;i++)
{
fact=fact*i;
}
System.out.print("Factorial of " +c+ " is: " +fact);
}
}
