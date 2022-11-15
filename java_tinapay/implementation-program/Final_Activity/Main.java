import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Person> al = new ArrayList<Person>();

        // int limit = 10;

        System.out.println("");

        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter how many person you will input:");
        int count = sc1.nextInt();

        try {

            if (count > 5) {
                boolean y;
                while (y = true) {
                    System.out.println("You're out of bound:");
                    System.out.println("wanna try again?");
                    String yes = sc.next();
                    if (yes == "yes") {
                        y = true;
                        return;
                    } else {
                        y = false;
                        break;
                    }
                }

            } else {

                int choice = -1;

                boolean f;

                while (f = true) {
                    System.out.println("------------------------------------");
                    System.out.println("1. Input:");
                    System.out.println("2.Display");
                    System.out.println("3.Exit");
                    System.out.println("------------------------------------");
                    System.out.println("Enter your choice:");

                    choice = sc.nextInt();

                    // switch (choice ) {
                    if (choice == 1) {
                        System.out.println("Name:");
                        String name = sc1.next();
                        System.out.println("Age:");
                        int age = sc.nextInt();
                        al.add(new Person(name, age));
                    }

                    else if (choice == 2) {

                        System.out.println("------------------------------------");
                        System.out.println("The first is Nme and secpond is age: " + al);
                        System.out.println("------------------------------------");
                    } else if (choice == 3) {

                        f = false;
                        break;

                    } else if (choice >= 4) {

                        System.out.println("Out of bound try to input another number!");
                        System.out.println("");
                    } else if (choice == 0) {
                        System.out.println("Out of bound try to input another number!");
                        System.out.println("");
                    }
                }

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

    }
}
