import java.util.Scanner;
class MaxMinLoop
{
public static void main(String args[])
{
Scanner console = new Scanner(System.in);

int num;
int max = Integer.MIN_VALUE;
int min = Integer.MAX_VALUE;

char choice;
do
{
System.out.println("Enter the Number: ");
num = console.nextInt();

if(num > max)
{
max = num;
}

if(num < min)
{
min = num;
}
System.out.println("Do You Want To Continue: Y/N ? ");
choice = console.next().charAt(0);
}
while(choice=='y'|| choice=='Y');
System.out.println("Largest Number: " +max);
System.out.println("Smallest Number: " +min);

}
}
