import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Flower> array = new ArrayList<Flower>();

        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        int digit = sc.nextInt();
        
        while (true) {

            System.out.println("--------Welcome to the Flower manaromament system--------");
            System.out.println("1. Add Flowers");
            System.out.println("2. Delete Flower");
            System.out.println("3. Update Flowers");
            System.out.println("4. View all Flowers");
            System.out.println("5. Exit");
            System.out.println("Enter your choice:");

            switch (line) {
                case "1":
                    System.out.println("Add Flower");
                    addFlower(array);

                    break;
                case "2":
                    System.out.println("Delete Flower");
                    deleteFlower(array);
                    break;
                case "3":
                    System.out.println("Update Flower");
                    updateFlower(array);
                    break;
                case "4":
                    System.out.println("View all Flowers");
                    findFlower(array);
                    break;
                case "5":
                    System.out.println("Thank you for using");
                    // break;
                    System.exit(0);
                default:
                    System.out.println("Re-output");
                    break;
            }
        }
    }

    public static void addFlower(ArrayList<Flower> array) {

        Scanner sc = new Scanner(System.in);

        String color;

        while (true) {
            System.out.println("Enter Flower:");
            color = sc.nextLine();
            boolean flag = isUsed(array, color);
            if (flag == false) {
                break;
            } else {
                System.out.println("Duplicate Flower, re-enter");
            }
            sc.close();
        }

        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter aroma: ");
        String aroma = sc.nextLine();
        System.out.println("Enter the digit:");
        int digit = sc.nextInt();

        Flower s1 = new Flower();
        s1.setName(name);
        s1.setcolor(color);
        s1.setaroma(aroma);
        s1.setdigit(digit);

        array.add(s1);

        System.out.println("Successfully added Flowers");

    }

    public static void findFlower(ArrayList<Flower> array) {
        if (array.size() == 0) {
            System.out.println("No information, please add information first!");

            return;
        }

        for (int i = 0; i < array.size(); i++) {
            Flower s = array.get(i);
            System.out.println("Flower name  \t\tcolor\t\t\taroma\t\t\t digit");
            System.out.println(s.getName() + "\t\t\t" + s.getcolor() + "\t\t\t" + s.getaroma() + "\t\t\t" + s.getdigit());
        }
    }

    public static void deleteFlower(ArrayList<Flower> array) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of the flower to be deleted:");
        String color = sc.nextLine();

        int index = -1;
        for (int i = 0; i < array.size(); i++) {
            Flower s = array.get(i);
            if (s.getcolor().equals(color)) {
                index = i;
                break;
            }

        }
        if (index == -1) {
            System.out.println("Item does not exist, please re-enter!");
        } else {
            array.remove(index);
        }

        System.out.println("Successfully deleted!");
        sc.close();
    }

    public static void updateFlower(ArrayList<Flower> array) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the flower you want to modify:");
        String color = sc.nextLine();
        System.out.println("Enter the name of the Flower to be modified:");
        String name = sc.nextLine();
        System.out.println("Enter the aroma of the Flower to be modified:");
        String aroma = sc.nextLine();
        System.out.println("Enter the digit of the Flower to be modified:");
        int digit = sc.nextInt();

        Flower s = new Flower();
        s.setName(name);
        s.setcolor(color);
        s.setaroma(aroma);
        s.setdigit(digit);

        int index = -1;

        for (int i = 0; i < array.size(); i++) {
            Flower Flower = array.get(i);
            if (Flower.getcolor().equals(color)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Information does not exist, please re-enter!");
        } else {
            array.set(index, s);

            System.out.println("Modify information successfully!");
        }
        sc.close();
    }

    public static boolean isUsed(ArrayList<Flower> array, String color) {
        boolean flag = false;

        for (int i = 0; i < array.size(); i++) {
            Flower Flower = array.get(i);
            if (Flower.getcolor().equals(color)) {
                flag = true;
                break;
            }
        }

        return flag;

    }
}
