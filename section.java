import java.util.Scanner;
class Main{
	public static void main(String args[]){
	Scanner s = new Scanner(System.in);
	System.out.print("Enter your marks: ");
	int x  = s.nextInt();
	if (x<25){
	System.out.print("Your assigned section is F");
	}
	else if ((x>=25)&&(x<=45)){
	System.out.print("Your assigned section is E");
	}
	else if ((x>=45)&&(x<=50)){
	System.out.print("Your assigned section is D");
	}
	else if ((x>=50)&&(x<=60)){
	System.out.print("Your assigned section is C");
	}
	else if ((x>=60)&&(x<=80)){
	System.out.print("Your assigned section is B");
	}
	else if ((x>=80)&&(x<=100)){
	System.out.print("Your assigned section is A");
	}
	else{
	System.out.print("Invalid marks");
	}
	    
	}
}