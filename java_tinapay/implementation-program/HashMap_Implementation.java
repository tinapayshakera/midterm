import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class HashMap_Implementation {

   public static void main(String args[]) {

      Scanner input = new Scanner(System.in);

      Character choice, clear;

      Map<Integer, Integer> hashmap = new HashMap<Integer, Integer>();

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
         System.out.println("*********************************");

         switch (choice) {

            case '1':
               System.out.println("");
               System.out.println("");
               System.out.println("");
               System.out.println("Composite numbers:");
               System.out.println("Enter number:");
               System.out.println("*********************************");
               int add = input.nextInt();
               System.out.println("*********************************");
               System.out.println("");
               System.out.println("");

               int x = add / 2;
               int isPrime = 0;

               if (add == 0 || add == 1) {
                  System.out.println("");
                  System.out.println("");
                  System.out.println("Enter number to add:");
                  System.out.println("*********************************");
                  int key = input.nextInt();
                  System.out.println("*********************************");
                  System.out.println("");
                  System.out.println("");

                  hashmap.put(key, add);
                  System.out.println("");
                  System.out.println("");
                  System.out.println("*********************************");
                  System.out.println(key + " => " + add + " added to HashMap");
                  System.out.println("*********************************");
                  System.out.println("");
                  System.out.println("");

               }

               else {
                  for (int a = 2; a <= x; a++) {
                     if (add % a == 0) {
                        System.out.println("");
                        System.out.println("");
                        System.out.println("Enter number to add:");
                        System.out.println("*********************************");
                        int key = input.nextInt();
                        System.out.println("*********************************");
                        System.out.println("");
                        System.out.println("");

                        hashmap.put(key, add);
                        System.out.println("");
                        System.out.println("");
                        System.out.println("*********************************");
                        System.out.println(key + " => " + add + " added to HashMap");
                        System.out.println("*********************************");
                        System.out.println("");
                        System.out.println("");

                        isPrime = 1;
                        break;
                     }
                  }
                  if (isPrime == 0) {
                     System.out.println("");
                     System.out.println("");
                     System.out.println("***************************************************");
                     System.out.println("Integer is prime number. Not added to HashMap.");
                     System.out.println("***************************************************");
                     System.out.println("");
                     System.out.println("");

                  }
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

               if (hashmap.containsKey(remove)) {
                  System.out.println("");
                  System.out.println("");
                  System.out.println("*********************************");
                  System.out.println(remove + " => " + hashmap.get(remove) + " Removed!");
                  System.out.println("*********************************");
                  System.out.println("");
                  System.out.println("");

                  hashmap.remove(remove);

               }
               break;

            case '3':
               System.out.println("");
               System.out.println("");
               System.out.println("Display HashMap:");
               System.out.println("*********************************");
               System.out.println("");
               System.out.println("");

               hashmap.entrySet().forEach(entry -> {
                  System.out.println(entry.getKey() + " => " + entry.getValue());
               });

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
                     hashmap.clear();
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
                     System.out.println("HashMap not cleared!");
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
               System.out.println("Invalid!");
               System.out.println("*********************************");
               System.out.println("");
               System.out.println("");

         }

      }

   }
}
