import java.util.Scanner;

public class Solution1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String input = scan.nextLine();
        System.out.println("The string " + input + " is " + input.length() + " characters long.");

    }
}
