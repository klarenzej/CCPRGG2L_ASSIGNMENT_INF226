import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class execise {
    public static void main(String[] args) {

        // Java program to check if a student number is valid
        Scanner scan = new Scanner(System.in);
        Scanner intscan = new Scanner(System.in);
        System.out.print("Enter student email: ");
        String studentNum = scan.nextLine();
        

        // Long method
        Pattern pattern = Pattern.compile("\\w+@students.national-u.edu.ph");
        Matcher matcher = pattern.matcher(studentNum);

        boolean match = matcher.matches();

        if (match) {
            System.out.println("valid student number");
        } else {
            System.out.println("invalid student number");
        }

        System.out.print("Enter Number: ");
        String phoneNum = intscan.nextLine();
        Pattern pattern1 = Pattern.compile("\\+639\\d{9}");
        Matcher matcher1 = pattern.matcher(phoneNum);
        boolean match1 = matcher.matches();
        if (match) {
            System.out.println("valid student number");
        } else {
            System.out.println("invalid student number");
        }

        System.out.print("Enter Birthday [YYYY-MM-DD]: ");
        String bday = intscan.nextLine();
        match = Pattern.compile("\\d{4}-\\d{2}-\\d{2}").matcher(bday).matches();

        if (match) {
            System.out.println("valid student bday");
        } else {
            System.out.println("invalid student bday");
        }
        
    
        
        }
    }
