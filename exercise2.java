import java.util.Scanner;

public class App {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        drive("Student");
        scan.close();
    }

    static void drive(String student) {

        System.out.println("Driving School!");
        dStudent(student);

        String feedback = getFeedBack(student);

        // Define the base case / stopping condition
        if (feedback.equals("no")) {

            // Do something to reach the goal
            fixStudent(student);

            // Recursive call
            drive(student);
        } else if (feedback.equals("yes")) {
            studentServe(student);
        }
    }

    static void dStudent(String student) {
        System.out.println("Student Test");
    }

    static String getFeedBack(String student) {
        System.out.println("Is the " + student + " Passed? (Enter \"yes\" or \"no\")");

        String feedback = scan.next();

        return feedback;
    }

    static void fixStudent(String student) {
        System.out.print("Enter additional skill:");
        String skills = scan.next();
        System.out.println("Fixing skills. Added " + skills);
    }

    static void studentServe(String student) {
        System.out.println("The " + student+ " Passed");
    }

}