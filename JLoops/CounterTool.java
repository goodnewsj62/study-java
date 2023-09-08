import java.util.Scanner;

public class CounterTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("I hear you like to count by threes\n");
        System.out.println("Jimmy: It depends.");
        System.out.println("Oh, ok...");

       // See detailed instructions on Learn the Part.
        System.out.print("Pick a number to count by:  ");
        int countBy =  scan.nextInt();
        System.out.print("\n Pick  a number to count from:  ");
        int countFrom =  scan.nextInt();
        System.out.print("\nPick  a number to count to:  ");
        int countTo =  scan.nextInt();
        scan.close();

        for(; countFrom < (countTo +  1); countFrom += countBy){
            System.out.print( countFrom + " ");
        }

        
    }
}
