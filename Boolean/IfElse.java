public class IfElse {

    public static void main(String[] args) {

        int chemistryGrade = 95;
        int biologyGrade = 75;
        System.out.println("Me: Hi Java, did I score better in biology?");
        // Add if-else statement here
        if(chemistryGrade <  biologyGrade){
            System.out.println("Yes you did");
        }else{
            System.out.println("Yes you did'nt");
        }   

        double sales = 37.55;
        double costs = 5.55;
        System.out.println("\nMe: Hi Java, did we make money?");
        // Add if-else statement here
        if(sales > costs){
            System.out.println("You are rich man!");
        }else{
            System.out.println("Opps no you didn't");
        }

        double temperature = 15.5;
        double targetTemperature = 20.0;
        System.out.println("\nMe: Hi Java, is the temperature colder than our target?");
        // Add if-else statement here
        if(temperature < targetTemperature){
            System.out.println("Yes it is ");
        }else{
            System.out.println("Nah environ is hotter than target");
        }

        int currentSpeed = 60;
        int speedLimit = 70;
        System.out.println("\nMe: Hi Java, am I driving slower than the speed limit?");
        // Add if-else statement here
        if(currentSpeed <  speedLimit){
            System.out.println("Yes you de ");
        }

        int age = 45;
        int retirementAge = 65;
        System.out.println("\nMe: Hi Java, am I old enough to retire?");
        // Add if-else statement here
        if(age >=  retirementAge){
            System.out.println("Yes you are boss");
        }else{
            System.out.println("You cant right now you are not up to");
        }

        char myGrade = 'A';
        char bestGrade = 'A';
        System.out.println("\nMe: Hi Java, did I get the best possible grade?");
        // Add if-else statement here
        if(myGrade == bestGrade){
            System.out.println("congrat you got the high score");
        }else{
            System.out.println("No you did not get it sweetheart");
        }

        String word = "hello";
        String secondWord = "hello";
        System.out.println("\nMe: Are the two words the same?");
        // Add if-else statement here
        if(word.equals(secondWord)){
            System.out.println("Yeah they are same");
        }else{
            System.out.println("No they are not same ");
        }

        String thirdWord = "hello";
        String fourthWord = "goodbye";
        System.out.println("\nMe: Are the two words different");
        // Add if-else statement here
        if(thirdWord.equals(fourthWord)){
            System.out.println("Yes they are the same");
        }else{
            System.out.println("No they are not");
        }
    }
}
