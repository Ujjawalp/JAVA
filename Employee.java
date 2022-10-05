import java.util.Scanner;

class Main
{
	public static void main (String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("Enter your age: ");
		int age = s.nextInt();
		
		System.out.print("Enter your sex: M/F");
		int sex = s.next().charAt(0);
		
		System.out.print("Are you married? Y/N");
		int married = s.next().charAt(0);
		
		if(sex == 'F') {
			System.out.print("You will work only in urban areas");
		}
		
		if(sex == 'M') {
			if((age >= 20) && (age < 40)) {
				System.out.print("You may work anywhere");
			}
			else if((age >= 40) && (age < 60)) {
				System.out.print("You will work only in urban areas");
			}
			else {
				System.out.print("ERROR");
			}
		}
	}
}