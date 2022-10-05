import java.util.Scanner;
class Main
{
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the alphabet: ");
        char val = s.next().charAt(0);
        if (Character.isUpperCase(val)) {
            System.out.println("Character is in Uppercase!");
        }else {
            System.out.println("Character is in Lowercase!");
}
}
}