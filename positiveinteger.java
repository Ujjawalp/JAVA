import java.util.Scanner; //imports only the scanner portion
class Multiplication_Table //initiates class
{
public static void main(String[] args) 
{
Scanner s = new Scanner(System.in);
System.out.print("Enter number:"); //input the number       
int n=s.nextInt();
        
for(int i=1; i <= 10; i++) 
{
System.out.println(n+" * "+i+" = "+n*i);
}
}
}
