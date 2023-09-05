package variables;

import java.util.Scanner;

public class Chatbot {
    public static void main(String[] args) {
        
        Scanner scanner =  new Scanner(System.in);
        //See Learn the Part for the complete instructions. 

        
        //set up scanner. 

        System.out.println("Hello. What is your name? ");
        String name =  scanner.nextLine();
        //Pick up user's name and store it. 

        //add new a line before asking next question. 
        System.out.println("\nHi "+name+"! I'm Javabot. Where are you from?");
        //Pick up user's home and store it. 
        String loaction  =  scanner.nextLine();

        //add new a line before asking next question.
        System.out.println("\nI hear it's beautiful at "+loaction+"! I'm from a place called Oracle");
        System.out.println("\nHow old are you? ");
        //Pick up age and store it.
        int age =  scanner.nextInt();


        //add new a line before asking next question.
        System.out.println("\nSo you're "+age+", cool! I'm 400 years old.");
        System.out.println("\nThis means I'm "+((float)400 / age)+" times older than you.");
        System.out.println("\nEnough about me. What's your favourite language? (just don't say Python)");
        //Pick up language and store it. 
        scanner.nextLine();
        String lang =  scanner.nextLine();


        //add new a line here.
        System.out.println(lang+", that's great! Nice chatting with you "+name+". I have to log off now. See ya!");
        scanner.close();
        //close scanner. 

        
    }
}
