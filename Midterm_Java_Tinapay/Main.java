import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        // Character choice; 
        List<Person> al = new ArrayList<Person>();

        System.out.println("");

        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        

        System.out.println("------------------------------------");
        System.out.println("A. Add Person:");
        System.out.println("B. Remove Person");
        System.out.println("C. Display Person");
        System.out.println("X. Exit");
        System.out.println("------------------------------------");
        System.out.println("Enter your choice:");
        // choice = input.next().charAt(0);
        int choice = sc.nextInt();

        while (true){

            if (choice == 1) {
                System.out.println("Name:");
                String name = sc.next();
                System.out.println("Address:");
                String address = sc.next();
                System.out.println("Age:");
                int age = sc.nextInt();
                al.add(new Person(name, address, age));
                
            } 
            continue;

           
        
        }
    }
}
