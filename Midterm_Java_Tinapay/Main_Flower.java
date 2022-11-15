import java.util.ArrayList;
import java.util.Scanner;
// import java.util.regex.Matcher;
// import java.util.regex.Pattern;

public class Main_Flower{

    public static void main (String[] args) {

        ArrayList<Flower> array = new ArrayList<Flower>();

        Scanner sc = new Scanner(System.in);

        // Scanner line = sc.nextLine();
        try{

        
        while (true) {
            System.out.println("--------------------HOMEPAGE--------------------");
            System.out.println("How many object you want to create? ");
            int how = sc.nextInt();

            // =============== exception ------------------
            if(how <= 0){
                throw new MainException("Negative number");
            }


            for(int i=0; i<how; i++){
            System.out.println("");
            System.out.println("");
            System.out.println("--------WELCOME TO FLOWER SYSTEM--------");
            System.out.println("1. Add Flowers");
            System.out.println("2. Delete Flower");
            System.out.println("3. Update Flowers");
            System.out.println("4. View all Flowers");
            System.out.println("5. Exit");
            System.out.println("Enter your choice:");
            int choice = sc.nextInt();
            System.out.println("-------------------------------------------");

            switch (choice) {
                case 1:
                    System.out.println("Add Flower");
                    addFlower(array);
                    

                    break;
                case 2:
                    System.out.println("Delete Flower");
                    deleteFlower(array);
                    break;
                case 3:
                    System.out.println("Update Flower");
                    updateFlower(array);
                    break;
                case 4:
                    System.out.println("View all Flowers");
                    findFlower(array);
                    break;
                case 5:
                    System.out.println("Thank you for using");
                    // break;
                    System.exit(0);
                default:
                    System.out.println("Re-output");
                    break;
                    
                 }
                }
            }
        }catch(MainException e){
            System.out.println(e.getMessage());
        }
    }
    

    public static void addFlower(ArrayList<Flower> array) {

        Scanner sc = new Scanner(System.in);

        String color;

        while (true) {
            System.out.println("What is the name of the flower ? ");
            color = sc.nextLine();
            boolean flag = isUsed(array, color);
            if (flag == false) {
                break;
            } else {
                System.out.println("------------------------------------------");
                System.out.println("Flower Duplicated! ");
            }
        }

        System.out.println("What color of the flower ? ");
        String name = sc.nextLine();



        System.out.println("What is the aroma of the flower ? ");
        String aroma = sc.nextLine();


        System.out.println("How many flower you want?");
        int digit = sc.nextInt();

        array.add(new Flower(name, color, aroma, digit));

        System.out.println("---------------------------------------------");
        System.out.println("Successfully added!");
        System.out.println();
    }

    public static void findFlower(ArrayList<Flower> array) {
        if (array.size() == 0) {
            System.out.println("");
            System.out.println("-------------------------------------------------");
            System.out.println("No information, please add information first!");

            return;
        }

        for (int i = 0; i < array.size(); i++) {
            Flower s = array.get(i);
            System.out.println("Flower:" + s.getName() +  "        Color:" + s.getcolor() + "       Aroma:" + s.getaroma() + "        Digit:" + s.getdigit());
        }
    }

    public static void deleteFlower(ArrayList<Flower> array) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the flower to be deleted:");
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
            System.out.println("---------------------------------------------");
            System.out.println("Item does not exist, please re-enter!");
            System.out.println();
        } else {
            array.remove(index);
        }

        System.out.println("---------------------------------------");
        System.out.println("Successfully deleted!");
        System.out.println();
    }

    public static void updateFlower(ArrayList<Flower> array) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the new flower to be updated:");
        String color = sc.nextLine();



        System.out.println("Enter the new color to be updated:");

        System.out.println("Enter the new aroma  to be updated:");
        String aroma = sc.nextLine();



            System.out.println("Enter the digit to be updated:");
            int digit = sc.nextInt();

        System.out.println("Which flower you want to update?");
        int flow = sc.nextInt();
       
        array.set(flow, new Flower( name, color, aroma, digit));

       
       
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