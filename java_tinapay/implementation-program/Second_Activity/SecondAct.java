import javax.swing.plaf.SplitPaneUI;
import java.util.Scanner;

public class SecondAct {
    public static void main(String[] args) {

        Student st = new Student();

        st.setName("Richel Bacayan");
        st.setEmail("richelbacayan@gmail.com");
        System.out.println("=============================");
        st.setName("Jovanie Dasian");
        st.setEmail("jovaniesdasian@gmail.com");
        System.out.println("=============================");
        st.setName("Jo-ann Bernadez");
        st.setEmail("jo-annbernadez@gmail.com");
        System.out.println("=============================");
        st.setName("Michelle Maglapus");
        st.setEmail("michellemaglapusgmail.com");
        System.out.println("=============================");
        st.setName("Lesly Bataluna");
        st.setEmail("leslybataluna@gmail.com");
        System.out.println("=============================");
        System.out.println(st.getName());
        System.out.println(st.getEmail());

     
    }
}
