package CheckedError.Yes;
import java.util.Scanner;

public class Main {  public static void main(String[] args) {
    Sc sc=new Sc();
    Scanner scanner=new Scanner(System.in);
    boolean exit = false;

    do {
        String chose;
        System.out.println("Enter one character");
        chose=scanner.nextLine();
        try {
           exit=sc.inputChar(chose,exit);
        } catch (Checked e) {
            System.out.println("Error: Invalid input ,please Enter one character .");

        }
    } while (!exit);

}
}
