import java.util.Scanner; //imports the scanner portion

class Attendance //initiates the class
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter Number Of Classes Held: "); //input the total number of classes held
int c = sc.nextInt();
System.out.print("Enter Number Of Classes Attended: "); //input the total number of classes attended
int a = sc.nextInt();

float r = (a*100)/c; //calculates the percentage
System.out.print("Percentage Of Classes Attended: " +r); //prints the result
}
}
