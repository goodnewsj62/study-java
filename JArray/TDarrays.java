import java.util.Arrays;

public class TDarrays {
    public static void main(String[] args) {
        int[][] grades =  new int[3][4];
        grades[0][0] =  72; 
        grades[0][1] =  73; 
        grades[0][2] =  78; 
        System.out.println("\tHarry: " +  Arrays.toString(grades[0]));
        System.out.println("\tRon: " +  Arrays.toString(grades[1]));
        System.out.println("\tHermione: " +  Arrays.toString(grades[2]));

        String[][] table =  new String[3][3];
        System.out.println(table[0]);
        System.out.println(grades[0]);

        int[] table_  =  {1,2,3};
        System.out.println(table_[0]);

    }
}
