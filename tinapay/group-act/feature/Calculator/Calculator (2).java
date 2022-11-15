package calculator;
import java.util.Scanner;

public class display; {
    public static void main(String[]args) {
        double num1, num2;
        char operator;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the operator(+, /): ");
        operator = input.next().charAt(0);

        System.out.print("Enter first number: ");
        num1 = input.nextDouble();
        System.out.print("Enter second number: ");
        num2 = input.nextDouble();

        input.close();  

        switch( operator ){
            case '+':
                System.out.println(addition.add(num1, num2));
                break;
            case '/':
                System.out.println(division.divide(num1, num2));
                break;
        }
    }
}