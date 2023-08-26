import java.util.Scanner;

public class Pr1a {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the grades from 'A' to 'F': ");
        char i = sc.next().charAt(0);
        
        if (i == 'A' || i == 'a') {
            System.out.println("Percentage range from 91-100");
        } else if (i == 'B' || i == 'b') {
            System.out.println("Percentage range from 81-90");
        } else if (i == 'C' || i == 'c') {
            System.out.println("Percentage range from 71-80");
        } else if (i == 'D' || i == 'd') {
            System.out.println("Percentage range from 61-70");
        } else if (i == 'E' || i == 'e') {
            System.out.println("Percentage range from 51-60");
        } else if (i == 'F' || i == 'f') {
            System.out.println("Percentage range from 0-50");
        } else {
            System.out.println("Invalid input");
        }
    }
}

