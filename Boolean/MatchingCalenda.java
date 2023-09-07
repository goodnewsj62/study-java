import java.util.Scanner;

public class MatchingCalenda {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);

        System.out.println("\n****ROYAL BANK OF JAVA****");
        System.out.println("\nAre you here to get a mortgage? (yes or no)");
        String reply =  scan.nextLine();

        if(reply.equals("yes")){
            System.out.println("\\n" + //
                    "Great! In one line\" +\n" + //
                    "                 \"\\n" + //
                    "How much money do you have in your savings?\" +\n" + //
                    "                 \"\\n" + //
                    "And, how much do you owe in credit card debt?\n");
            double savings = scan.nextDouble();
            double debt =  scan.nextDouble();

            System.out.println("\n How many years have you worked for? ");
            int years =  scan.nextInt();

            System.out.println("\nWhat is your name? ");
            scan.nextLine();
            String name =  scan.nextLine();

            if(savings >= 10_000 && debt < 5000 && years > 2){
                System.out.println("Congratulation " +  name + ", you have been approved!");
            }else{
                System.out.println("Sorry, you are not eligible for a mortgage.");
            }
            
        }else{
            System.out.println("\nOk. Have a nice day");
        }

        scan.close();

    }
}
