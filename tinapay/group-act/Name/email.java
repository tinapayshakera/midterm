package name;

public class Email {

    public static void main(String[] args) {
        
       System.out.println("Hi! see below my email account and follow me.");
        accounts acc = new accounts();
        
        acc.setemailUsername("slyiin");
        acc.setemailAddress("batalunaleslyj@gmail.com");
        
        System.out.println("Email Username: " + acc.getemailUsername());
        System.out.println("Email Address: " + acc.getemailAddress());
    }
    
}
