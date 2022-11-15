import java.util.Scanner;
import java.util.nextInt;
public class Main {

    public static void main(String[] args){
        String a[] = {"Jovanie","Richel","Jo-ann","Michelle","Lesly"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index of the name: ");
        int choice = sc.nextInt();

        try {
            if(choice <0 || choice >2){
                sc.close();
                throw new Exception();
            }   else{
                System.out.println(a[choice]);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
