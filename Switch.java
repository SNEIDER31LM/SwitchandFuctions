import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        printAnyString("Hi! You are the best program! The program has some options such as: A, B, and C");
        printAnyString("Please type any option");
        String readingString = scanner.nextLine();

        switch (readingString.toLowerCase()) {
            case "a":
                printAnyString("Now you are in the sum program. It is necessary to type 2 numbers:");
                printAnyString("Type the first number:");
                int numberOne = scanner.nextInt();
                printAnyString("Type the second number:");
                int numberTwo = scanner.nextInt();

                int sumResult = sumNumbers(numberOne, numberTwo);
                printAnyString("THE RESULT OF NUM IS " + sumResult);
                break;

            case "b":
                printAnyString("Now you are in the program that returns a string");
                printAnyString("ENTER  STRING:");
                String phrase = scanner.next();
                printAnyString("THE PHRASE IS: " + phrase);
                break;

            case "c":
                printAnyString(" Now you are in the program that calls a function, receives an integer and returns the cosine of the value");
                printAnyString("ENTER INTEGER");
                int Integer = scanner.nextInt();
                double resultInteger= cosin(Integer);
                printAnyString("THE COSIN IS : " + resultInteger);

        }
    }

    public static void printAnyString(String message) {
        System.out.println(message);
    }

    public static int sumNumbers(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }

    public static double cosin (int Integer ) {
        double resultInteger= Math.cos(Integer);
        return resultInteger;
    }
}