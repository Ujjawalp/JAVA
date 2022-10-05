import java.util.Scanner;
class Maggie
{
 public static void main(String args[])
 {
	int num;
	System.out.print("Enter number of Maggies you want to purchase : ");
	Scanner sc = new Scanner(System.in);
	num = sc.nextInt();
	System.out.print("\nQuantity = "+num);

	if (num > 120){
	 System.out.println("\nCongratulations! You are getting 7% off on this purchase.");
	 System.out.print("\nPrice of 1 Maggie : Rs.14");
	 System.out.print("\nPrice of " + num + " Maggies : Rs");
	 System.out.print(14*num);
	 System.out.print("\nDiscount(70%off) : - Rs.");
	 System.out.print(0.07*14*num);
	 System.out.print("\nAmount Payable : Rs.");
	 System.out.println(14*num-(0.7*14*num));
	}

	else{
	 System.out.print("\nPrice of 1 Maggie : Rs.14");
	 System.out.print("\nPrice of " + num + " Maggies : Rs.");
	 System.out.print(num*14);
	 System.out.print("\nAmount payable : Rs.");
	 System.out.println(num*14);
	}
 }
}