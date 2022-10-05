import java.util.Scanner;
class Main{
public static void main(String[] args)
{
Scanner input = new Scanner(System.in);
System.out.print("Enter a string: ");
String str = input.nextLine();
System.out.printf("%s%n%s%n", str.toUpperCase(), str.toLowerCase());
}
}