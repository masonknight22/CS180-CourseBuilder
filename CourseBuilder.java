import java.util.Scanner;

/**
 * CourseBuilder
 *
 * Program that calculates and prints courses and difficulty
 *
 * CS180 Lectures
 *
 * @author Mason Knight
 * @version March 1, 2021
 */

public class CourseBuilder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder stringbuilder = new StringBuilder();
        System.out.println("How many classes are you taking this semester?");
        int courses = scan.nextInt();
        scan.nextLine();
        stringbuilder.append(courses);
        System.out.println("Are you a part time or full time student? Enter PT for part time, and FT for full time.");
        String time = scan.nextLine();


        if (time.contains("FT")) {
            time = ("Full");
            stringbuilder.append(time);
        } else if (time.contains("PT")) {
            time = ("Part");
            stringbuilder.append(time);
        } else {
            time = ("Inv");
            stringbuilder.append(time);
        }

        double sum = 0;
        double highest = 1;

        for (int i = 0; i < courses; i++) {

            System.out.println("What is the class code?");
            String code = scan.nextLine();
            String codes = code.substring(0,1);
            stringbuilder.append(codes);
            System.out.println("What is the class number?");
            String number = scan.nextLine();
            String number1 = number.substring(0,3);
            String numbersum = number.substring(0,1);
            stringbuilder.append(number1);

            double value = Double.parseDouble(numbersum);
            sum = sum + value;

            if (value > highest) {
                highest = value;
            }


        }

        System.out.println("Your class log is " + stringbuilder.toString());



        double difficulty = 1.3 * courses * sum * highest;

        System.out.format("You approximate semester difficulty is %.1f", difficulty);

        System.out.println();



    }
}
