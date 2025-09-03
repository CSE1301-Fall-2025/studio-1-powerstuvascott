package studio1;
import java.util.Scanner;

public class Average {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);

       System.out.println("What is your first number?");
       int n1 = in.nextInt();
       System.out.println("What is your second number?");
       int n2 = in.nextInt();

       System.out.println("The average of these two numers? " + (double) (n1 + n2) / 2);
    }

}
