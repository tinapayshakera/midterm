import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class ArrayList_Implementation {

   public static void main(String args[]) {

      Scanner input = new Scanner(System.in);

      Character choice, clear;

      List<Integer> arraylist = new ArrayList<Integer>();

      while (true)

      {
         System.out.println("");
         System.out.println("********************************");
         System.out.println("********************************");
         System.out.println("**    Choose operation:       **");
         System.out.println("**                            **");
         System.out.println("**   1. Add numbers:          **");
         System.out.println("**   2. Remove numbers:       **");
         System.out.println("**   3. Display numbers:      **");
         System.out.println("**   4. Clear numbers:        **");
         System.out.println("**   5. Exit                  **");
         System.out.println("**                            **");
         System.out.println("********************************");
         System.out.println("********************************");
         System.out.println("");
         System.out.println("");
         System.out.println("Choice:");
         System.out.println("*********************************");
         choice = input.next().charAt(0);
         System.out.println("");
         System.out.println("");

         switch (choice) {

            case '1':
               System.out.println("");
               System.out.println("");
               System.out.println("Add numbers:");
               System.out.println("*********************************");
               int add = input.nextInt();
               System.out.println("");
               System.out.println("");

               if (add > 0) {
                  arraylist.add(add);
                  System.out.println("");
                  System.out.println("");
                  System.out.println("*********************************");
                  System.out.println("number " + add + " added to arraylist!");
                  System.out.println("*********************************");
                  System.out.println("");
                  System.out.println("");
                  break;

               }

               else {
                  System.out.println("");
                  System.out.println("");
                  System.out.println("*********************************");
                  System.out.println("Invalid!");
                  System.out.println("*********************************");
                  System.out.println("");
                  System.out.println("");
                  break;
               }

            case '2':
               System.out.println("");
               System.out.println("");
               System.out.println("*********************************");
               System.out.println("Enter number to remove:");
               System.out.println("*********************************");
               int remove = input.nextInt();
               System.out.println("");
               System.out.println("");

               if (arraylist.contains(remove)) {
                  arraylist.remove(Integer.valueOf(remove));
                  System.out.println("");
                  System.out.println("");
                  System.out.println("*********************************");
                  System.out.println("number " + remove + " already removed!");
                  System.out.println("*********************************");
                  System.out.println("");
                  System.out.println("");
                  break;
               }

            case '3':
               System.out.println("");
               System.out.println("");
               System.out.println("Display Arraylist:");
               System.out.println("*********************************");
               for (Integer number : arraylist) {
                  System.out.println(number);
               }
               System.out.println("*********************************");
               System.out.println("");
               System.out.println("");
               break;

            case '4':
               System.out.println("");
               System.out.println("");
               System.out.println("Do you want to clear this?(y/n):");
               System.out.println("*********************************");
               System.out.println("");
               System.out.println("");
               clear = input.next().charAt(0);

               switch (clear) {

                  case 'y':
                     System.out.println("");
                     System.out.println("");
                     System.out.println("Clear!!!");
                     System.out.println("*********************************");
                     arraylist.clear();
                     System.out.println("");
                     System.out.println("*********************************");
                     System.out.println("All cleared!");
                     System.out.println("*********************************");
                     System.out.println("");
                     System.out.println("");
                     break;

                  case 'n':
                     System.out.println("");
                     System.out.println("");
                     System.out.println("*********************************");
                     System.out.println("ArrayList not cleared!");
                     System.out.println("*********************************");
                     System.out.println("");
                     System.out.println("");
                     break;
               }
               break;

            case '5':
               input.close();
               System.exit(0);

            default:
               System.out.println("");
               System.out.println("");
               System.out.println("*********************************");
               System.out.println("Invalid!");
               System.out.println("*********************************");
               System.out.println("");
               System.out.println("");
         }

      }

   }
}
