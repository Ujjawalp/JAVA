import java.util.Scanner; //imports the scanner class
class Do_while //initiates the class
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
int sum = 0;
char op;
int i;
do
{
System.out.print("Enter 1st Number: "); //input the first number
int num1= sc.nextInt();

System.out.print("Enter 2nd Number: "); //input the second number
int num2 = sc.nextInt();

sum = num1+num2; //calculates the result
System.out.println("The Sum is: "+sum); //prints the result

System.out.println("Do you wish to perform another operation, Y/N"); 
op=sc.next().charAt(0); 
}while(op=='Y'|| op=='y');
    
}
}
