import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Implementation {

   public static void main(String args[]) {

      Scanner input = new Scanner(System.in);

      Character choice, clear;

      Set<Integer> hashset = new HashSet<Integer>();

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

         switch (choice)

         {
            case '1':
               System.out.println("");
               System.out.println("");
               System.out.println("Add numbers:");
               System.out.println("*********************************");
               int add = input.nextInt();
               System.out.println("*********************************");

               System.out.println("");
               System.out.println("");

               if (hashset.contains(add)) {
                  System.out.println("");
                  System.out.println("");
                  System.out.println("Already exists!");
                  System.out.println("*********************************");
                  System.out.println("");
                  System.out.println("");

               }

               else {
                  hashset.add(add);
                  System.out.println("");
                  System.out.println("");
                  System.out.println("Number " + add + " added");
                  System.out.println("*********************************");
                  System.out.println("");
                  System.out.println("");

               }
               break;

            case '2':
               System.out.println("");
               System.out.println("");
               System.out.println("Number to remove:");
               System.out.println("*********************************");
               int remove = input.nextInt();
               System.out.println("*********************************");
               System.out.println("");
               System.out.println("");

               if (hashset.contains(remove)) {
                  hashset.remove(Integer.valueOf(remove));
                  System.out.println("");
                  System.out.println("");
                  System.out.println("Number " + remove + " removed!");
                  System.out.println("*********************************");
                  System.out.println("");
                  System.out.println("");
                  break;
               }
               break;

            case '3':
               System.out.println("");
               System.out.println("");
               System.out.println("Displaying HashSet:");
               System.out.println("*********************************");

               Iterator<Integer> it_set = hashset.iterator();
               while (it_set.hasNext()) {
                  System.out.println(it_set.next());
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
               clear = input.next().charAt(0);
               System.out.println("");
               System.out.println("");

               switch (clear) {
                  case 'y':
                     System.out.println("");
                     System.out.println("");
                     System.out.println("Clear!!!");
                     hashset.clear();
                     System.out.println("");
                     System.out.println("*********************************");
                     System.out.println("All cleared!");
                     System.out.println("");
                     System.out.println("*********************************");
                     System.out.println("");
                     System.out.println("");
                     break;

                  case 'n':
                     System.out.println("");
                     System.out.println("");
                     System.out.println("HashSet not cleared!");
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
               System.out.println("Invalid! Input the right choice!");
               System.out.println("*********************************");
               System.out.println("");
               System.out.println("");
         }

      }

   }
}
