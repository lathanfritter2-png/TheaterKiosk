import java.util.Scanner;

public class TheaterKiosk {
    public static void main(String[] args) {

        // Input the user's age
        // If the user is 21 or older
        // Output that they get a wrist band

        Scanner in = new Scanner(System.in);

        int age = 0;
        String trash = "";

        System.out.print("Enter your age: ");

        if (in.hasNextInt()) {
            age = in.nextInt();
            in.nextLine();

            if (age >= 21) {
                System.out.println("You get a wrist band.");
            }

        } else {
            trash = in.nextLine();
            System.out.println("You entered an invalid age: " + trash);
        }
    }
}
